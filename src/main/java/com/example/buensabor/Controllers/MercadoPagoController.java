package com.example.buensabor.Controllers;


import com.example.buensabor.Models.MercadoPago.MpItem;
import com.mercadopago.client.preference.PreferenceClient;
import com.mercadopago.client.preference.PreferenceItemRequest;
import com.mercadopago.client.preference.PreferenceRequest;
import com.mercadopago.client.preference.PreferenceTrackRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.preference.Preference;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/mercadopago")

    public class MercadoPagoController {

        @PostMapping("/createAndRedirect")
        public ResponseEntity<?> createAndRedirect(@RequestBody MpItem mpItem) throws MPException, MPApiException, InterruptedException {
            PreferenceClient client = new PreferenceClient();

            List<PreferenceItemRequest> items = new ArrayList<>();

            PreferenceItemRequest item =
                    PreferenceItemRequest.builder()
                            .id(mpItem.getCode())
                            .title(mpItem.getTitle())
                            .description(mpItem.getDescription())
                            .quantity(1)
                            .currencyId("ARS")
                            .unitPrice(new BigDecimal(mpItem.getPrice()))
                            .build();
            items.add(item);

//            List<PreferenceTrackRequest> tracks = new ArrayList<>();
//            PreferenceTrackRequest googleTrack = PreferenceTrackRequest.builder().type("google_ad").build();
//
//            tracks.add(googleTrack);

            PreferenceRequest request = PreferenceRequest.builder().items(items).build();

            Preference p = client.create(request);

            String prefId = p.getId();

            return ResponseEntity.status(HttpStatus.OK).body("{\"preferenceId\":\""+prefId+"\"}");
        }

        @GetMapping("/generic")
        public RedirectView success(
                HttpServletRequest request,
                @RequestParam("collection_id") String collectionId,
                @RequestParam("collection_status") String collectionStatus,
                @RequestParam("external_reference") String externalReference,
                @RequestParam("payment_type") String paymentType,
                @RequestParam("merchant_order_id") String merchantOrderId,
                @RequestParam("preference_id") String preferenceId,
                @RequestParam("site_id") String siteId,
                @RequestParam("processing_mode") String processingMode,
                @RequestParam("merchant_account_id") String merchantAccountId,
                RedirectAttributes attributes)
                throws MPException {

            attributes.addFlashAttribute("genericResponse", true);
            attributes.addFlashAttribute("collection_id", collectionId);
            attributes.addFlashAttribute("collection_status", collectionStatus);
            attributes.addFlashAttribute("external_reference", externalReference);
            attributes.addFlashAttribute("payment_type", paymentType);
            attributes.addFlashAttribute("merchant_order_id", merchantOrderId);
            attributes.addFlashAttribute("preference_id",preferenceId);
            attributes.addFlashAttribute("site_id",siteId);
            attributes.addFlashAttribute("processing_mode",processingMode);
            attributes.addFlashAttribute("merchant_account_id",merchantAccountId);

            return new RedirectView("/");
        }

}
