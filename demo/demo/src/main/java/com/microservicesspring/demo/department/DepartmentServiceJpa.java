package com.microservicesspring.demo.department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceJpa {

	@Autowired 
	DepartmentRepository departmentRepository;
	
	public Department getDepartmentById(Long id) {
       return departmentRepository.findDepartmentByDepartmentId(id);
    }
	
	 public Department save(Department department) {
	        return departmentRepository.save(department);
	    }
}
