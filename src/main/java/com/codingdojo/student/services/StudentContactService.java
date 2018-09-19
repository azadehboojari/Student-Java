package com.codingdojo.student.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.student.models.Contact;
import com.codingdojo.student.models.Student;
import com.codingdojo.student.repositories.ContactRepository;
import com.codingdojo.student.repositories.StudentRepository;

@Service
public class StudentContactService {
	private final StudentRepository studentRepo;
	private final ContactRepository contactRepo;

	public StudentContactService (StudentRepository studentRepo, ContactRepository contactRepo) {
		this.studentRepo= studentRepo;
		this.contactRepo=contactRepo;
		}
	
	public ArrayList<Student> allStudents(){
		return studentRepo.findAll();
		}

	public Student createStudent(Student p) {
		return studentRepo.save(p);
	}
	public Student findStudent(Long id) {
		Optional<Student> optionalStudent = studentRepo.findById(id);
		if(optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	public ArrayList<Contact> allContact(){
		return contactRepo.findAll();
	}
	public Contact createContact(Contact c) {
		return contactRepo.save(c);
	}
	public Contact findContact(Long id) {
		Optional<Contact> optionalContact = contactRepo.findById(id);
		if(optionalContact.isPresent()) {
			return optionalContact.get();
		} else {
			return null;
		}
	}

}
