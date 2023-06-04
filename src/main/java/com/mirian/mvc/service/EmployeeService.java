package com.mirian.mvc.service;

import com.mirian.mvc.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployeesByOrderByLastNameAsc();
    List<Employee> findAllEmployees();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

}
