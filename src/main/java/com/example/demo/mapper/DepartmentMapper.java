package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Department;
import com.example.demo.entity.Emp;

@Mapper
public interface DepartmentMapper {
		
	List<Department> selectAll();
	
	List<Emp> selectModalEmp();
}