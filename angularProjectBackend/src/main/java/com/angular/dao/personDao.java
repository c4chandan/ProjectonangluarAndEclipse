package com.angular.dao;

import java.util.List;

import com.angular.model.Person;

public interface personDao {

	public List<Person> getAllPersons();
	public boolean deletePerson(Person pObj);
	public Person getPersonById(int personId);

}
