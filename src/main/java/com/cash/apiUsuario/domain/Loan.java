package com.cash.apiUsuario.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
@Table(name = "loan")
public class Loan implements Serializable{
	
	private static final long serialVerionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double total;
	
	@JoinColumn(name = "userid", referencedColumnName = "id")
	@ManyToOne
	private User user;

}
