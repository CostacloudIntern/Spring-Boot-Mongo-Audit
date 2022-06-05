package com.auditing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditing.model.User;
import com.auditing.repository.UserRepository;


@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private UserRepository crudRepo;
	
	@Override
	public User addUser(User user)
	{
		User savedUser = crudRepo.save(user);
		return savedUser;
	}

	@Override
	public User getUserById(int UserId) {
		return crudRepo.findById(UserId).get();
	}
}
