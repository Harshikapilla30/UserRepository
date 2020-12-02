package com.cg.onlinepizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.onlinepizza.model.User;

public interface IUserRepository extends JpaRepository<User,Integer>{
	@Query("select u from User u where user_id=?1 and password=?2")
	public User signIn(Integer id,String Password);

	
	
}


