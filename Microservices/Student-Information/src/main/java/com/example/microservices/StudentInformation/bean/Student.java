package com.example.microservices.StudentInformation.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "First_Name")
	private String firstName;
	@Column(name = "Last_Name")
	private String lastName;
	@Column(name = "Email_Id")
	private String emailID;
	@Column(name = "Contact_Number")
	private Long contactNumber;
	@Column(name = "Password")
	private String s_Password;
	public Long getId() {
		return Id;
	}
	public Student()
	{
		
	}
	
	public Student(Long id, String firstName, String lastName, String emailID, Long contactNumber, String s_Password) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
		this.contactNumber = contactNumber;
		this.setS_Password(s_Password);
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getS_Password() {
		return s_Password;
	}
	public void setS_Password(String s_Password) {
		this.s_Password = s_Password;
	}
	

}
