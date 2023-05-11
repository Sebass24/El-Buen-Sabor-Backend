package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Services.Impl.BillServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/bill")
public class BillController extends BaseControllerImpl<Bill, BillServiceImpl>{

    public BillController(BillServiceImpl service) {
        super(service);
    }


}
