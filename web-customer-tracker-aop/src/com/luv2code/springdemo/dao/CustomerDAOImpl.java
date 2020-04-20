package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		Session theSession = sessionFactory.getCurrentSession();

		Query<Customer> theQuery = theSession.createQuery("from Customer order by lastName", Customer.class);

		List<Customer> result = theQuery.getResultList();

		return result;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		Session theSession = sessionFactory.getCurrentSession();

		theSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theId) {
		Session theSession = sessionFactory.getCurrentSession();
		Customer theCustomer = theSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session theSession = sessionFactory.getCurrentSession();
		Query theQuery = theSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
	}

}
