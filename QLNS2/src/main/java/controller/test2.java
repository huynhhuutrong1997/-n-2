package controller;

import java.util.List;
import model.TaiKhoan;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class test2 {
	public static void check(String TenTaiKhoan, String MatKhau) {
		
		
	}
	public static void main(String[] args) {
		
		String TenTaiKhoan = null;
		String MatKhau = null;
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
	try {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String SQL_QUERY ="from TaiKhoan where TenTaiKhoan = :TenTaiKhoan";
		Query query = session.createQuery(SQL_QUERY);
		
		query.setParameter("TenTaiKhoan","huutrong");
//		query.setParameter(1,MatKhau);
		List<TaiKhoan> taikhoan = (List<TaiKhoan>)query.list();
		System.out.println(taikhoan);
		System.out.println(TenTaiKhoan);
		System.out.println(MatKhau);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		sessionFactory.close();
	}

}
