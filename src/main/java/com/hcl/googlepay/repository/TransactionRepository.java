package com.hcl.googlepay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.googlepay.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	//List<Transaction> findByTrainingId(int trainingId);
}