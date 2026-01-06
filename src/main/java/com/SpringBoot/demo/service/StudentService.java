package com.SpringBoot.demo.service;

import com.SpringBoot.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public  Student saveStudent(Student student);
    public Student getById(int id);
    public void deleteById(int id);
}
