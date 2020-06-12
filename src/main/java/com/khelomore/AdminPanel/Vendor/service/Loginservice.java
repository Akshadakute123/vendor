package com.khelomore.AdminPanel.Vendor.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khelomore.AdminPanel.Vendor.Repository.UserRepository;
import com.khelomore.AdminPanel.Vendor.model.AdminUsers;
import com.khelomore.AdminPanel.Vendor.model.Login;
@Service
 public class Loginservice {
	 
	 @Autowired
	 UserRepository repository;
	 @Autowired
	 TokenService tokenservice;
	public  String loginuser(Login login) {
		
//		long phone = login.getPhonenumber();
         
		Optional<AdminUsers> newlogin = repository.findByphone(login.getPhonenumber());
	System.out.println(newlogin);

		if(newlogin.isPresent())
		{
			if(newlogin.get().isSendOTp()&& newlogin.get().isVerifyOtp()==true)
			{
				String usertoken = tokenservice.createToken(newlogin.get().getPhone());
					
				System.out.println(usertoken);
				
				return usertoken;
				
			}
			}
			return "not authenticate user";
		

	}


}
