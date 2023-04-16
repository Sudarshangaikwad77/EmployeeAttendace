package com.bl.empwage;

public class Wage_FoR_Month {
   public static final int IS_PART_TIME =1;
  public static final   int IS_FULL_TIME =2;
    public static final int EMP_RATE_PER_HR =20;
    public static final int NUMBER_OF_WRK_DAYS=2;
    public static void main(String[] args) {

      //variables
        int emphr = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        //computation
        for (int day=0;day<NUMBER_OF_WRK_DAYS;day++) {
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case IS_PART_TIME:
                    emphr = 4;
                    break;
                case IS_FULL_TIME:
                    emphr = 8;
                    break;
                default:
                    emphr = 0;
            }
            empWage = emphr * EMP_RATE_PER_HR;
            totalEmpWage +=empWage;
            System.out.println("emmployee Wage : " + empWage);
        }
        System.out.println("total emp Wage :" +totalEmpWage);
    }
}
