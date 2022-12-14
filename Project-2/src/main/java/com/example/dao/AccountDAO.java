package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Account;

@Repository
public interface AccountDAO extends JpaRepository<Account, Integer>{

	
}
