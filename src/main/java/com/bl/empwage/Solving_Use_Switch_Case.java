package com.bl.empwage;

public class Solving_Use_Switch_Case {
   public static final int IS_PART_TIME =1;
  public static final   int IS_FULL_TIME =2;
    public static final int EMP_RATE_PER_HR =20;
    public static void main(String[] args) {

      //variables
        int emphr=0;
        int empWage=0;
        //computation
        int empcheck=(int) Math.floor(Math.random() *10) % 3;
        switch (empcheck)
        {
            case IS_PART_TIME:
                emphr=4;
                break;
            case IS_FULL_TIME:
                emphr=8;
                break;
            default:
                emphr=0;
        }
        empWage = emphr * EMP_RATE_PER_HR;
        System.out.println("emmployee Wage : " +empWage);

    }
}
