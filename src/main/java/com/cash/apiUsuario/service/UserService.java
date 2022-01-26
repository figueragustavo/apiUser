package com.cash.apiUsuario.service;

import java.util.List;

import com.cash.apiUsuario.domain.User;

public interface UserService {

	public List<User> findAllUser();
	
	public void save(User user);
	
	public void delete(User user);
	
	public User findUser(User user); 
}
