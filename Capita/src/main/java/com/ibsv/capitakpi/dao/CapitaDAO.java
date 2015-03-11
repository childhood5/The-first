package com.ibsv.capitakpi.dao;

import java.util.List;

import com.ibsv.capitakpi.model.Employee;

public interface CapitaDAO{
	
	public String getModel(String model);
	public List<Employee> getListEmployee();

}