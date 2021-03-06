package com.cg.onlinepizza.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinepizza.model.User;
import com.cg.onlinepizza.service.IUserService;

@RestController
@RequestMapping("users")
	public class UserController {
		@Autowired
		private IUserService userService;
		/*
		 * login
		 */
		@PostMapping("/signIn/{userid}/{password}")
		public String signIn(@PathVariable Integer userid,@PathVariable String password) {
			User user1 = userService.signIn(userid,password);
			if(user1!=null) return "SuccesfullSign";
			else return "InvalidPassword or Id,If a newuser add your details and proceed";
			
			}
		@GetMapping("/find/{id}") // http://localhost:1205/users/find/
		public Optional<User> getUserById(@PathVariable("id") Integer id){
			Optional<User> entity =userService.getUserById(id);
			return entity;
		}
		/*
		 * adding user
		 */
		@PostMapping("/addNewUser")
		public ResponseEntity<User> add(@RequestBody User user) {
			User user1 = userService.addNewUser(user);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		/*
		 * signOut user
		 */
		
		@PostMapping(value="/signOut")
		public void signOutUser(@RequestBody User user){
			 userService.signOut(user);
		
	}
		
		
}

