package com.githubTheTrueHooha.springgraphql.Controller;

import com.githubTheTrueHooha.springgraphql.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor

public class EmployeeController {

    private final EmployeeService employeeService;

}
