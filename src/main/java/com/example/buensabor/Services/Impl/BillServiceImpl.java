package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Repositories.BillRepository;
import com.example.buensabor.Services.BillService;
import com.example.buensabor.Services.PdfService.BillGenerator;
import com.itextpdf.text.DocumentException;
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


        //create the billing
        BillGenerator b = new BillGenerator();

        //Set the billing title
        b.SetBillingHeaderTitle("My Billing");

        //Set the billing logo
        b.SetBillingLogoFilename("/path/to/logo/image");
        b.SetBillingLogoResizeMethod(BillGenerator.LOGO_RESIZE_METHOD.Percent);
        b.SetBillingLogoScalingPercent(50);

        //Add entries to billing
        b.AddBillingEntry("2015-3-25", "Canon PowerShot SX520", "1", "199$");
        b.AddBillingEntry("2015-2-1", "Samsung Galaxy S6", "1", "299$");
        b.AddBillingEntry("2015-2-1", "Fender Mini Tone Master", "1", "34$");
        b.AddBillingEntry("2014-12-20", "Sennheiser HD 598 Over-Ear Headphones", "1", "149$");
        b.AddBillingEntry("2015-12-17", "Samsung 850 EVO 250GB", "1", "106$");

        //Set the customer data
        b.SetCustomerEmail("my.self@the_mail.com");
        b.SetCustomerName("John Doe");
        b.SetBillingIdentifier("126438");

        //Generate the billing
        try
        {
            b.GenerateDocument();
        } catch (DocumentException ex) { }

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
