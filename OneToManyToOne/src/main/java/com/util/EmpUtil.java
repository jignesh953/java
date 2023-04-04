package com.util;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Dept;
import com.bean.Emp;

public class EmpUtil {
	public static Session creatSession() {
		SessionFactory sf=new Configuration()
				.addAnnotatedClass(Dept.class)
				.addAnnotatedClass(Emp.class)
				.configure()
				.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		return (Session) session;
		
	}
}
