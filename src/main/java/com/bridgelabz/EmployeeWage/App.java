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
        int empCheck = (int) (Math.random() * 10) % 2;
        if(empCheck == IS_PRESENT) {
        	System.out.println("Employee is present");
        }else {
        	System.out.println("Employee is absent");
        }
    }
}
