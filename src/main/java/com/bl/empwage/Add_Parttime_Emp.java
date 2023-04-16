package com.bl.empwage;

public class Add_Parttime_Emp
{
    public static void main(String[] args) {
        // constant
        int IS_PART_TIME = 1;
        int IS_FULL_TIE = 2;
        int EMP_RATE_HR = 20;
        //variables
        int empHr = 0;
        int empWage = 0;
        // computation
        double empcheck=Math.floor(Math.random() * 10) %3;
        if (empcheck == IS_PART_TIME)
            empHr = 4;
        else if (empcheck== IS_FULL_TIE)
        {
        empHr = 8;
        }
        empWage=empHr * EMP_RATE_HR;
        System.out.println("employee wage : "+empWage);
    }
}
