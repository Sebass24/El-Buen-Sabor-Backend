package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Repositories.BillRepository;
import com.example.buensabor.Services.BillService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl extends BaseServiceImpl<Bill,Long> implements BillService {

    private BillRepository billRepository;

    public BillServiceImpl(BillRepository billRepository) {
        super(billRepository);
        this.billRepository = billRepository;
    }

    @Override
    public String generateBill(Bill bill) {
        return null;
    }

    @Override
    public List<Object> getBillingStatisticsCost(Date startDate, Date endDate) {
        return billRepository.getBillingStatisticsCosts(startDate,endDate);
    }
    @Override
    public List<Object> getBillingStatisticsRevenue(Date startDate, Date endDate) {
        return billRepository.getBillingStatistics(startDate,endDate);
    }
}
