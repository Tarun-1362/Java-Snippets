package com.ManyToManyDependency.bean;


//dependent object
public class Courses 
{
	String cid;
	String cnmae;
	int ccost;
	
	
	public Courses(String cid, String cnmae, int ccost) {
		super();
		this.cid = cid;
		this.cnmae = cnmae;
		this.ccost = ccost;
	}

}
