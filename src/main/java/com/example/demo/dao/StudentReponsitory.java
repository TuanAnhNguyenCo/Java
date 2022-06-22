package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;

@Repository
public interface StudentReponsitory extends JpaRepository<student,String>{
	@Query("select * from student")
	public List<student> FindAllStudent();

}
