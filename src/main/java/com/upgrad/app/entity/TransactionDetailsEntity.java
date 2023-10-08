package com.upgrad.app.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transaction")
public class TransactionDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "transactionId")
    private Integer transactionId;

    @Column(name = "paymentMode")
    private String paymentMode;

    @Column(name = "bookingId")
    private Integer bookingId;

    @Column(name = "upiId")
    private String upiId;

    @Column(name = "cardNumber")
    private String cardNumber;
}
