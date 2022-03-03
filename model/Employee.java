package com.example.REST1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee 
{
	    private Integer mobno;
	    private String fname;
	    private String mname;
	    private String lname;
	    private String email;
	   
	    public Employee() 
	    {
	    	
	    }
	    public Employee(Integer mobno, String fname,String mname,String lname, String email) 
	    {
	        this.mobno = mobno;
	        this.fname = fname;
	        this.email = email;
	        this.lname=lname;
	        this.mname=mname;
	    }
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer getId()
	    {
	        return mobno;
	    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
