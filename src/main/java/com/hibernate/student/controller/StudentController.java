package com.hibernate.student.controller;

import com.hibernate.student.dao.StudentDao;
import com.hibernate.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    // CRUD - create
    @PostMapping("/students")
    public String addStudent(@RequestBody Student stud) {
        studentDao.save(stud);
        return "Student saved successfully";
    }

    // CRUD - reading a single object
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Integer studentId) {
        return studentDao.findById(studentId); // Jackson
    }

    // CRUD - reading all objects
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentDao.findAll(); // JSON array - Jackson
    }

    // CRUD - update
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student stud) {
        studentDao.update(stud);
        return "Student updated successfully";
    }

    // CRUD - delete
    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        studentDao.deleteById(studentId);
        return "Student with id: "+studentId+" deleted successfully";
    }
}
