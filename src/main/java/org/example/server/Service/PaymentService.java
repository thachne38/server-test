package org.example.server.Service;

import org.example.server.Model.Payment;
import org.example.server.Model.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    private Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
