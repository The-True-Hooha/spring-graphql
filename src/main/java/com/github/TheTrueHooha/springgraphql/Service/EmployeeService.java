package com.github.TheTrueHooha.springgraphql.Service;


import com.github.TheTrueHooha.springgraphql.Model.Employees;

import java.util.List;

public interface EmployeeService {

    //method that adds a new employee to the database
    Employees addNewEmployee (Employees employees);

    //method that return a list of all the employees in the database
    List<Employees> getAllEmployees();

    //get employee data id
    Employees getEmployeeById(Integer id) throws RuntimeException;

    //edit employee data
    Employees editEmployeeData(Employees employees, Integer id);

    //delete employee data
    void deleteEmployee(Integer id) throws RuntimeException;
}
