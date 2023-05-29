package com.example.buensabor.Controllers;

import com.example.buensabor.Models.Entity.Image;
import com.example.buensabor.Services.Impl.ImageServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/image")
public class ImageController extends BaseControllerImpl<Image, ImageServiceImpl>{

    public ImageController(ImageServiceImpl service) {
        super(service);
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file){

        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(file));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Al cargar imagen\"}");
        }


    }


}
