package com.bl.empwage;

public class EmpWage {

    public final String Company;
    public final int working_days;
    public final int monthly_hour;
    public final int Per_hour_salary;

    public int totalWage;

    public EmpWage(String company, int workingDays, int monthlyHour, int Per_hour_salary) {
        this.Company = company;
        this.working_days = workingDays;
        this.monthly_hour = monthlyHour;
        this.Per_hour_salary = Per_hour_salary;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String toString() {

        return "Total Employee Wage for Comapany: " + Company + " is:" + totalWage;
    }
}

