package service;

import model.Person;

public interface StudentService {
	
	//4 .Interface segregation principle
	public void add(Person person);

	public void showInfor();

	public Person searchById(String id);
}
