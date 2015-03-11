package com.ibsv.capitakpi.service;

import java.util.List;

import com.ibsv.capitakpi.model.Employee;


public interface CapitaService {
	
	public void insert();
	public void update();
	public void delete();
	public String getModel(String model);
	public List<Employee> getListEmployee();
	
}
