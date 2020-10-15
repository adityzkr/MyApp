package com.ofss;

public class Customer {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
