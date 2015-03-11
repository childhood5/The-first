package com.ibsv.capitakpi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibsv.capitakpi.dao.CapitaDAO;
import com.ibsv.capitakpi.model.Employee;
import com.ibsv.capitakpi.service.CapitaService;


@Service
public class CapitaServiceImpl implements CapitaService{
	
	@Autowired(required=true)
	private CapitaDAO serviceDAO;
	
	@Override
	public void insert() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public String getModel(String model) {
		return serviceDAO.getModel(model);
	}
	
	public void setServiceDAO(CapitaDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}

	@Override
	public List<Employee> getListEmployee() {
		List<Employee> listEmployee = serviceDAO.getListEmployee();
		return listEmployee;
	}
}