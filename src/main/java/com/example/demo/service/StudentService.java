package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentReponsitory;
import com.example.demo.model.student;

@Service
public class StudentService {
	private final StudentReponsitory studentReponsitory;
	
	@Autowired
	public StudentService(StudentReponsitory studentReponsitory)
	{
		this.studentReponsitory = studentReponsitory;
	}
	
	public List<student> GetStudent()
	{
		return this.studentReponsitory.FindAllStudent();
	}

}
