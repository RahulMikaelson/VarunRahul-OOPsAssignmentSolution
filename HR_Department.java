package com.VarunAssmnt.HRDeapartment;

import com.VarunAssmnt.SuperDeapartment.Super_Department;

public class HR_Department extends Super_Department {
	String deptname = " HR Department ";
	String todaywork = " Fill today’s worksheet and mark your attendance ";
	String workdeadline = " Complete by End Of Day ";
	String activity = " team Lunch ";
	public  String departmentName() { 
		return deptname ;
		}
		public String getTodaysWork(){
			return todaywork;
		}
		public String getWorkDeadline(){
			return workdeadline;
     	}
        public String doActivity() {
	        return activity;
}

}
