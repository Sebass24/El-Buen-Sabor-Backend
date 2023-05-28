package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Services.Email.MailService;
import com.example.buensabor.Services.Impl.BillServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/bill")
public class BillController extends BaseControllerImpl<Bill, BillServiceImpl>{

    private MailService mailService;
    public BillController(BillServiceImpl service, MailService mailService) {
        super(service);
        this.mailService = mailService;
    }

    @GetMapping("testemail")
    public ResponseEntity<?> sendTestEmail(){
        try {
            mailService.testEmail();
            return ResponseEntity.status(HttpStatus.OK).body("{\"mensaje\":\"Email sent\"}");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
