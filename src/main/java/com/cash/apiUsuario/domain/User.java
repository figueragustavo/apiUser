package com.cash.apiUsuario.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{

	private static final long serialVerionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@OneToMany(mappedBy = "user")
	private List<Loan> loans;
	
	
	
}
