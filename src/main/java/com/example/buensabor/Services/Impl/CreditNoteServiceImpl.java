package com.example.buensabor.Services.Impl;

import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Models.Entity.CreditNote;
import com.example.buensabor.Models.Entity.Order;
import com.example.buensabor.Repositories.CreditNoteRepository;
import com.example.buensabor.Services.CreditNoteService;
import com.example.buensabor.Services.PdfService.BillGenerator;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.File;

@Service
public class CreditNoteServiceImpl extends BaseServiceImpl<CreditNote,Long> implements CreditNoteService {

    private CreditNoteRepository creditNoteRepository;
    private BillServiceImpl billService;

    public CreditNoteServiceImpl(CreditNoteRepository creditNoteRepository, BillServiceImpl billService) {
        super(creditNoteRepository);
        this.creditNoteRepository = creditNoteRepository;
        this.billService = billService;
    }

    public ByteArrayOutputStream generateCreditNoteByOrderId(long id) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            Bill bill = billService.findById(id);
            Order order = bill.getOrder();

            if (!bill.isCancelled())
                return null;

            BillGenerator b = new BillGenerator();

            b.SetBillingHeaderTitle("Nota Credito Buen Sabor");

            String logoPath = new File("").getAbsolutePath() + "/src/main/resources/Imges/logo/BuenSaborLogo.jpeg";
            b.SetBillingLogoFilename(logoPath);
            b.SetBillingLogoResizeMethod(BillGenerator.LOGO_RESIZE_METHOD.Percent);
            b.SetBillingLogoScalingPercent(50);

            b.SetDiscount(String.valueOf(order.getDiscount()));
            order.getOrderDetails().forEach(orderDetail ->
                    b.AddBillingEntry(orderDetail.getProduct().getName(),
                            String.valueOf(orderDetail.getQuantity()),
                            String.valueOf(orderDetail.getProduct().getSellPrice())));

            b.SetCustomerEmail(order.getUser().getUserEmail());
            b.SetCustomerName(order.getUser().getName() + " " +order.getUser().getLastName());
            b.SetBillingIdentifier("Order_" + order.getId());

            baos = b.GenerateDocument();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return baos;
    }

}
