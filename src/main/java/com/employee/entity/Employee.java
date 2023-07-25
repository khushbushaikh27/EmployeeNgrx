package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eID;
	private String eFullName;
	private String eCompanyName;
	private String eDesignation;
	private double eSalary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer geteID() {
		return eID;
	}


	public void seteID(Integer eID) {
		this.eID = eID;
	}


	public String geteFullName() {
		return eFullName;
	}


	public void seteFullName(String eFullName) {
		this.eFullName = eFullName;
	}


	public String geteCompanyName() {
		return eCompanyName;
	}


	public void seteCompanyName(String eCompanyName) {
		this.eCompanyName = eCompanyName;
	}


	public String geteDesignation() {
		return eDesignation;
	}


	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}


	public double geteSalary() {
		return eSalary;
	}


	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}


	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", eFullName=" + eFullName + ", eCompanyName=" + eCompanyName
				+ ", eDesignation=" + eDesignation + ", eSalary=" + eSalary + "]";
	}
	
	

}
