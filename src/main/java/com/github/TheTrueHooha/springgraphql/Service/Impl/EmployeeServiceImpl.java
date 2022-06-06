package com.github.TheTrueHooha.springgraphql.Service.Impl;

import com.github.TheTrueHooha.springgraphql.Model.Employees;
import com.github.TheTrueHooha.springgraphql.Repository.EmployeeRepository;
import com.github.TheTrueHooha.springgraphql.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;

     @Override
    public Employees addNewEmployee(Employees employees) {
        return employeeRepository.save(employees);
    }


    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees getEmployeeById(Integer id) throws RuntimeException {
        Optional<Employees> employees = employeeRepository.findById(id);
        if (employees.isPresent()){
            return employees.get();
        } else {
            throw new RuntimeException(HttpStatus.NOT_FOUND.toString());
        }
    }

    @Override
    public Employees editEmployeeData(Employees employees, Integer id) {
        Employees currentEmployees = employeeRepository.findById(id)
                .orElseThrow( () -> new RuntimeException(HttpStatus.NOT_FOUND.toString()));
        currentEmployees.setFirstName(employees.getFirstName());
        currentEmployees.setLastName(employees.getLastName());
        currentEmployees.setEmail(employees.getEmail());
        currentEmployees.setHomeAddress(employees.getHomeAddress());
        currentEmployees.setPhoneNumber(employees.getPhoneNumber());
        currentEmployees.setEmployeeDepartment(employees.getEmployeeDepartment());

        employeeRepository.save(currentEmployees);
        return currentEmployees;
    }

    @Override
    public void deleteEmployee(Integer id) throws RuntimeException {
        //check if the employee data exists in the database and deletes by ID
        if (employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
        } else {
            throw new RuntimeException(HttpStatus.NOT_FOUND.toString());
        }
    }
}
