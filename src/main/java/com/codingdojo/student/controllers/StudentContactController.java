package com.codingdojo.student.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.student.models.Contact;
import com.codingdojo.student.models.Student;
import com.codingdojo.student.services.StudentContactService;

@Controller
public class StudentContactController {
	
	private final StudentContactService st;
	public StudentContactController(StudentContactService st) {
		this.st=st;
	}
	@GetMapping("/")
	public String index(Model model) {
		ArrayList<Student> student = st.allStudents();
		model.addAttribute("student", student);
		return "index.jsp";
	}
	@GetMapping("/student/new")
	public String create(@ModelAttribute("student") Student student) {
		return "new.jsp";
	}
	@PostMapping("/student/new")
	public String create(@ModelAttribute("student") Student student, BindingResult res, Model model) {
		Student s= st.createStudent(student);
		return "redirect:/";
	}
	@RequestMapping("/student/contact")
	public String add(Model model) {
		ArrayList<Student> student = st.allStudents();
		model.addAttribute("student", student);
		return "contact.jsp";
	}

	@PostMapping("/student/contact")
	public String add(@ModelAttribute("student") Student student, 
			@RequestParam("student") String stu,
			@RequestParam("address") String address,
			@RequestParam("city") String city,
			@RequestParam("state") String state) {
		Student s = st.findStudent(Long.valueOf(stu));
		Contact license = new Contact(s, address, city, state);
		s.setContact(license);
		st.createContact(license);
		
//		Student p = pS.findStudent(id);
//		Contact l=pS.createContact(license);
//		p.setContact(license);
		return "redirect:/";
	}
	
	
}
