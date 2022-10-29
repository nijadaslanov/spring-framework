package com.spring.repository;

import com.spring.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,String> {

    // Display All Departments in the furniture department


    List<Department>findAllByDepartment(String department);


    //Display all Departments in the Health Division

    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);




















}
