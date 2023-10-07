package com.upgrad.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class TransactionDetailsEntity {

    @Column(name= "transactionId")
    private Integer transactionId;

    @Column(name = "paymentMode")
    private String paymentMode;

    @Id
    @Column(name = "bookingId")
    private Integer bookingId;

    @Column(name = "upiId")
    private String upiId;

    @Column(name = "cardNumber")
    private String cardNumber;
}
