package com.SpringBoot.demo.serviceImpl;

import com.SpringBoot.demo.entity.Student;
import com.SpringBoot.demo.repository.StudentRepository;
import com.SpringBoot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
