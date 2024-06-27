package com.employee_mgmt.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee_master")
public class EmployeeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_code", nullable = false, unique = true)
	private String employeeCode;

	@Column(name = "employee_name", nullable = false)
	private String employeeName;

	@Column(name = "employee_father_name", nullable = false)
	private String employeeFatherName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false)
	private Date createdDate;

	@Column(name = "dept_id")
	private Long deptId;

	@Column(name = "design_id")
	private Long designId;

	@Column(name = "location_id")
	private Long locationId;

	public EmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeMaster(Long id, String employeeCode, String employeeName, String employeeFatherName,
			Date createdDate, Long deptId, Long designId, Long locationId) {
		super();
		this.id = id;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeFatherName = employeeFatherName;
		this.createdDate = createdDate;
		this.deptId = deptId;
		this.designId = designId;
		this.locationId = locationId;
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeFatherName() {
		return employeeFatherName;
	}

	public void setEmployeeFatherName(String employeeFatherName) {
		this.employeeFatherName = employeeFatherName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getDesignId() {
		return designId;
	}

	public void setDesignId(Long designId) {
		this.designId = designId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

}
