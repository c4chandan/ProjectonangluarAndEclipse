package com.angular.angularProjectBackend;



import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.angular.DbConfig.DbConfig;
import com.angular.dao.personDao;
import com.angular.model.Person;


public class PersonTest {


	private static personDao persondao;

	

	@BeforeClass
	public static void init(){
		System.out.println("I m in init - start");

		//Created the object of Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);

		persondao=context.getBean(personDao.class,"ProductDao");


   	 	System.out.println("I m in init - end");

	}
	
/*	@Test
@Ignore
	public void hello()
	{
		person pObj=new person();
		
		pObj.setPersonName("Rahul");
		pObj.setAge(30);
		
		assertTrue("Not able to add User",persondao.registerPerson(pObj));
	}*/
	
	
	@Test
	@Ignore
	public void getAllProductsTest(){
		List<Person> uList=persondao.getAllPersons();
		Assert.assertNotEquals("Not Users Found...", uList.size(), 0);
	}
	
}
