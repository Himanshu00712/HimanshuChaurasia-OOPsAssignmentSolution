package com.greatlearning.main;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

public class Driver {

	public static void main(String [] args)
	{
		SuperDepartment obj1 = new AdminDepartment();
		SuperDepartment obj2 = new HrDepartment();
		SuperDepartment obj3 = new TechDepartment();
		
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+ obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
	
		System.out.println();
		
		System.out.println("Welcome to "+ obj2.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
	
		System.out.println();
		
		System.out.println("Welcome to "+ obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
	}
	
}
