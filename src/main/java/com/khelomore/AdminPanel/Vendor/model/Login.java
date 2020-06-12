package com.khelomore.AdminPanel.Vendor.model;

public class Login {
	
		
		private String phonenumber;
		private String Email;
		private String Password;
		public Login() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Login(String phonenumber, String email, String password) {
			super();
			this.phonenumber = phonenumber;
			Email = email;
			Password = password;
		}
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		
}

