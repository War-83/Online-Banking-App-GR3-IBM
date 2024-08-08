package com.project.OnlineBanking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.OnlineBanking.Models.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
