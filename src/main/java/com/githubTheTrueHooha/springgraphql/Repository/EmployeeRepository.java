package com.githubTheTrueHooha.springgraphql.Repository;

import com.githubTheTrueHooha.springgraphql.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {



}
