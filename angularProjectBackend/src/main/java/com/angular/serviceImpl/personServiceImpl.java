package com.angular.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.dao.personDao;
import com.angular.model.Person;
import com.angular.serviceDao.peronServiceDao;

@Service("personServiceObj")
@Transactional
public class personServiceImpl implements peronServiceDao {

	@Autowired
	personDao personDaoObj;
	
/*	@Override
	public boolean registerPerson(person pObj) {
		
		return personDaoObj.registerPerson(pObj);
	}*/

	@Override
	public List<Person> getAllPersons() {

		return personDaoObj.getAllPersons();
	}

	@Override
	public boolean deletePerson(Person pObj) {
				return personDaoObj.deletePerson(pObj);
	}

	@Override
	public Person getPersonById(int personId) {
		return personDaoObj.getPersonById(personId);
	}

}
