package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.TaiKhoan;

public class test {
	public static void main(String[] args) {
//		TaiKhoan tk = new TaiKhoan("user2", "123");
		SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
		
		try {

		
			Session session = sessionFactory.openSession();

			
//			 session.beginTransaction(); session.save(tk);
//			 session.getTransaction().commit();
			 

			TaiKhoan tktam = (TaiKhoan) session.get(TaiKhoan.class, "user");
			System.out.println();
			System.out.println(tktam.getMatkhau());
			System.out.println(tktam.getTentaikhoan());

			sessionFactory.close();
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
