package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{

}
