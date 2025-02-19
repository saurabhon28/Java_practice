package com.practice_hibernate;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
    private String name;
    
    private String city;
    
    private Certificate certi;
    
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.id + " : " + this.name + " : " + this.city ;
	}
    
	
    
    
}
