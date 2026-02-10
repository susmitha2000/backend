package com.kep.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kep.backend.entity.Course;
import com.kep.backend.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    // 👉 ADD THIS METHOD
    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return repository.save(course);
    }
}
