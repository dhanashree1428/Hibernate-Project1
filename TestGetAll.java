package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	EntityManagerFactory entityManagerFactory=
			Persistence.createEntityManagerFactory("vikas");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	String sql="SELECT e FROM Employee e";//HQL Query
	Query query=entityManager.createQuery(sql);
	
	List<Employee> employees= query.getResultList();
	for (Employee e : employees) { //for each method
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getEmail());
		System.out.println(e.getCno());
		System.out.println("========================");
	}
	}

}
