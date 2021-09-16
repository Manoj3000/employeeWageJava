package com.bridgelabz.EmployeeWage;

import java.util.Scanner;

public class App {
	public static final int IS_FULL_TIME = 2;
	public static final int IS_PART_TIME = 1;
	int month_days;
	int working_hours;
	int emp_rate_per_hours;
	String company_name;
	
	public int getMonth_days() {
		return month_days;
	}

	public void setMonth_days(int month_days) {
		this.month_days = month_days;
	}

	public int getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}

	public int getEmp_rate_per_hours() {
		return emp_rate_per_hours;
	}

	public void setEmp_rate_per_hours(int emp_rate_per_hours) {
		this.emp_rate_per_hours = emp_rate_per_hours;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public static int checkEmpWage(int workingHours, int monthDays, int empRatePerHours) {

		int empHrs = 0;
		int empWage = 0;
		int days = 0;
		while (empHrs < workingHours && days < monthDays) {
			int empCheck = (int) (Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs += 8;
				break;
			case IS_PART_TIME:
				empHrs += 4;
				break;
			default:
				empHrs += 0;
			}
			days++;
		}
		System.out.println("Total working Days taken: " + days);
		System.out.println("Total working Hours taken : " + empHrs);
		empWage = empHrs * empRatePerHours;
		return empWage;
	}

	public void setData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter company name : ");
		String temName = sc.nextLine();
		setCompany_name(temName);

		System.out.print("enter total working days : ");
		int temDays = sc.nextInt();
		setMonth_days(temDays);

		System.out.print("enter total working hours : ");
		int temHours = sc.nextInt();
		setWorking_hours(temHours);

		System.out.print("enter employee rate for per hour : ");
		int temWage = sc.nextInt();
		setEmp_rate_per_hours(temWage);
		
		System.out.println("---------- for " + company_name + "  ----------");
		
		int empWage =  checkEmpWage(temHours, temDays, temWage);
		System.out.println("Employee wage : " + empWage);
		System.out.println("");
	}

	public static void main(String[] args) {
		System.out.println("Hello welcome to employee wage computation program on master branch.");

		App company1 = new App();
		App company2 = new App();
		App company3 = new App();

		company1.setData();
		company2.setData();
		company3.setData();

	}
}
