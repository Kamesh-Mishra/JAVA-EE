package com.kamesh.beans.UserDefinedCollections;

import java.util.List;

public class Company {

	private String companyName;
    private List<Employee> employees;
	
    public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void display()
    {
        System.out.println("Company: " + companyName);
        System.out.println("Empoyees:");
 
        // Iterating over using for each loop
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + "]";
	}
    
    
    
    
}
