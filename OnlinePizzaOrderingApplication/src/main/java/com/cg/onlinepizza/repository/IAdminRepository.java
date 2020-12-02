package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.onlinepizza.model.Admin;
import com.cg.onlinepizza.model.User;

public interface IAdminRepository extends JpaRepository<Admin, Integer>{
	
	@Query("select u from Admin u where admin_id=?1 and password=?2")
	public Admin signIn(Integer integer,String string);

}
