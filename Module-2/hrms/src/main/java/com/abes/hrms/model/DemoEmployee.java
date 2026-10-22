package com.abes.hrms.model;

import com.abes.hrms.repository.EmpRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DemoEmployee {

    @Autowired
    private EmpRepoImpl empRepo;

    public int add() {
        int a = 10;
        int b = 20;
        return empRepo.add(a, b);
    }

    public double squareRoot() {
        return empRepo.squareRoot(2000);
    }
}