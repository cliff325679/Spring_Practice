package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		
		Session theSession = entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery = theSession.createQuery("from Employee", Employee.class);
		
		List<Employee> result = theQuery.getResultList();
		
		return result;
	}

	@Override
	public Employee findById(int theId) {
		
		Session theSession = entityManager.unwrap(Session.class);
		
		Employee employee = theSession.get(Employee.class, theId);
		
		return employee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		Session theSession = entityManager.unwrap(Session.class);
		
		theSession.saveOrUpdate(theEmployee);	
	}

	@Override
	public void deleteById(int theId) {


		Session theSession = entityManager.unwrap(Session.class);
		
		Query theQuery = theSession.createQuery("delete from Employee where id=:employeeid");
		
		theQuery.setParameter("employeeid", theId);
		
		theQuery.executeUpdate();		
	}

}
