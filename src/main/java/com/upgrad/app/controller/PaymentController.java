package com.upgrad.app.controller;

import com.upgrad.app.entity.TransactionDetailsEntity;
import com.upgrad.app.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/transaction/{transactionId}")
    public TransactionDetailsEntity getTransactionEntityDetails(@PathVariable("transactionId") Integer transactionId){
        return paymentService.getTransactionDetails(transactionId);
    }

    @PostMapping("/transaction")
    public ResponseEntity<Integer> postTransaction(@RequestBody TransactionDetailsEntity transactionDetailsEntity){
        return paymentService.postTransaction(transactionDetailsEntity);
    }
}
