package com.githubTheTrueHooha.springgraphql.Service;


import com.githubTheTrueHooha.springgraphql.Model.Employees;

import java.util.List;

public interface EmployeeService {

    //method that adds a new employee to the database
    Employees addNewEmployee (Employees employees);

    //method that return a list of all the employees in the database
    List<Employees> getAllEmployees();

    //get employee data id
    Employees getEmployeeById(Long id) throws RuntimeException;

    //edit employee data
    Employees editEmployeeData(Employees employees, Long id);

    //delete employee data
    void deleteEmployee(Long id) throws RuntimeException;
}
