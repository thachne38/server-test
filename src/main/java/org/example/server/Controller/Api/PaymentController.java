package org.example.server.Controller.Api;

import org.example.server.Model.Payment;
import org.example.server.Service.JwtDecodeService;
import org.example.server.Service.JwtEncodeService;
import org.example.server.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private JwtDecodeService jwtDecodeService;
    @Autowired
    private JwtEncodeService jwtEncodeService;

    @GetMapping("/addPayments")
    public ResponseEntity<?> addPayments(@RequestHeader(value = "Authorization", required = false) String authorizationHeader, @RequestBody Payment payment) {
        return ResponseEntity.ok("Add payment success");
    }
}
