package com.bridgelabz.EmployeeWage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello welcome to employee wage computation program on master branch." );
        
        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) (Math.random() * 10) % 2;
        if(empCheck == IS_PRESENT) {
        	System.out.println("Employee is present");
            empHrs = 8;
        }else {
        	System.out.println("Employee is absent");
            empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage is : " + empWage);
    }
}
