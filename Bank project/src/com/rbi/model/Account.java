package com.rbi.model;

public class Account {
	
	private String accno;
	private String name;
	private String address;
	private String id;
	private String pass;
	
	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String s) {
		this.accno = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	private double money;
	
	
	}
