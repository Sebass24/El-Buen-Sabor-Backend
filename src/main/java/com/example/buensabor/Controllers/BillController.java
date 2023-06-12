package com.example.buensabor.Controllers;

import java.io.ByteArrayOutputStream;
import com.example.buensabor.Models.Entity.Bill;
import com.example.buensabor.Services.Email.MailService;
import com.example.buensabor.Services.Impl.BillServiceImpl;
import com.example.buensabor.Services.PdfService.BillGenerator;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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

//    @GetMapping("testbill")
//    public ResponseEntity<?> createBill(){
//        try {
//            billGeneratorService.GenerateBill();
//            return ResponseEntity.status(HttpStatus.OK).body("{\"mensaje\":\"imagen generada\"}");
//        }
//        catch (Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente luego\"}");
//        }
//    }
//
//    @GetMapping("/download-bill")
//    public ResponseEntity<byte[]> descargarPDF(HttpServletResponse response) throws IOException {
//        ByteArrayOutputStream baos = billGeneratorService.GenerateDownloadableBill();
//
//        // Configurar encabezados de respuesta
//        response.setContentType(MediaType.APPLICATION_PDF_VALUE);
//        response.setHeader("Content-Disposition", "attachment; filename=archivo.pdf");
//        response.setContentLength(baos.size());
//
//        return ResponseEntity.ok().body(baos.toByteArray());
//    }
}
