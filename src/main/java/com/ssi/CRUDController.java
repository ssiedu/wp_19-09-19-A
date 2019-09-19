package com.ssi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CRUDController {
	
	
	
	@RequestMapping("hello")
	public void test(){
		System.out.println("@@@@@@@@@@@@@@@HELLO@@@@@@@@@@@@@@@");
	}
	
}
