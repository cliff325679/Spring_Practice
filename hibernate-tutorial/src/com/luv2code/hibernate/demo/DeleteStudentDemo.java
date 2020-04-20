package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			int numStudent = 1;

			session.beginTransaction();

			System.out.println("Id: " + numStudent);
			Student myStudent = session.get(Student.class, numStudent);
			System.out.println("Delete: " + myStudent);
			// session.delete(myStudent);

			System.out.println("Delete 2!");
			session.createQuery("delete from Student where id=2").executeUpdate();

			session.getTransaction().commit();

			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}

}
