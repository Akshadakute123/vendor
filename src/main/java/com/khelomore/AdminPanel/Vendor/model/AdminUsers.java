package com.khelomore.AdminPanel.Vendor.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="UsersAdmin")
public class AdminUsers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private	String name;
	private String email;
	private String phone;
	private	String password;
//	private Timestamp createdOn;
//	private Timestamp updatedOn;
//	boolean phoneverified;
//	boolean emailverified;
	private boolean sendOTp;
	private boolean VerifyOtp;
//	boolean isverified;
//	private Timestamp UpdatedByStaffId;
//	private Timestamp CreatedBystaffId;
	public AdminUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminUsers(long id, String name, String email, String phone, String password, Timestamp createdOn,
			Timestamp updatedOn, boolean phoneverified, boolean emailverified, boolean sendOTp, boolean verifyOtp,
			boolean isverified, Timestamp updatedByStaffId, Timestamp createdBystaffId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		
		this.sendOTp = sendOTp;
		VerifyOtp = verifyOtp;
		
	}

	public boolean isSendOTp() {
		return sendOTp;
	}

	public void setSendOTp(boolean sendOTp) {
		this.sendOTp = sendOTp;
	}

	public boolean isVerifyOtp() {
		return VerifyOtp;
	}

	public void setVerifyOtp(boolean verifyOtp) {
		VerifyOtp = verifyOtp;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
