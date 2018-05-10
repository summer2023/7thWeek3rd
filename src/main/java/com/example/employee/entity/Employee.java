package com.example.employee.entity;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private long id;
    private String name;
    private Integer age;
    private String gender;
    private long companyId;
    private Integer salary;

    public Employee() { }

    public Employee(String name, Integer age, String gender,Integer salary,long id,long companyId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public Employee setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Employee setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Employee setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public long getCompanyId() {
        return companyId;
    }

    public Employee setCompanyId(long companyId) {
        this.companyId = companyId;
        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Employee setSalary(Integer salary) {
        this.salary= salary;
        return this;
    }


    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", this.id);
        map.put("name", this.name);
        map.put("age", this.age);
        map.put("gender", this.gender);
        map.put("companyId", this.companyId);
        map.put("salary", this.salary);

        return map.toString();
    }

}
