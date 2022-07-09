package com.example.SampleWebProject.AWSEC2webAPP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainConroller {
	
//	@RequestMapping(method = RequestMethod.GET,path = "/")
	@GetMapping("/")
	public String getPage()
	{
		return "index";
	}

}
