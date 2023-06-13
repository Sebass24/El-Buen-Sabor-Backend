package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.User;
import com.example.buensabor.Services.Impl.Auth0Service;
import com.example.buensabor.Services.Impl.UserServiceImpl;
import com.example.buensabor.Services.Mappers.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/user")
public class UserController extends BaseControllerImpl<User, UserServiceImpl>{

    private UserMapper userMapper;
    private Auth0Service auth0Service;
    public UserController(UserServiceImpl service, UserMapper userMapper, Auth0Service auth0Service) {
        super(service);
        this.userMapper = userMapper;
        this.auth0Service = auth0Service;
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAllActive(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAllActive().stream().map(userMapper).collect(Collectors.toList()));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @Override
    @GetMapping("all")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody User entity){
        try {
            if(entity.getRole() != null)
                auth0Service.assignRoleToUser(entity.getAuth0Id(),entity.getRole().getAuth0RoleId());

            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<?> createAsAdmin(@RequestBody User entity){
        try {

            if(entity != null)
                entity = auth0Service.createAuth0User(entity);

            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<?> deleteAsAdmin(@PathVariable String id){
        try {
            User user = service.getUserByAuth0Id(id);
            if (user != null) {
                service.delete(user.getId());
                auth0Service.deleteAuth0User(id);
            }else
                throw new Exception("No existe el usuario");
            return ResponseEntity.status(HttpStatus.OK).body("{\"mensaje\":\"Eliminado Correctamente\"}");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("addresses/{id}")
    public ResponseEntity<?> getAddresses(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getUserAddresses(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("phones/{id}")
    public ResponseEntity<?> getPhones(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getUserPhones(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
    @GetMapping("getTop5UsersActual")
    public ResponseEntity<?> getTop5Users(@RequestParam int limit,@RequestParam String orderBy){
        try {
            if (orderBy.equals("orders")){
                 return ResponseEntity.status(HttpStatus.OK).body(service.getTop5UsersOrders(limit));
            }
            if (orderBy.equals("price")){
                return ResponseEntity.status(HttpStatus.OK).body(service.getTop5UsersPrice(limit));
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"el order by no es ni orden ni precio. Por favor intente luego\"}");

        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
    @GetMapping("getTopUsersByOrderDateRange")
    public ResponseEntity<?> getTopUsersByOrderDateRange(@RequestParam Date startDate,@RequestParam Date endDate, @RequestParam int limit,@RequestParam String orderBy){
        try {
            if (orderBy.equals("price")){
                return ResponseEntity.status(HttpStatus.OK).body(service.getUsersWithMostPrice(startDate,endDate,limit));
            }
            if (orderBy.equals("orders")) {
                return ResponseEntity.status(HttpStatus.OK).body(service.getUsersWithMostOrders(startDate,endDate,limit));
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"el order by no es ni orden ni precio. Por favor intente luego\"}");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("auth0/{id}")
    public ResponseEntity<?> getUserByAuth0Id(@PathVariable String id){
        try {
            User user = service.getUserByAuth0Id(id);
            if (user != null) {
                return ResponseEntity.status(HttpStatus.OK).body(user);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(new User());
            }
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

}
