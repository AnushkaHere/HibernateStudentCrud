package com.hibernate.student.controller;

import com.hibernate.student.dao.StudentDao;
import com.hibernate.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    // CRUD - create
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student) {
        studentDao.save(student);
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
    @PutMapping("/students/{studentId}")
    public String updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        Student existingStudent = studentDao.findById(studentId);
        if(existingStudent != null){
            existingStudent.setEmail(student.getEmail());
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            studentDao.update(existingStudent);
            return "Student updated successfully";
        } else {
            return "Student not found";
        }
    }


    // CRUD - delete
    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        studentDao.deleteById(studentId);
        return "Student with id: "+studentId+" deleted successfully";
    }
}
