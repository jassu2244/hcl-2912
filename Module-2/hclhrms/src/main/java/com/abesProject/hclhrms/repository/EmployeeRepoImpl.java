package com.abesProject.hclhrms.repository;

import com.abesProject.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class EmployeeRepoImpl implements EmployeeRepo{

    List<Employee> empList = new ArrayList<>();

    @Override
    public String addEmp(Employee emp) {
        empList.add(emp);
        return "Employee added successfully";
    }

    @Override
    public List<Employee> getEmp() {
        return empList;
    }

    @Override
    public Employee getEmpById(long empId) {
        return null;
    }

    @Override
    public String deleteById(long empId) {
        return "";
    }

    @Override
    public String updateById(long empId, Employee updatedEmp) {
        return "";
    }
}
