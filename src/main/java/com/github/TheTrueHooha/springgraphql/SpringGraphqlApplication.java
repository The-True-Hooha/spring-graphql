package com.githubTheTrueHooha.springgraphql;

import com.githubTheTrueHooha.springgraphql.Model.Employees;
import com.githubTheTrueHooha.springgraphql.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration(exclude = BatchAutoConfiguration.class)
public class SpringGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
		return args -> {
			employeeRepository.save(new Employees(
					null,
					"Bright",
					"Mario",
					"beantalk@yahoo.com",
					"19 Suns system Ibadan",
					"+23455886711",
					"Finance"
			));

			employeeRepository.save(new Employees(
					null,
					"Barry",
					"Preacher",
					"bepreach@yahoo.com",
					"11 Suns system Ogun",
					"+23455886432",
					"Security"
			));

			employeeRepository.save(new Employees(
					null,
					"Greg",
					"Hustler",
					"greghustler@yahoo.com",
					"12 Suns system Ibadan",
					"+23455886876",
					"HR"
			));

			employeeRepository.save(new Employees(
					null,
					"Ghost",
					"Evans",
					"gevan@yahoo.com",
					"22 Suns system Ibadan",
					"+23455886711",
					"Finance"
			));
		};
	}
}
