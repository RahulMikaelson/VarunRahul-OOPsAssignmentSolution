package com.VarunAssmnt.AdminDepartment;

import com.VarunAssmnt.SuperDeapartment.Super_Department;

public class Admin_Department extends Super_Department{
	String deptname = " Admin Department ";
	String todaywork = " Complete your documents Submission ";
	String workdeadline = " Complete by EOD";
	public String departmentName() { 
	return deptname ;

	}
	public String getTodaysWork(){
		return todaywork;
	
	}
	public String getWorkDeadline(){
		return workdeadline;
		
}
}
