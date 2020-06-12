package com.khelomore.AdminPanel.Vendor.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khelomore.AdminPanel.Vendor.model.Login;
import com.khelomore.AdminPanel.Vendor.service.Loginservice;
@RestController
@RequestMapping("/home")
public class AdminController 
{
@Autowired
Loginservice loginservice;

	@PostMapping("/loginuser")
	
	public String Logininfo(@RequestBody Login login) 
	{
		
	  System.out.println("login"+login.getPhonenumber());
//	  String usertoken = tokenservice.createToken(login.getPhonenumber());

	   return   loginservice.loginuser(login);
		
	}
}
