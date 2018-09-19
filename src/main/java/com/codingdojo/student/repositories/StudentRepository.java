package com.codingdojo.student.repositories;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.student.models.Student;

public interface StudentRepository extends CrudRepository <Student, Long> {
	ArrayList<Student> findAll();

	ArrayList<Student> findByFirstAndLast(String first, String last);

}