package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Repositories.BillRepository;
import com.example.buensabor.Services.BillService;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl extends BaseServiceImpl<Bill,Long> implements BillService {

    private BillRepository billRepository;

    public BillServiceImpl(BillRepository billRepository) {
        super(billRepository);
        this.billRepository = billRepository;
    }

}
