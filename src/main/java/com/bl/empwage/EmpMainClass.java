package com.bl.empwage;

public class EmpMainClass
{
    public static void main(String[] args)
    {
        System.out.println("welcome to employee wage project");
        int attendance = (int) (Math.random() *10) %2;
        if (attendance == 1)
            System.out.println("employee is present ");
        else
            System.out.println("employee is absent");
    }
}
