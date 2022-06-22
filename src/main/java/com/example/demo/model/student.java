 package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.sym.Name;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Configuration
public class student {
	private String id;
	private String first_name;
	private String last_name;
	private LocalDate dob;
	private Character gender;
	private String address;
	private String note;
	private String class_id;
	
}
