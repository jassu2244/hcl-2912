package com.abesProject.hclhrms.service;

import com.abesProject.hclhrms.entity.Employee;
import com.abesProject.hclhrms.repository.EmployeeRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeRepoImpl empRepo;

    public String addEmp() {
        Employee emp1 = new Employee(200, "Jasmeet", "Developer", "Java", "jassu@gmail.com");
        return empRepo.addEmp(emp1);
    }

    public List<Employee> getEmp() {
        return empRepo.getEmp();
    }
}
