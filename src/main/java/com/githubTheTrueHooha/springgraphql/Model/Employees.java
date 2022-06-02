package com.githubTheTrueHooha.springgraphql.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee data")
@AllArgsConstructor
@NoArgsConstructor

public class Employees {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String homeAddress;

    private String phoneNumber;

    private String employeeDepartment;
}
