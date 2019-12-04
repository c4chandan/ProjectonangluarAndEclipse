package com.angular.serviceDao;

import java.util.List;

import com.angular.model.Person;

public interface peronServiceDao {
/*
	public boolean registerPerson(person pObj);*/
	public List<Person> getAllPersons();

	public boolean deletePerson(Person pObj);
	public Person getPersonById(int personId);
}
