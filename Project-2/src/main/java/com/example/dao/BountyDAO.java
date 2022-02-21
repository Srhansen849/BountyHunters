package com.example.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Bounty;


import com.example.model.Criminal;
import com.example.model.Host;
import com.example.model.User;

@Repository
public interface BountyDAO extends JpaRepository<Bounty, Integer> {
	
	public Bounty getBountyByCriminalid(Criminal criminal_id);
	public List<Bounty> getBountyByBhHolder(User bhHolder);
	public List<Bounty> getBountyByHostHolder(Host hostHolder);

}
