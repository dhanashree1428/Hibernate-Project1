package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGet {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Employee employee=entityManager.find(Employee.class,5);//to get the details of employee
	
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getEmail());
	System.out.println(employee.getCno());
}
}
