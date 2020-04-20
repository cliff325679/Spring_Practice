package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + ": membership");
	}

	public boolean addSillyMember() {

		System.out.println(getClass() + ": SillyMember");
		
		return true;
	}
}
