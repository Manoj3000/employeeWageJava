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
        
        final int IS_FULL_TIME = 2;
        final int IS_PART_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) (Math.random() * 10) % 3;
        switch(empCheck) {
            case IS_FULL_TIME:
            	System.out.println("Employee is present for full time");
                empHrs = 8;
                break;
            case IS_PART_TIME: 
            	System.out.println("Employee is present for part time");
                empHrs = 4;
                break;
            default:
            	System.out.println("Employee is absent");
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage is : " + empWage);
    }
}
