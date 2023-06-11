package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Services.Email.MailService;
import com.example.buensabor.Services.Impl.BillServiceImpl;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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

    @GetMapping("GetBillingStatisticsCosts")
    public ResponseEntity<?> GetBillingStatistics(@RequestParam(required = false)@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @RequestParam(required = false)@DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getBillingStatisticsCost(startDate,endDate));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    @GetMapping("GetBillingStatisticsRevenue")
    public ResponseEntity<?> GetBillingStatisticsRevenue(@RequestParam(required = false)@DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @RequestParam(required = false)@DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.getBillingStatisticsRevenue(startDate,endDate));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }
}
