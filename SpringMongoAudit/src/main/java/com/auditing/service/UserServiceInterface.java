package com.auditing.service;

import com.auditing.model.User;

public interface UserServiceInterface {
	public User addUser(User user);
	public User getUserById(int UserId);


}
