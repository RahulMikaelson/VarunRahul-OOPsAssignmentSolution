package com.VarunAssmnt.MainDriver;

import com.VarunAssmnt.AdminDepartment.Admin_Department;
import com.VarunAssmnt.HRDeapartment.HR_Department;
import com.VarunAssmnt.TechDeapartment.Tech_Department;
public class Driver_Class {

	public static void main(String[] args) {
	    Admin_Department ad = new Admin_Department();
		HR_Department hrd = new HR_Department();
		Tech_Department td = new Tech_Department();
		
		//////Admin Dept
		
		System.out.println("------------------------------");
		System.out.println("Welcome to" +ad.departmentName());
		System.out.println("Today's Work :" +ad.getTodaysWork());
		System.out.println("Dead Line    :" +ad.getWorkDeadline());
		System.out.println("Day Status   :" +ad.isTodayAHoliday());
		
		
		
		////// Hr Dept 
		
		System.out.println("------------------------------");
		System.out.println("Welcome to" +hrd.departmentName());
		System.out.println("Today's Work :" +hrd.getTodaysWork());
		System.out.println("Dead Line    :" +hrd.getWorkDeadline());
		System.out.println("Activity     :" +hrd.doActivity());
		System.out.println("Day Status   :" +hrd.isTodayAHoliday());
		
		
		
		////// Tech	Dept	
		System.out.println("------------------------------");
		
		System.out.println("Welcome to" +td.departmentName());
		System.out.println("Today's Work :" +td.getTodaysWork());
		System.out.println("Dead Line    :" +td.getWorkDeadline());
		System.out.println("Stack INFO   :" +td.getTechStackInformation());
		System.out.println("Day Status   :" +td.isTodayAHoliday());
		
		
		
	}

}
