package com.example.homeworkspr.Controller;

import java.util.List;

public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    List<Employee> findAll();
}