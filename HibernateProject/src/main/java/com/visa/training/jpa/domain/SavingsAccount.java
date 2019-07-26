package com.visa.training.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SA")
public class SavingsAccount extends Account {
	
	Customer c = new Customer();
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public SavingsAccount(float balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

}
