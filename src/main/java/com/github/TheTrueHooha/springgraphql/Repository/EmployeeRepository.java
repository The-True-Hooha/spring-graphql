package com.github.TheTrueHooha.springgraphql.Repository;

import com.github.TheTrueHooha.springgraphql.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
