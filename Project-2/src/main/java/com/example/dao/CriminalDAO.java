package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Criminal;

@Repository
public interface CriminalDAO extends JpaRepository<Criminal, Integer>{
	
//	public List<Criminal> getCriminalByName(String first_name, String last_name);
	public Criminal getCriminalByCodename(String codename);
	public Criminal getCriminalByFirstname(String first_name);
	public Criminal getCriminalByLastname(String last_name);
	public List<Criminal> getCriminalListByFirstname(String first_name);
//	public List<String> getFirstNameList(String first_name);
	public List<Criminal> getCriminalListByLastname(String last_name);

}
