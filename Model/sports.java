package com.example.sports.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class sports {

	@Id
   
	private int id;
	private String name;
	private  String email;
	private  String phone;
	private String message;
	
 
	 public sports(int id,String name,String email,String phone,String message)
	{
		super();
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.message=message;
	}
	public sports()
	{
		super();
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	}
