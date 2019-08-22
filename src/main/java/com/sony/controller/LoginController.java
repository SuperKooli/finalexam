package com.sony.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sony.entity.Employee;
import com.sony.service.EmployeeService;

@RequestMapping("/final")
@Controller
public class LoginController {
	
	@Autowired
	private EmployeeService empService; 

	@GetMapping("/login")
	public String login(ModelMap model) {
		Optional<Employee> emps = empService.findEmpById(111L);
		model.addAttribute("emps", emps);
		return "index";
	}
}
