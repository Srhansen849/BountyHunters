package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Time;

@Repository
public interface TimeDAO extends JpaRepository<Time, Integer>{

}
