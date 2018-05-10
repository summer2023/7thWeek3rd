package com.example.employee.entity;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private long id;
    private String companyName;
    private Integer employeesNumber;

    public Company() { }

    public Company(long id, String companyName, Integer employeesNumber) {
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public long getId() {
        return id;
    }

    public Company setId(long id) {
        this.id = id;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Company setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Integer getemployeesNumber() {
        return employeesNumber;
    }

    public Company setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
        return this;
    }

    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", this.id);
        map.put("companyName", this.companyName);
        map.put("employeesNumber", this.employeesNumber);
        return map.toString();
    }
}
