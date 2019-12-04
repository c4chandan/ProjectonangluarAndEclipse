package com.angular.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.angular.dao.personDao;
import com.angular.model.Person;

@Repository("personDao")
@Transactional

public class personDaoImpl implements personDao {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Person> getAllPersons() {
		try {
			Session session = sessionfactory.getCurrentSession();
			Query query = session.createQuery("from com.angular.model.Person");
			List<Person> list=query.list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}
/*
	@Override
	public boolean registerPerson(person pObj) {
		try {
			Session session = sessionfactory.getCurrentSession();
			session.save(pObj);
			return true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}*/

	@Override
	public boolean deletePerson(Person pObj) {
		try {
			Session session=sessionfactory.getCurrentSession();
			session.delete(pObj);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Person getPersonById(int personId) {
	
		try {
			Session session=sessionfactory.getCurrentSession();
			Person pObj=session.get(Person.class, personId);
			return pObj;
		} catch (Exception e) {
		e.printStackTrace();
		}
		return null;
	}

}
