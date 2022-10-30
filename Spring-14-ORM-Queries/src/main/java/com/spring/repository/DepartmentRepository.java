package com.spring.repository;

import com.spring.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    // Display All Departments in the furniture department


    List<Department> findAllByDepartment(String department);


    //Display all Departments in the Health Division

    List<Department> findByDivisionIs(String division);

    List<Department> findByDivisionEquals(String division);


    //Display top 3 departments with division name includes 'Hea',without duplicates

    List<Department> findDistinctTop3ByDivisionContaining(String str);

    @Query("select d from  Department d where d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    List<Department> retrieveDepartmentByDivision(String division);


    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);


}
