package com.bl.employee_wage2;
import java.util.Scanner;
public class Emp_wage
{    public static final int Part_time =1;
    public static final int Full_time =2;

    public static final int Max_hours = 100;

    public static final int Max_days = 20;

    public static void main(String[] args)

    {

        System.out.println("Welcome to Employee Wage Computation");
        Scanner sc = new Scanner(System.in);
        //Employee Attendance UC-1
        int att = (int) (Math.random() * 10) % 2;
        if (att == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        //Calculating Wage Per Hour UC-2

        int hour_wage = 20;
        int full_day = 8;

        int wage = (hour_wage * full_day);

        System.out.println("Employee Daily wage is: " + wage);

        //Calculating PartTime UC-3


        int Emp_Hour = 0;
        int Emp_wage = 0;

        int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;

        //Using Switch Cases UC-4

        switch (EmpCheck) {
            case Part_time:
                Emp_Hour = 4;
                break;
            case Full_time:
                Emp_Hour = 8;
                break;
            default:
                Emp_Hour = 0;
        }
        Emp_wage = Emp_Hour * hour_wage;
        System.out.println("Your Wage: " + Emp_wage);

        // UC-5 calculating month salary
        int work_days = 20;
        int one_day_sal = 160;

        int monthly_wage = work_days * one_day_sal;
        System.out.println("monthly salary :" + monthly_wage);

        // UC-6 calculate total earning


        int total_hours = 0;
        int total_days = 0;
        double hrs_sal = 20;
        double total_earn = 0.0;
        System.out.println();

        while (total_hours < Max_hours && total_days < Max_days) {
            System.out.println("enter a number of hours worked today");
            int worked_hrs = sc.nextInt();
            total_hours += worked_hrs;
            total_days++;

            double daily_wages = worked_hrs * hrs_sal;
            total_earn += daily_wages;

            System.out.println("you earned rs. :" + daily_wages + "today");
            System.out.println("total hours worked :" + total_hours);
            System.out.println("total days worked :" + total_days);
            System.out.println("total salary earned " + total_earn);
        }
        System.out.println("you have reached maximum number of working hours or days");
        System.out.println("total hours worked :"+total_hours);
        System.out.println("total days worked :"+total_days);
        System.out.println("total earning in month :"+total_earn);
        sc.close();
    }


    }













