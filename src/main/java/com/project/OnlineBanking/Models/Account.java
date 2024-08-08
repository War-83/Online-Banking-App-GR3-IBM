package com.project.OnlineBanking.Models;

import java.math.BigDecimal;

import com.project.OnlineBanking.Helpers.AccountType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Account {
	
	    @Id 
	    private Long accountNumber;
	    
	    @Enumerated(EnumType.STRING)
	    private AccountType accountType; 
	    private BigDecimal balance; 

	    @ManyToOne 
	    @JoinColumn(name = "customer_id") 
	    private Customer customer; 

	 
}
