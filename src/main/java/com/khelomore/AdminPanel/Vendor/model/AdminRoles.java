package com.khelomore.AdminPanel.Vendor.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "RolesAdmin")
public class AdminRoles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private ERole rolename;
//	private String routePermission;
//	private String datapermission;
//	private Timestamp createdOn;
//	private Timestamp updatedOn;
//	private Timestamp UpdatedByStaffId;
//	private Timestamp CreatedBystaffId;
	public AdminRoles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminRoles(long id, ERole rolename, String routePermission, String datapermission, Timestamp createdOn,
			Timestamp updatedOn, Timestamp updatedByStaffId, Timestamp createdBystaffId) {
		super();
		this.id = id;
		this.rolename = rolename;
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ERole getRolename() {
		return rolename;
	}
	public void setRolename(ERole rolename) {
		this.rolename = rolename;
	}
	
}
