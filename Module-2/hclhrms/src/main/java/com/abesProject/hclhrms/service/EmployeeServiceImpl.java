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
        Employee emp1 = new Employee(200, "Akshat", "Developer", "Java", "jassu@gmail.com");
        return empRepo.addEmp(emp1);
    }

    public String addEmpBulk() {

        List<Employee> bulkEmp = Arrays.asList(
                new Employee(201, "Rahul", "Tester",
                        "Java", "rahul@gmail.com"),

                new Employee(202, "Priya", "Developer",
                        "Spring Boot", "priya@gmail.com"),

                new Employee(203, "Aman", "Backend Developer",
                        "Java", "aman@gmail.com"),

                new Employee(204, "Neha", "Frontend Developer",
                        "React", "neha@gmail.com")
        );

        return empRepo.addEmpBulk(bulkEmp);
    }


    public List<Employee> getEmp() {
        return empRepo.getEmp();
    }

    public Employee getEmpById(long empId) {
        return empRepo.getEmpById(empId);
    }

    public String deleteById(long empId) {
        return empRepo.deleteById(empId);
    }

    public String updateById(long empId, Employee updatedEmp) {
        return empRepo.updateById(empId, updatedEmp);
    }
}
