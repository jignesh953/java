package com.dao;

import javax.transaction.Transaction;
import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.hibernate.sql.Insert;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.util.EmployeeUtil;

import antlr.collections.List;

public class EmployeeDao {
	public static void InsertEmployeeInfo(EmployeeInfo e)
	{
		Session session=EmployeeUtil.createSession();
		Transaction tr=Session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static void InsertEmployee(Employee e)
	{
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	public static List<Employee> getAllEmployee()
	{
		Session session=EmployeeUtil.createSession();
		List<Employee> list=session.createQuery("from Employee").list();
		session.close();
		return list;
	}
	public static Employee getEmployee(int eid) {
		Session session=EmployeeUtil.createSession();
		Employee e=session.get(Employee.class,eid);
		session.close();
		return e;

		
	}
	public static void deleteEmployee(int eid) {
		Session session=EmployeeUtil.createSession();
		Transaction tr=session.beginTransaction();
		Employee e=session.get(Employee.class,eid);
		session.delete(e);
		tr.commit();
		session.close();
	

		
	}
}
