package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{
	
	//public List<User> getAllBountyHunters();
	//public User getBountyHunterById(int userid);
	public User findBountyHunterByFistname(String firstname);
	public User findBountyHunterByLastname(String lastname);
	public User findBountyHunterByCodename(String codename);
	public User findBountyHunterByUsername(String username);
	public User findBountyHunterByEmail(String email);
	public List<User> findAll();

}
