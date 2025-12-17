package com.SpringBoot.demo.serviceImpl;
import com.SpringBoot.demo.entity.Student;
import com.SpringBoot.demo.repository.Studentrepository;
import com.SpringBoot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ServiceImpl implements StudentService {
    @Autowired
    Studentrepository Studentrepository;
    public List<Student> getAllStudent() {
        return Studentrepository.findAll();
    }
}
