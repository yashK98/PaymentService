package com.upgrad.app.service;

import com.upgrad.app.entity.TransactionDetailsEntity;
import com.upgrad.app.repo.PaymentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public TransactionDetailsEntity getTransactionDetails(Integer transactionId){
        return paymentRepo.findByTransactionId(transactionId);
    }

    public ResponseEntity<Integer> postTransaction(TransactionDetailsEntity transactionDetailsEntity){
        log.info("Booking Id :: {} saved to DB", transactionDetailsEntity.getBookingId());
        TransactionDetailsEntity response = paymentRepo.save(transactionDetailsEntity);
        return new ResponseEntity<>(response.getTransactionId(), HttpStatusCode.valueOf(201));
    }
}
