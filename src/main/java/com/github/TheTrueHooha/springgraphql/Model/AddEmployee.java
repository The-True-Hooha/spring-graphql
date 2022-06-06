package com.github.TheTrueHooha.springgraphql.Model;

public record AddEmployee( Integer id,
                           String firstName,
                           String lastName,
                           String email,
                           String homeAddress,
                           String phoneNumber,
                           String employeeDepartment
) { }
