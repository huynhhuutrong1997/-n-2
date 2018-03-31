package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.TaiKhoan;

public class demo {
	public static void main(String[] args) {
		fromTaiKhoan();
//		getTaiKhoan();
//		createTaiKhoan();
		ConnectionUtil.getSessionFactory().close();
	}
	private static void fromTaiKhoan() {
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
		
		try {

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			String HQL ="FROM TaiKhoan";
			Query query = (Query) session.createQuery(HQL);
			List<TaiKhoan> taikhoan =(List<TaiKhoan>)query.list();
			System.out.println(taikhoan);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	private static void getTaiKhoan() {
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
		
		try {

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			TaiKhoan user1 = (TaiKhoan) session.get(TaiKhoan.class,"user1");
			System.out.println(user1);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	private static void createTaiKhoan() {
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
		
		try {

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			TaiKhoan user4 = new TaiKhoan("user4", "123456");
			session.save(user4);
			session.getTransaction().commit();
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
