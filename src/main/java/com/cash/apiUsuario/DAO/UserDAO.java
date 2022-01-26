package com.cash.apiUsuario.DAO;

import org.springframework.data.repository.CrudRepository;

import com.cash.apiUsuario.domain.User;

public interface UserDAO extends CrudRepository<User, Long>{

}
