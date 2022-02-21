package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Status;

@Repository
public interface StatusDAO extends JpaRepository<Status, Integer> {
	

//	public Status newStatus(String status);

	//public Status newStatus(String status);
	
}
