package com.project.OnlineBanking.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.OnlineBanking.Models.Account;
import com.project.OnlineBanking.Models.Transaction;
import com.project.OnlineBanking.Services.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	AccountService ser;
	
	
	
	@PostMapping("/accounts")
	public void CreateAccount(Account model) {
		ser.CreateAccount(model);
	}
	
	
	
	
	@GetMapping("/accounts/{id}")
	public List<Account> GetAccount(@PathVariable String id){
		ser.GetAccount(id);
		return null;
		
	}
	
	
	
	@PutMapping("/accounts/{id}")
	public void PutAccount(@PathVariable String id){
		ser.PutAccount(id);
		
	}
	
	
	
	
	@DeleteMapping("/accounts/{id}")
	public void DeleteAccount(@PathVariable String id){
		ser.DeleteAccount(id);
		
	}
	
	
	
	@PostMapping("/transactions")
	
	public void DoTransaction(Transaction model) {
		ser.DoTransaction(model);
	}
	
	
	
	
	@GetMapping("/accounts/{id}/transactions")
	
	public void GetTransactions(@PathVariable String id) {
		
		ser.GetTransactions(id);
		
	}
	
	
	
	

}
