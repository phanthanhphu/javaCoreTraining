package com.demo.controller;
import com.demo.model.Person;
import com.demo.service.StudentService;

import java.util.ArrayList;
import java.util.List;
public class StudentController implements StudentService {
	List<Person> persons;
    public StudentController() {
        this.persons = new ArrayList<>();
    }

    @Override
    public void add(Person person) {
        this.persons.add(person);
    }
    
    @Override
    public void showInfor() {
        this.persons.forEach(person -> System.out.println(person.toString()));
    }
    @Override
    public Person searchById(String id) {
        return this.persons.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }

}
