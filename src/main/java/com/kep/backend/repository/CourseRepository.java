package com.kep.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kep.backend.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
