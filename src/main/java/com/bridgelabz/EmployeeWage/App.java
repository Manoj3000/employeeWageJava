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
        final int MONTH_DAYS = 20;
        final int WORKIN_HOURS = 100;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int days = 0;
        while(empHrs < WORKIN_HOURS && days < MONTH_DAYS){
            int empCheck = (int) (Math.random() * 10) % 3;
            switch(empCheck) {
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
        System.out.println("Total woring days : " + days);
        System.out.println("Total woring hours : " + empHrs);
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage for month is : " + empWage);
    }
}
