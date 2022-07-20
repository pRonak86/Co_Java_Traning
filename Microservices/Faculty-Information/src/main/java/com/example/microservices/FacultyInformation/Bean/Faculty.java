package com.example.microservices.FacultyInformation.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "First_name")
	private String fu_fname;
	@Column(name="Last_name")
	private String fu_lname;
	@Column(name="Email_id")
	private String fu_email;
	@Column(name="Contact_Number")
	private Long fu_contact;
//	@Transient
//	private int port;
	
	@Column(name="Password")
	private String fu_password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFu_fname() {
		return fu_fname;
	}
	public void setFu_fname(String fu_fname) {
		this.fu_fname = fu_fname;
	}
	public String getFu_lname() {
		return fu_lname;
	}
	public void setFu_lname(String fu_lname) {
		this.fu_lname = fu_lname;
	}
	public String getFu_email() {
		return fu_email;
	}
	public void setFu_email(String fu_email) {
		this.fu_email = fu_email;
	}
	public Long getFu_contact() {
		return fu_contact;
	}
	public void setFu_contact(Long fu_contact) {
		this.fu_contact = fu_contact;
	}
	
	public Faculty(Long id, String fu_fname, String fu_lname, String fu_email, Long fu_contact, String fu_password) {
		super();
		this.id = id;
		this.fu_fname = fu_fname;
		this.fu_lname = fu_lname;
		this.fu_email = fu_email;
		this.fu_contact = fu_contact;
		this.fu_password = fu_password;
	}
	public Faculty()
	{
		
	}
	public String getFu_password() {
		return fu_password;
	}
	public void setFu_password(String fu_password) {
		this.fu_password = fu_password;
	}
//	public int getPort() {
//		return port;
//	}
//	public void setPort(int port) {
//		this.port = port;
//	}

}
