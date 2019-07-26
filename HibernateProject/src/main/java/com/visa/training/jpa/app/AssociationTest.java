package com.visa.training.jpa.app;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.domain.Account;
import com.visa.training.jpa.domain.Address;
import com.visa.training.jpa.domain.Customer;
import com.visa.training.jpa.domain.SavingsAccount;
import com.visa.training.jpa.domain.dal.JpaUtil;

public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		createAccountAndCustomerSeparately();
//		createAccountAndCustomerTogether();
//		testLazy();
		testManyToMany();

	}
	private static void testManyToMany() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Customer c = new Customer("gh","h","gf",new Date(System.currentTimeMillis()));
		Address a = new Address("sl1", "sl2", "blr", "ka", "56", "in");
        c.getAddress().add(a);
        
        em.persist(c);
        
        tx.commit();
        em.close();
		
		
	}
	private static void testLazy() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Customer c1 = em.find(Customer.class, 0);
		em.close();
		System.out.println(c1.getFirstname());
		Account a = c1.getAccounts().get(0);
		System.out.println(a.getBalance());
		
	}
	private static void createAccountAndCustomerSeparately() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer c = new Customer("fn","mn","ln",new java.sql.Date(System.currentTimeMillis()));
		SavingsAccount sa = new SavingsAccount(1234);
		
		sa.setC(c);
		em.persist(c);
		em.persist(sa);
		tx.commit();
		em.close();
	}
	private static void createAccountAndCustomerTogether() {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        Customer c = new Customer("fn", "mmn", "ln", new java.sql.Date(System.currentTimeMillis()));
        SavingsAccount sa = new SavingsAccount(1234);
        
        sa.setC(c);
        //em.persist(c);
        em.persist(sa);
        
        tx.commit();
        em.close();
        
    }

}
