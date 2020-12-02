package com.cg.onlinepizza.service;

import java.util.Optional;

import com.cg.onlinepizza.exceptions.UserIdNotFoundException;
import com.cg.onlinepizza.model.User;

public interface IUserService {

			public User  addNewUser(User user);

			public  User signIn(Integer id,String Password);

			public String  signOut(User user);
			
			//public String forgotPassword(Integer id );
			Optional<User> getUserById(Integer id);
			
		}

