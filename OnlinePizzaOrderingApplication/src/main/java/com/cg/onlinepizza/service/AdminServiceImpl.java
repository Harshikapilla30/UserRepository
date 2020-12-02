package com.cg.onlinepizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinepizza.model.Admin;
import com.cg.onlinepizza.model.User;
import com.cg.onlinepizza.repository.IAdminRepository;
import com.cg.onlinepizza.repository.IUserRepository;


public class AdminServiceImpl {
	@Autowired
	private IAdminRepository adminRepository;
	/*
	 * login
	 */
	public Admin signIn(Admin admin)
	{
		Admin signedAdmin=adminRepository.signIn(admin.getAdminId(), admin.getPassword());
		if(signedAdmin!=null) {
			return signedAdmin;
		}
		else
		{
			return new Admin();
		}
	}
	/*
	 * adding user
	 */
	public Admin addNewAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}
	
			/*
	 * logout
	 */
	public Admin signOut(Admin admin) {
		Admin result = adminRepository.save(admin);
		return result;
		
	}
}
