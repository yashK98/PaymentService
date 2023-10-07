package com.upgrad.app.repo;

import com.upgrad.app.entity.TransactionDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<TransactionDetailsEntity, Integer> {
    TransactionDetailsEntity findByTransactionId(Integer transactionId);
}
