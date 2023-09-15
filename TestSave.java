package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

public static void main(String[] args) {
		// TODO Auto-generated method stub
   EntityManagerFactory entityManagerFactory=
		   Persistence.createEntityManagerFactory("vikas");//for connection
   
   EntityManager entityManager=entityManagerFactory.createEntityManager();//methods for db operations
   
   EntityTransaction entityTransaction=entityManager.getTransaction();//key
   
   Employee employee=new Employee();
   employee.setName("abd");
   employee.setEmail("abc@mail.com");
   employee.setCno(956110959);
   
   entityTransaction.begin();//to establish the connection
   entityManager.persist(employee);//to save the entity
   entityTransaction.commit();//
	}
}
