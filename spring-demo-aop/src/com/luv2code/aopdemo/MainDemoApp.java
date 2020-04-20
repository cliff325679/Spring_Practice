package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		theAccountDAO.addAccount(new Account(),true);
		theAccountDAO.doWork();
		
		
		System.out.println("\n-------------");
		
		theMembershipDAO.addSillyMember();
		theMembershipDAO.addAccount();


		context.close();
	}

}
