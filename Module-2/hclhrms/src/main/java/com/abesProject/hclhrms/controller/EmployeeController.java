package com.abesProject.hclhrms.controller;

import com.abesProject.hclhrms.entity.Employee;
import com.abesProject.hclhrms.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl empService;

    @GetMapping("/")
    public String welcomeMsg() {
        return "Welcome to ABES HRMS";
    }

    @GetMapping("/addemp")
    public String addNewEmployee() {
        return empService.addEmp();
    }

    @GetMapping("/getemp")
    public List<Employee> getEmp() {
        return empService.getEmp();
    }

    @GetMapping("/getemp/{empId}")
    public Employee getEmpById(@PathVariable long empId) {
        return empService.getEmpById(empId);
    }

    @GetMapping("/addemp/bulk")
    public String addEmpBulk() {
        return empService.addEmpBulk();
    }
}
