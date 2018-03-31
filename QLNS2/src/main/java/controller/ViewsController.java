package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewsController {
		
		@RequestMapping("/")
		public String Viewindex() {
			return "index" ;
		}
		@RequestMapping("/index")
		public String Viewindex1() {
			return "index" ;
		}
		@RequestMapping("/login")
		public String Viewlogin() {
			return "login" ;
		}
		
	
}
