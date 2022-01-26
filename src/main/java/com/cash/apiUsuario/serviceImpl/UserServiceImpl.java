package com.cash.apiUsuario.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cash.apiUsuario.DAO.UserDAO;
import com.cash.apiUsuario.domain.User;
import com.cash.apiUsuario.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;
	
	@Override
	public List<User> findAllUser() {
		return (List<User>) userDao.findAll();
	}

	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User findUser(User user) {
		return userDao.findById(user.getId()).orElse(null);
	}

}
