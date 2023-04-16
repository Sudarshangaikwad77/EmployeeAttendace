package com.bl.empwage;

public class EmpMainClass
{
    public static void main(String[] args)
    {
       //constant
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HR=20;
        //Variables
        int emp_hr=0;
        int empWage=0;
        //computation
        double empcheck=Math.floor(Math.random() * 10) %2;
        if (empcheck ==IS_FULL_TIME)
            emp_hr=8;
        else
            emp_hr=0;
        empWage=emp_hr * EMP_RATE_PER_HR;
        System.out.println("emp_wage : "+empWage);

    }


}
