package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	@Column(name = "emp_name")
	private String empName;

	@ManyToMany
	@JoinTable
	(
	name = "emp_proj", 
	joinColumns = { @JoinColumn(name = "eid") }, 
	inverseJoinColumns = {@JoinColumn(name = "pid") }
	)
	private List<Project> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Employee(int eid, String empName, List<Project> projects) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.projects = projects;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
