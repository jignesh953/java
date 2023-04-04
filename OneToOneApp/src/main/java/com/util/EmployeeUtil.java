package com.util;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.EmployeeInfo;

public class EmployeeUtil {

		public static Session createSession()
		{
			SessionFactory sf=new Configuration()
					.addAnnotatedClass(EmployeeInfo.class)
					.addAnnotatedClass(Employee.class)
					.configure()
					.buildSessionFactory();
			Session session=(Session) sf.openSession();
			return session;

		}
}
