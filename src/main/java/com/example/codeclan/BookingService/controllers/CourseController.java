package com.example.codeclan.BookingService.controllers;

import com.example.codeclan.BookingService.models.Course;
import com.example.codeclan.BookingService.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}
