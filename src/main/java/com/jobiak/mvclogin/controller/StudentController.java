package com.jobiak.mvclogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvclogin.entity.Student;
import com.jobiak.mvclogin.mail.StudentRepository;
@Controller
public class StudentController {
	@Autowired
	StudentRepository repo;
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	public StudentController(StudentRepository repo) {
		this.repo = repo;
	}
	@RequestMapping(path="/check",method=RequestMethod.GET)
	public String redirect() {
		return "student";
	}
	@RequestMapping(path="/student",method=RequestMethod.POST)
	public String doLogin(@ModelAttribute("student")Student student) {
		repo.save(student);
		return "success1";
	}

}
