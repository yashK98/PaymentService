package com.upgrad.app.controller;

import com.upgrad.app.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/paymentService")
    public String getStatus(){
        return paymentService.getTransaction();
    }
}
