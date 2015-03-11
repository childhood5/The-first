package com.ibsv.capitakpi.model;

import java.util.Date;

public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = -859061939983636854L;
	
	private Long employeeId;
	private String name;
	private String division;
	private Date startDate;

	public Employee() {
	}

	public Employee(String name, String division, Date startDate) {
		this.name = name;
		this.division = division;
		this.startDate = startDate;
	}

	public Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
