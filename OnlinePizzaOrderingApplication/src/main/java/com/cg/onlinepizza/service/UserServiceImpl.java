package com.cg.onlinepizza.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.onlinepizza.exceptions.UserIdNotFoundException;
import com.cg.onlinepizza.model.User;
import com.cg.onlinepizza.repository.IUserRepository;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	/*
	 * signIn
	 */
	public User signIn(Integer id, String Password) {
		User signedUser = userRepository.signIn(id, Password);
		if (signedUser != null) {
			return signedUser;
		} else {
			return new User();
		}
	}

	/*
	 * adding user
	 */
	public User addNewUser(User user) {
		return userRepository.save(user);
	}

	/*
	 * logout
	 */
	public String signOut(User user) {

		return "SignedOut Successfully";

	}

	/*
	 * forgotPassword
	 */
//	 public String forgotPassword(Integer id){
//			String val= id.toString();
//			Optional<User> obj= userRepository.findById(val);
//			
//			User value=obj.get();
//		 return   value.getPassword();
//		
	// }
	@Override
	public Optional<User> getUserById(Integer id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isEmpty())
			throw new UserIdNotFoundException("Enter a valid user id");
		return user;
	}

}
