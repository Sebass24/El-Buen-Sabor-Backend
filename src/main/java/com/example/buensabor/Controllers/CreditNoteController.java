package com.example.buensabor.Controllers;


import com.example.buensabor.Models.Entity.CreditNote;
import com.example.buensabor.Services.Impl.CreditNoteServiceImpl;
import com.example.buensabor.Util.Util;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/credit-note")
public class CreditNoteController extends BaseControllerImpl<CreditNote, CreditNoteServiceImpl>{

    public CreditNoteController(CreditNoteServiceImpl service) {
        super(service);
    }


    @GetMapping("/download-credit-note/{id}")
    public ResponseEntity<byte[]> downloadBillByOrderId(HttpServletResponse response, @PathVariable Long id) throws IOException {

        ByteArrayOutputStream baos = service.generateCreditNoteByOrderId(id);
        if(baos == null)
            ResponseEntity.notFound();
        try{
            Document document = new Document();
            PdfWriter.getInstance(document, baos);

            // Configurar encabezados de respuesta
            response.setContentType(MediaType.APPLICATION_PDF_VALUE);
            response.setHeader("Content-Disposition", "attachment; filename=nota-credito.pdf");
            response.setContentLength(baos.size());

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        finally {
            Util.deleteTemp();
        }
        return ResponseEntity.ok().body(baos.toByteArray());
    }
}
