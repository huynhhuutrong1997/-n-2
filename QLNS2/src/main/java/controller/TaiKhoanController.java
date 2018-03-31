//package controller;
//
//import java.util.HashMap;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import model.*;
//
//@Controller
//@RequestMapping(value="/QLNSDispatcher")
//public class TaiKhoanController {
//	@RequestMapping(value="/login", method=RequestMethod.GET)
//	public String login(ModelMap mm) {
//		mm.put("tk", new TaiKhoan());
//		return "login";
//	}
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(@ModelAttribute(value = "tk") TaiKhoan tk, ModelMap mm, HttpSession session) {
//		if(tk.getTentaikhoan().equals("username")
//				&& tk.getMatkhau().equals("password")) {
//			session.setAttribute("username", tk.getTentaikhoan());
//		
//		return "welcome";
//	}else {
//		mm.put("message", "Tài khoản không đúng");
//		return "login";
//	}
//	}
//}
