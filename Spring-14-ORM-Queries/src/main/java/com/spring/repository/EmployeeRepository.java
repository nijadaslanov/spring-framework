package com.spring.repository;

import com.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    // Display all employees with email address ' '

    List<Employee> findAllByEmail(String email);

    // Display All Employees with FirstName and Lastname show all with an email address

    List<Employee> findAllByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    //Display All Employees that first name is not ' '


    List<Employee> findAllByFirstNameIsNot(String str);


    // Display All employees where last name starts with ' '

    List<Employee> findAllByLastNameStartingWith(String str);


    // Display All Employees with salaries higher than ' '

    List<Employee> findAllBySalaryGreaterThan(Integer salary);


    // Display all employees with salaries less than

    List<Employee> findAllBySalaryLessThanEqual(Integer salary);

    // Display all employees that has been hired between dates

    List<Employee> findAllByHireDateBetween(LocalDate startDate, LocalDate endDate);


    // Display all employees where salaries are greater and equal to '' in order

    List<Employee> findAllBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);


    //Display top unique 3 employees that is making less than ''


    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    //Display all employees that don't have email address

    List<Employee> findAllByEmailIsNull();



























}
