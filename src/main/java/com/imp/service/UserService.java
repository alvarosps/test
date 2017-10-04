package com.imp.service;

import com.imp.model.User;

public interface UserService {
	public User findUserByBadge(Integer badge);
	public void saveUser(User user);
}
