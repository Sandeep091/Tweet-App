package com.tweetapp.tweetservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tweetapp.tweetservice.entity.User;
import com.tweetapp.tweetservice.exception.UserException;
import com.tweetapp.tweetservice.repository.UserRepository;
import com.tweetapp.tweetservice.util.LoggerConst;

/**
 * @author Sandeep
 *
 */

@Component
public class UserDaoImpl implements UserDao {

	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() throws UserException {
		LoggerConst.LOG.info("getAllUsers  - Inside Repository");
		return userRepository.findAll();
	}

	@Override
	public String registerUser(User user) throws UserException {
		LoggerConst.LOG.info("registerUser  - Inside Repository");
		userRepository.save(user);
		return " User Successfully Registered with UserName : " + user.getUserName();
	}

	@Override
	public User getUserByUsername(String userName) throws UserException {
		LoggerConst.LOG.info("getUserByUsername  - Inside Repository");
		return userRepository.findByUserName(userName);
	}

	@Override
	public User getUserByEmail(String email) throws UserException {
		LoggerConst.LOG.info("getUserByEmail  - Inside Repository");
		return userRepository.findByEmail(email);
	}

	@Override
	public String changePassword(User user) throws UserException {
		LoggerConst.LOG.info("changePassword  - Inside Repository");
		userRepository.save(user);
		return "Password updated Successfully";
	}

}