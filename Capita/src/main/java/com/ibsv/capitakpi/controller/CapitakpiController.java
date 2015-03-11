package com.ibsv.capitakpi.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibsv.capitakpi.constant.Constant;
import com.ibsv.capitakpi.model.Employee;
import com.ibsv.capitakpi.service.CapitaService;

@Controller
@RequestMapping("/capita")
public class CapitakpiController {

	private static final Logger log = Logger.getLogger(CapitakpiController.class);

	@Autowired(required=true)
	private CapitaService capitaService;
	
	@RequestMapping(value = "/controller", method = RequestMethod.GET)
	public String getModel(ModelMap modelMap) {

		log.info("This is the service controller");
		
		String model = capitaService.getModel(Constant.CAPITA_KPI);
		modelMap.addAttribute(Constant.CAPITA, model);
		return Constant.CAPITA;
	}
	
	@RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
	public String getListEmployee(ModelMap modelMap) {

		List<Employee> list = capitaService.getListEmployee();
		modelMap.addAttribute(Constant.CAPITA, list);
		return Constant.CAPITA;
	}
	
	public void setCapitaService(CapitaService capitaService) {
		this.capitaService = capitaService;
	}

}