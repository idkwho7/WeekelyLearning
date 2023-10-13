package com.jpah2.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@Entity
public class User1 {
	
	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	


}