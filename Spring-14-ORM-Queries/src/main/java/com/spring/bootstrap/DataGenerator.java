package com.spring.bootstrap;

import com.spring.repository.CourseRepository;
import com.spring.repository.DepartmentRepository;
import com.spring.repository.EmployeeRepository;
import com.spring.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("----------REGION START-------------");

        System.out.println("findByCountry(\"Canada\") = " + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry(\"Canada\") = " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry(\"Asia\") = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println(regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------REGION ENDS---------");


        System.out.println("________Department Starts__________");

        System.out.println("findAllByDepartment(\"toys\") = " + departmentRepository.findAllByDepartment("Toys"));
        System.out.println(departmentRepository.findByDivisionIs("Health"));
        System.out.println(departmentRepository.findByDivisionEquals("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContaining(\"Hea\") " + departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));

        System.out.println("________Department Ends__________");


        System.out.println("_________Employee Starts__________");

        System.out.println("employeeRepository.findAllByEmail(\"tboncoeurr8@ucla.edu\") = " + employeeRepository.findAllByEmail("tboncoeurr8@ucla.edu"));
        System.out.println("employeeRepository.getEmployeeDetail() = " + employeeRepository.getEmployeeDetail());
        System.out.println("employeeRepository.getEmployeeSalary() = " + employeeRepository.getEmployeeSalary());

        System.out.println("_______Employee Ends_________");


        System.out.println("_______Course Start__________");

        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("courseRepository.findByCategoryOrderByName() = " + courseRepository.findByCategoryOrderByName("Spring"));
        System.out.println("courseRepository.existsByName(\"Rapid Spring Boot Application Development\") = " + courseRepository.existsByName("Rapid Spring Boot Application Development"));
        System.out.println("courseRepository.countByCategory(\"Spring\") = " + courseRepository.countByCategory("Spring"));
        System.out.println(courseRepository.findByNameStartsWith("R"));
        courseRepository.streamByCategory("Spring").forEach(System.out::println);

        System.out.println("__________Course End_________");


    }
}
