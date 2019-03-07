package com.example.robotrestserverapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "robot")
@EntityListeners(AuditingEntityListener.class)
public class Robot {
	
	public Robot() {
		
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
			this.name = name;
	}
	
	public String getRegister() {
		return register;
	}
	
	public void setRegister(String register) {
			this.register = register;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
			this.number = number;
	}
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String register;
	
	@Range(min=1, max=100)
	private int number;
}
