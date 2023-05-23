package com.example.buensabor.Services.MailService;

import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Attachments;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Service
public class MailService {
    @Value("${sendgrid.api.key}")
    private String sendGridApiKey;
    @Value("${sendgrid.sender}")
    private String sender;

    public void sendEmail(String to, String subject, String content, String attachmentPath) {
        Email from = new Email(sender);
        Email toEmail = new Email(to);
        Content messageContent = new Content("text/plain", content);
        Mail mail = new Mail(from, subject, toEmail, messageContent);

        SendGrid sg = new SendGrid(sendGridApiKey);
        Request request = new Request();

        try {
            if (attachmentPath != null) {
                Attachments attachments = new Attachments();
                attachments.setFilename("attachment.txt");
                attachments.setType("text/plain");
                attachments.setDisposition("attachment");
                attachments.setContent(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(attachmentPath))));
                mail.addAttachments(attachments);
            }

            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());

            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
