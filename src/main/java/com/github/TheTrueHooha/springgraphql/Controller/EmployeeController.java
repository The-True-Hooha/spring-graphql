package com.github.TheTrueHooha.springgraphql.Controller;

import com.github.TheTrueHooha.springgraphql.Model.AddEmployee;
import com.github.TheTrueHooha.springgraphql.Model.Employees;
import com.github.TheTrueHooha.springgraphql.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    @QueryMapping
    List<Employees> getAllEmployees (){
        return employeeService.getAllEmployees();
    }

    @QueryMapping
    Employees getEmployeeById(@Argument Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @MutationMapping
    Employees addNewEmployee(@Argument AddEmployee newEmployee){
        Employees employees = new Employees(newEmployee.id(),
                newEmployee.firstName(),
                newEmployee.lastName(),
                newEmployee.email(),
                newEmployee.homeAddress(),
                newEmployee.phoneNumber(),
                newEmployee.homeAddress());
        return employeeService.addNewEmployee(employees);
    }

    @MutationMapping
    public void deleteEmployee(@Argument Integer id){
        employeeService.deleteEmployee(id);
    }
}
