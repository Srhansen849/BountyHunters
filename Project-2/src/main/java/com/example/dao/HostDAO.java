package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Host;

public interface HostDAO extends JpaRepository<Host, Integer>{

}
