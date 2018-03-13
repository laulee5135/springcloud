package com.laulee.springcloud.entity;

import java.math.BigDecimal;


public class User {

	private Long id;
	private String username;
	private String name;
	private int age;
	private BigDecimal banlance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getBanlance() {
		return banlance;
	}
	public void setBanlacne(BigDecimal banlacne) {
		this.banlance = banlacne;
	}
	
}
