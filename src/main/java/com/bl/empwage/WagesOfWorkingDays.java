package com.bl.empwage;

public class WagesOfWorkingDays {
   public static final int IS_PART_TIME =1;
  public static final   int IS_FULL_TIME =2;
    public static final int EMP_RATE_PER_HR =20;
    public static final int NUMBER_OF_WRK_DAYS=2;
    public static final int MAX_HRS_IN_MONTH =10;
    public static void main(String[] args) {

      //variables
        int emphr = 0;
        int totalempHrs = 0;
        int totalWrkngDays = 0;

        //computation
        while (totalempHrs<=MAX_HRS_IN_MONTH && totalWrkngDays<NUMBER_OF_WRK_DAYS)
        {      totalWrkngDays ++;

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
            totalempHrs += emphr;
            System.out.println("Day# : "+totalWrkngDays +"emphrs : "+emphr);
        }
        int totalemmpwage = totalempHrs * EMP_RATE_PER_HR;
        System.out.println("total employee wage " +totalemmpwage);
    }
}
