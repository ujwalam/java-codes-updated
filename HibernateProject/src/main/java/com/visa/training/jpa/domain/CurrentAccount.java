package com.visa.training.jpa.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CA")
public class CurrentAccount extends Account{
	
	@Column(name = "OD_limit")
	float ODlimit;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentAccount(float balance,float ODlimit) {
		super(balance);
		this.ODlimit = ODlimit;
		// TODO Auto-generated constructor stub
	}
	public float getODlimit() {
		return ODlimit;
	}
	public void setODlimit(float oDlimit) {
		ODlimit = oDlimit;
	}
	

}
