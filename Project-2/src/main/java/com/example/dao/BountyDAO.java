package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Bounty;

public interface BountyDAO extends JpaRepository<Bounty, Integer>{

}
