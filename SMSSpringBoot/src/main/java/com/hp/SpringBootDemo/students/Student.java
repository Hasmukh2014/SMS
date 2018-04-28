package com.hp.SpringBootDemo.students;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.validation.constraints.Size;

@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="getEmailById", procedureName="getEmail",resultClasses= {Student.class},
parameters= {@StoredProcedureParameter(name="enrollmentNo",type=String.class,mode=ParameterMode.IN)})
	
})


@Entity
public class Student {
	@Id
	@Size(min=1,max=10,message="Enter the correct Value")
	private String enrollmentNumber;
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	
	public Student() {
		super();
		this.enrollmentNumber = "";
		this.firstname = "";
		this.lastname = "";
		this.email = "";
		this.mobile = "";
	}

	public Student(String enrollmentNumber, String firstname, String lastname, String email, String mobile) {
		super();
		this.enrollmentNumber = enrollmentNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobile = mobile;
	}

	public String getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(String enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [enrollmentNumber=" + enrollmentNumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
}
