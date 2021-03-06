package com.example.demo.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService)
	{
		this.studentService = studentService;
	}
	
	@GetMapping()
	public List<student> GetStudent()
	{
		return this.studentService.GetStudent(); 
	}

}
