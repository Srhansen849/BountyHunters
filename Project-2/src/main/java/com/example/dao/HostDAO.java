package com.example.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.example.model.Host;

@Repository
public interface HostDAO extends JpaRepository<Host, Integer>{
	


	public Host getHostByRepresentative(String representative);
//	public Host getHostByCodename(String code_name);
//
//	public Host getHostByUsername(String username);
//	public Host getHostByEmail(String email);
//	public Host getHostByFirstname(String firstname);
//	public Host getHostByLastname(String lastname);
	public Host getHostByHusername(String husername);
	public Host getHostByHemail(String hemail);
	public Host getHostByHostname(String hostname);


}



