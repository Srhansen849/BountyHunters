package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Criminal;



@Repository
public interface CriminalDAO extends JpaRepository<Criminal, Integer>{
	

	public Criminal getCriminalByCrimname(String crimname);


}
