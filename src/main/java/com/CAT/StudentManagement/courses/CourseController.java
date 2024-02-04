package com.CAT.StudentManagement.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/courses")
@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/list")
    List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    Course getCourseById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @PostMapping("/add")
    boolean addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/update")
    boolean updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    boolean deleteCourse(@PathVariable int id){
        return courseService.deleteCourse(id);
    }
}
