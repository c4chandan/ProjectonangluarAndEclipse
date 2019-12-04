package com.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.angular.dao.personDao;
import com.angular.model.Person;

@Controller
public class personController {

	@Autowired
	personDao persondaoObj;

	@ResponseBody
	@RequestMapping(value = "/ListOfperson", method = RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<Person> getAllPerson() {
		List<Person> list = persondaoObj.getAllPersons();
		System.out.println("list is"+list+"");
	
		return list;

	}
	
	@ResponseBody
	@RequestMapping(value="/deletePerson/{personId}",method=RequestMethod.GET )
	public boolean deletePerson(@PathVariable int personId ) {
		System.out.println("i m in delete");
		Person pObj=persondaoObj.getPersonById(personId);
		persondaoObj.deletePerson(pObj);
		
		
		
		return true; 
		
	}
	
}
