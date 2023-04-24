package com.bl.empwage;

public class Wage_Builder {
    public static final int IS_PART_TIME =1;
  public static final   int IS_FULL_TIME =2;
  private final String company ;
  private final int em_hr_rate;
  private final int num_wrkng_days ;
  private final int max_hrs_month ;
  private int total_emp_wage ;


  public Wage_Builder(String company,int em_hr_rate,int num_wrkng_days,int max_hrs_month)
  {
      this.em_hr_rate = em_hr_rate;
      this.company = company;
      this.max_hrs_month = max_hrs_month;
      this.num_wrkng_days = num_wrkng_days;
  }
  public void compute_wage() {
      //variables
      int emphr = 0;
      int totalempHrs = 0;
      int totalWrkngDays = 0;

      //computation
      while (totalempHrs <= max_hrs_month && totalWrkngDays < num_wrkng_days) {
          totalWrkngDays++;

          int empcheck = (int) Math.floor(Math.random() * 10) % 3;
          switch (empcheck) {
              case IS_PART_TIME:
                  emphr = 4;
                  break;
              case IS_FULL_TIME:
                  emphr = 8;
                  break;

          }
          totalempHrs += emphr;
          System.out.println("Day# : " + totalWrkngDays + " emphrs : " + emphr);
      }
      total_emp_wage = totalempHrs * em_hr_rate;
      System.out.println("total employee wage " +total_emp_wage);
  }
        @Override
                public String toString()
      {
           return " Total emp wage for company " + company + " is " +total_emp_wage;
      }

    public static void main(String[] args) {
        Wage_Builder d_mart = new Wage_Builder("d-mart",20,2,10);
        Wage_Builder flipcart = new Wage_Builder("flipcart",54,3,51);
        d_mart.compute_wage();
        System.out.println(d_mart);
        flipcart.compute_wage();
        System.out.println(flipcart);


  }


}
