package com.project.OnlineBanking.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Transaction {
	
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long transactionId; 

    private BigDecimal amount; 

    private LocalDateTime transactionDate; 

    @ManyToOne 
    @JoinColumn(name = "source_account") 
    private Long sourceAccount; 

    @ManyToOne 
    @JoinColumn(name = "destination_account") 
    private Long destinationAccount;
    
    public Transaction() {
    	
    }
    
	public Transaction(Long transactionId, BigDecimal amount, LocalDateTime transactionDate, Long sourceAccount,
			Long destinationAccount) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.sourceAccount = sourceAccount;
		this.destinationAccount = destinationAccount;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Long getSourceAccount() {
		return sourceAccount;
	}

	public void setSourceAccount(Long sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public Long getDestinationAccount() {
		return destinationAccount;
	}

	public void setDestinationAccount(Long destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", transactionDate="
				+ transactionDate + ", sourceAccount=" + sourceAccount + ", destinationAccount=" + destinationAccount
				+ "]";
	} 
	
	
	
    
    
}
