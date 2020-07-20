package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Department;
import com.example.demo.entity.Emp;
import com.example.demo.mapper.DepartmentMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ModalTestController{
		
	@Autowired
	DepartmentMapper departmentMapper;
	
	@RequestMapping("/base")
	public String base(Model model) {
		
		List<Department> departmentList;
		departmentList = departmentMapper.selectAll();
		model.addAttribute("departmentList", departmentList);
		return "base.html";
	}
	
	@PostMapping("/empSearch")
	public String empSearch(@RequestParam("formJson") String formJson, Model model) throws JsonMappingException, JsonProcessingException {
				
		 ObjectMapper mapper = new ObjectMapper();
	     Emp emp = mapper.readValue(formJson, Emp.class);
		 
	     System.out.println("firstName=" + emp.getEmpName());
	     System.out.println("empId=" + emp.getEmpId());
		
		
		return "modalEmpList.html";
	}
}