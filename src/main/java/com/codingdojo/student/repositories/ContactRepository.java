
package com.codingdojo.student.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.student.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository <Contact, Long> {
	ArrayList<Contact> findAll();


}
