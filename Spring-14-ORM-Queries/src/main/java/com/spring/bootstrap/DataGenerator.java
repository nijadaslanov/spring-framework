package com.spring.bootstrap;

import com.spring.repository.DepartmentRepository;
import com.spring.repository.EmployeeRepository;
import com.spring.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

     private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------REGION START-------------");

        System.out.println("findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry(\"Asia\") = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println(regionRepository.findTop2ByCountry("Canada"));
        System.out.println("------------REGION END---------");


        System.out.println("Department Starts");
        System.out.println("findAllByDepartment(\"toys\") = " + departmentRepository.findAllByDepartment("Toys"));
        System.out.println(departmentRepository.findByDivisionIs("Health"));
        System.out.println(departmentRepository.findByDivisionEquals("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContaining(\"Hea\") " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));


        System.out.println("Employee Starts");
        System.out.println("employeeRepository.findAllByEmail(\"tboncoeurr8@ucla.edu\") = " + employeeRepository.findAllByEmail("tboncoeurr8@ucla.edu"));

        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());
        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());

        System.out.println("Employee Ends");




    }
}
