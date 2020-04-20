package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			int updateId=1;
			session.beginTransaction();

			System.out.println("The UpdateId: "+updateId);
			Student myStudent = session.get(Student.class, updateId);

			System.out.println("Updating...");
			myStudent.setFirstName("Moodkiller");
			
			session.getTransaction().commit();

			//New			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery(" update Student set email='foo@luv2code.com' ").executeUpdate();
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}

}
