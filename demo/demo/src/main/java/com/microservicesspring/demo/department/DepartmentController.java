package com.microservicesspring.demo.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

//    @Autowired
//    private DepartmentService departmentService;
    
	
    @Autowired
    private DepartmentServiceJpa departmentServiceJpa;

    @GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return departmentServiceJpa.getDepartmentById(id);
    }

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentServiceJpa.save(department);
    }
}
