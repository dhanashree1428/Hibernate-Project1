package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   EntityManagerFactory entityManagerFactory=
		   Persistence.createEntityManagerFactory("vikas");
    
   EntityManager entityManager=entityManagerFactory.createEntityManager();
   
   EntityTransaction entityTransaction=entityManager.getTransaction();
   
   
   Employee employee=entityManager.find(Employee.class, 9);
   employee.setCno(465657778l);
   
   entityTransaction.begin();
   entityManager.merge(employee);
   entityTransaction.commit();
   }

}
