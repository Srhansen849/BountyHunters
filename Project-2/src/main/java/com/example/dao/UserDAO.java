package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Bounty;
import com.example.model.User;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>{


//	public List<Bounty> bounty_List(int user_id);
	public User getUserByUsername(String username);

	public User getUserByFirstname(String firstname);
	public User getUserByLastname(String lastname);
	public User getUserByCodename(String codename);
	public User getUserByEmail(String email);

	public List<User> findAll();

}
