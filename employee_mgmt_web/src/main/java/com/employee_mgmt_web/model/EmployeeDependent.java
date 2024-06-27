package com.employee_mgmt_web.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_dependent")
public class EmployeeDependent {
    
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "employee_master_id", nullable = false)
	    private EmployeeMaster employeeMaster;

	    @Column(name = "dependent_name", nullable = false)
	    private String dependentName;

	    @Column(name = "relation", nullable = false)
	    private String relation;

	    @Column(name = "aadhaar_no", nullable = false)
	    private String aadhaarNo;
	    
	    

	   public EmployeeDependent(Long id, EmployeeMaster employeeMaster, String dependentName, String relation,
				String aadhaarNo) {
			super();
			this.id = id;
			this.employeeMaster = employeeMaster;
			this.dependentName = dependentName;
			this.relation = relation;
			this.aadhaarNo = aadhaarNo;
		}

	public EmployeeDependent() {
			super();
			// TODO Auto-generated constructor stub
		}

		// Getters and setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public EmployeeMaster getEmployeeMaster() {
			return employeeMaster;
		}

		public void setEmployeeMaster(EmployeeMaster employeeMaster) {
			this.employeeMaster = employeeMaster;
		}

		public String getDependentName() {
			return dependentName;
		}

		public void setDependentName(String dependentName) {
			this.dependentName = dependentName;
		}

		public String getRelation() {
			return relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}

		public String getAadhaarNo() {
			return aadhaarNo;
		}

		public void setAadhaarNo(String aadhaarNo) {
			this.aadhaarNo = aadhaarNo;
		}

	   
}
