package com.cash.apiUsuario.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cash.apiUsuario.domain.Loan;
import com.cash.apiUsuario.domain.User;
import com.cash.apiUsuario.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ControllerUsuario {
	
	@Autowired
	private UserService userService;
	
	
//	@GetMapping("/users/{id}")
	@GetMapping("/")
	public String findAllUser(Model model) {
		
		var users = userService.findAllUser();

		List<Loan> loans = new ArrayList();
		Loan loan = new Loan();
		loan.setId(1L);
		loan.setTotal(20000);

		loans.add(loan);
//		usuario.setLoans(loans);
		String mensaje = "Lista de Usuarios";
		model.addAttribute("mensaje", mensaje);

		model.addAttribute("users", users);
		
		log.info(users.toString());
		
		return "index";
		
	}
	
	@GetMapping("/addUser")
	public String addUser(User user) {
		userService.save(user);
		return "Se agrego el usuario: "+ user.toString();
	}
	
	@GetMapping("/editUser/{id}")
	public String editUser(User user) {
		user = userService.findUser(user);
		userService.save(user);
		return "Se modifico el usuario: "+ user.toString();
	}
	
	@GetMapping("/findUser/{id}")
	public String findUser(User user) {
		user = userService.findUser(user);
		return "Se consiguio el usuario: "+ user.toString();
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(User user) {
		userService.delete(user);
		return "Se elimino el usuario ";
	}

}
