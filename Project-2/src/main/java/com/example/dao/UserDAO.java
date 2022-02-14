package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Account;
import com.example.model.Bounty;
import com.example.model.User;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>{
	public User newUser(String username, String password, String first_name, String last_name, String email, String code_name, Account account);
	public User editUser(int user_id, String username, String password, String first_name, String last_name, String email, String code_name);
	public List<Bounty> bountyList(int user_id);
	public User getUserByUsername(String username);
	

}
