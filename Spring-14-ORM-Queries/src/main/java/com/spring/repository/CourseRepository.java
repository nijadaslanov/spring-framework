package com.spring.repository;

import com.spring.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.stream.Stream;


public interface CourseRepository extends JpaRepository<Course, Long> {

    // find all courses by category
    List<Course> findByCategory(String category);

    // find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    // checks if a course with provided name exists,return true if it exists, false otherwise
    boolean existsByName(String name);

    // returns the count of courses for the provided category
    int countByCategory(String category);


    // find all courses that start with the provided course name
    List<Course> findByNameStartsWith(String name);

    // FIND ALL COURSES BY CATEGORY AND RETURNS STREAM
    List<Course> streamByCategory(String category);

   // Stream<Course> streamByCategory(String category);






}
