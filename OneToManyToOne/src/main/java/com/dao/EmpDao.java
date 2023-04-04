package com.dao;

import javax.transaction.Transaction;
import javax.websocket.Session;

import com.bean.Dept;
import com.bean.Emp;
import com.util.EmpUtil;

import antlr.collections.List;

public class EmpDao {
	public static void insertDept(Dept d) {
		Session session=EmpUtil.creatSession();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
	}
	public static void insertEmp(Emp d) {
		Session session=EmpUtil.creatSession();
		Transaction tr=session.beginTransaction();
		session.save(d);
		tr.commit();
		session.close();
	}
	public static List<Dept> getAllDept() {
		Session session=EmpUtil.creatSession();
		List<Dept> list=session.createQuery("from Dept").list();
		session.close();
		return list;
		
 	}
	public static Dept getDept(int did) {
		Session session=EmpUtil.creatSession(); 
		Dept d=session.get(Dept.class,did);
		session.close();
		return d;
		
		
	}
}
