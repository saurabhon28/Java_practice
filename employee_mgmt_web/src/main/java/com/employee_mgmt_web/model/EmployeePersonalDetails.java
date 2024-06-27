package com.employee_mgmt_web.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_personal_details")
public class EmployeePersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "employee_master_id", nullable = false)
	private EmployeeMaster employeeMaster;

	@Column(name = "father_name", nullable = false)
	private String fatherName;

	@Column(name = "mother_name", nullable = false)
	private String motherName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "permanent_house", nullable = false)
	private String permanentHouse;

	@Column(name = "permanent_street", nullable = false)
	private String permanentStreet;

	@Column(name = "permanent_landmark", nullable = false)
	private String permanentLandmark;

	@Column(name = "permanent_city", nullable = false)
	private String permanentCity;

	@Column(name = "permanent_district", nullable = false)
	private String permanentDistrict;

	@Column(name = "permanent_state", nullable = false)
	private String permanentState;

	@Column(name = "permanent_pin", nullable = false)
	private String permanentPin;

	@Column(name = "communication_house", nullable = false)
	private String communicationHouse;

	@Column(name = "communication_street", nullable = false)
	private String communicationStreet;

	@Column(name = "communication_landmark", nullable = false)
	private String communicationLandmark;

	@Column(name = "communication_city", nullable = false)
	private String communicationCity;

	@Column(name = "communication_district", nullable = false)
	private String communicationDistrict;

	@Column(name = "communication_state", nullable = false)
	private String communicationState;

	@Column(name = "communication_pin", nullable = false)
	private String communicationPin;

	public EmployeePersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EmployeePersonalDetails(Long id, EmployeeMaster employeeMaster, String fatherName, String motherName,
			String email, String phone, String gender, String permanentHouse, String permanentStreet,
			String permanentLandmark, String permanentCity, String permanentDistrict, String permanentState,
			String permanentPin, String communicationHouse, String communicationStreet, String communicationLandmark,
			String communicationCity, String communicationDistrict, String communicationState,
			String communicationPin) {
		super();
		this.id = id;
		this.employeeMaster = employeeMaster;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.permanentHouse = permanentHouse;
		this.permanentStreet = permanentStreet;
		this.permanentLandmark = permanentLandmark;
		this.permanentCity = permanentCity;
		this.permanentDistrict = permanentDistrict;
		this.permanentState = permanentState;
		this.permanentPin = permanentPin;
		this.communicationHouse = communicationHouse;
		this.communicationStreet = communicationStreet;
		this.communicationLandmark = communicationLandmark;
		this.communicationCity = communicationCity;
		this.communicationDistrict = communicationDistrict;
		this.communicationState = communicationState;
		this.communicationPin = communicationPin;
	}



	// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public EmployeeMaster getEmployeeMaster() {
		return employeeMaster;
	}

	public void setEmployeeMaster(EmployeeMaster employeeMaster) {
		this.employeeMaster = employeeMaster;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPermanentHouse() {
		return permanentHouse;
	}

	public void setPermanentHouse(String permanentHouse) {
		this.permanentHouse = permanentHouse;
	}

	public String getPermanentStreet() {
		return permanentStreet;
	}

	public void setPermanentStreet(String permanentStreet) {
		this.permanentStreet = permanentStreet;
	}

	public String getPermanentLandmark() {
		return permanentLandmark;
	}

	public void setPermanentLandmark(String permanentLandmark) {
		this.permanentLandmark = permanentLandmark;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public String getPermanentDistrict() {
		return permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentPin() {
		return permanentPin;
	}

	public void setPermanentPin(String permanentPin) {
		this.permanentPin = permanentPin;
	}

	public String getCommunicationHouse() {
		return communicationHouse;
	}

	public void setCommunicationHouse(String communicationHouse) {
		this.communicationHouse = communicationHouse;
	}

	public String getCommunicationStreet() {
		return communicationStreet;
	}

	public void setCommunicationStreet(String communicationStreet) {
		this.communicationStreet = communicationStreet;
	}

	public String getCommunicationLandmark() {
		return communicationLandmark;
	}

	public void setCommunicationLandmark(String communicationLandmark) {
		this.communicationLandmark = communicationLandmark;
	}

	public String getCommunicationCity() {
		return communicationCity;
	}

	public void setCommunicationCity(String communicationCity) {
		this.communicationCity = communicationCity;
	}

	public String getCommunicationDistrict() {
		return communicationDistrict;
	}

	public void setCommunicationDistrict(String communicationDistrict) {
		this.communicationDistrict = communicationDistrict;
	}

	public String getCommunicationState() {
		return communicationState;
	}

	public void setCommunicationState(String communicationState) {
		this.communicationState = communicationState;
	}

	public String getCommunicationPin() {
		return communicationPin;
	}

	public void setCommunicationPin(String communicationPin) {
		this.communicationPin = communicationPin;
	}

}
