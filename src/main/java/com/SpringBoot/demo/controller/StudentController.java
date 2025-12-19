package com.SpringBoot.demo.controller;


import com.SpringBoot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/home")
    public String home(){
        return "home";                  // this is a view page that is home page -> home.html
    }
    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students",service.getAllStudent());
        return "students";
    }
}
