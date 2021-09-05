package com.VarunAssmnt.TechDeapartment;

import com.VarunAssmnt.SuperDeapartment.Super_Department;

public class Tech_Department extends Super_Department {
	String deptname = " Tech Department ";
	String todaywork = " Complete coding of module 1 ";
	String workdeadline = " Complete by EOD  ";
	String stackinfo = " Core Java";
	public  String departmentName(){ 
		return deptname ;
		}
		public String getTodaysWork(){
			return todaywork ;
		}
		public String getWorkDeadline(){
			return workdeadline ;
     	}
		public String getTechStackInformation() {
			return stackinfo ;
		}

}
