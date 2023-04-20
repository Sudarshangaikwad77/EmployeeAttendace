package com.bl.employee_wage2;

public class Emp_wage
{
    public static void main(String[] args) {

    System.out.println("Welcome to Employee Wage Computation");
        //Employee Attendance UC-1
        int att = (int)(Math.random() * 10) % 2;
        if (att==1){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent");
        }
}
}
