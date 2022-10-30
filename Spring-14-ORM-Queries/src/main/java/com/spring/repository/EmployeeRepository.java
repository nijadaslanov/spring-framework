package com.spring.repository;

import com.spring.entity.Department;
import com.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.tree.VariableHeightLayoutCache;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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


    @Query("SELECT e FROM Employee e WHERE e.email='tboncoeurr8@ucla.edu'")
    Employee getEmployeeDetail();


    @Query("SELECT e.salary  FROM Employee e WHERE e.email='tboncoeurr8@ucla.edu'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee  e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);


    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Optional<Employee> getEmployeeDetail(String email, int salary);


    // Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> getEmployeeSalaryNotEqual(int salary);


    // Like/contains
    @Query("SELECT e FROM Employee e WHERE e.firstName Like ?1")
    List<Employee> getEmployeeFirstNameLike(String pattern);


    // less than
    @Query("SELECT e FROM Employee  e where e.salary<?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);

    // greater than
    @Query("SELECT e FROM Employee  e where e.salary<?1")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    // Before
    @Query("SELECT e FROM Employee e where e.hireDate>?1")
    List<Employee> getEmployeeHiredDateBefore(LocalDate date);

    // Between
    @Query("SELECT e.salary from Employee e where e.salary Between ?1 And ?2")
    List<Employee> getEmployeeSalaryBetween(int salary, int salary2);


    //Null
    @Query("select e from Employee  e where e.email is not null")
    List<Employee> getEmployeeEmailIsNull();


    // Sorting in asc order
    @Query("SELECT e from Employee e order by e.salary")
    List<Employee> getEmployeeSalaryOrderAsc();

    @Query(value = "Select * from employee where salary ?1", nativeQuery = true)
    List<Employee> readEmployeeDetailBySalary(int salary);


































}
