package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.User;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>{


//	public List<Bounty> bounty_List(int user_id);
	public User getUserByUusername(String username);
	public User getUserByHuntername(String huntername);
	public User getUserByUemail(String email);
	public List<User> findAll();

}
