package com.cg.onlinepizza.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinepizza.model.Admin;
import com.cg.onlinepizza.service.IAdminService;
import com.cg.onlinepizza.service.IUserService;

@RestController
@RequestMapping("admins")
	public class AdminController {
		@Autowired
		private IAdminService adminService;
		/*
		 * login
		 */
		@PostMapping("/signIn/{adminid}/{password}")
		public String signIn(@PathVariable Integer adminid,@PathVariable String password) {
			Admin admin1 = adminService.signIn(adminid,password);
			if(admin1!=null) return "SuccesfullSign";
			else return "InvalidPassword or Id,If a newadmin add your details and proceed";
			
			}

		/*
		 * adding user
		 */
		@PostMapping("/addNewAdmin")
		public ResponseEntity<Admin> add(@RequestBody Admin admin) {
			Admin admin1 = adminService.addNewAdmin(admin);
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		}
		/*
		 * signOut user
		 */
		
		@PostMapping(value="/signOut")
		public void signOutAdmin(@RequestBody Admin admin){
			adminService.signOut(admin);
		
	}
		
		
}





