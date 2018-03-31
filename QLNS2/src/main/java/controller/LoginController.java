package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.TaiKhoan;
 
@Controller
public class LoginController {
	

   @RequestMapping("/QLNSDispatcher")  
   public ModelAndView login(HttpServletRequest request,
		   HttpServletResponse response, String TenTaiKhoan, String MatKhau) {
	   	String userName=request.getParameter("userName");  
	    String password=request.getParameter("password");
	    String message;
	   	SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
	
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			String SQL_QUERY ="from TaiKhoan where TenTaiKhoan =:TenTaiKhoan and MatKhau=:MatKhau";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter("TenTaiKhoan",userName);
			query.setParameter("MatKhau",password);
			List<TaiKhoan> taikhoan =(List<TaiKhoan>)query.list();
			if((taikhoan != null)&&(taikhoan.size()>0)) {
				message = "Welcome " +userName + ".";
			    return new ModelAndView("welcome",  
			    		  "message", message);  
			}else {
		
				message = "Tài Khoản không hợp lệ.";
		    	  return new ModelAndView("login", 
		    			  "message", message);
		   	
			}
   }
   @RequestMapping("/logout")
   public String logout(HttpSession session) {
	   session.removeAttribute("userName");
	   return "login";
   }
}