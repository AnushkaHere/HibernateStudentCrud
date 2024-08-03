package com.hibernate.student.dao;

import com.hibernate.student.entity.Student;

import java.util.List;

public interface StudentDao {

    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> findAll();

    public void update(Student student);

    public void deleteById(Integer id);

}
