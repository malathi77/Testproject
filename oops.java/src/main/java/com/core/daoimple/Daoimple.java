package com.core.daoimple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.core.hiber.dao.Dao;
import com.core.oops.pojo.Employee;

public class Daoimple implements Dao{

	public void insert() {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory ses=con.buildSessionFactory();
		Session s=ses.openSession();
		Employee obj=new Employee();
		obj.setEmpid(7687);
		obj.setEmpname("malathi");
		obj.setDesingnation("developer");
		obj.setSalary(87987);
		Transaction tra=s.beginTransaction();
	s.save(obj);
	System.out.println("object as been sucessfully saved!!!!!!!");
	tra.commit();
	s.close();
	ses.close();
		
		
	}

}
