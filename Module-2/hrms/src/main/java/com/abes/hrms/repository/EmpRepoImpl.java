package com.abes.hrms.repository;

import org.springframework.stereotype.Component;

@Component
public class EmpRepoImpl implements EmpRepo {

    @Override
    public double squareRoot(double d) {
        return Math.sqrt(d);
    }

    @Override
    public String empData() {
        return "This is the emp data";
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
