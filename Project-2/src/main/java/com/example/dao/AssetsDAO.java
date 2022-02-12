package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Assets;

@Repository
public interface AssetsDAO extends JpaRepository<Assets, Integer>{
	
	public Assets findAssestByCurrency(String currency);

}
