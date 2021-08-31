package com.bridgelabz.employeewagebuilder;

import java.util.Random;

public class employeeWageBuilder {
    static final int WAGE_PER_HR = 20;
    static final int FULL_DAY_HR = 8;
    static final int PART_TIME_HR = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_HRS_PER_MONTH = 100;


    public static void main(String[] args) {
        System.out.println("......Welcome to Employee Wage Builder Program.....");
        Random random = new Random();
        int dailyEmpWage;
        int toalWage = 0;
        int totalWorkingHrs=0;
        int totalWorkingDays=0;

        while (totalWorkingHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < MAX_WORKING_DAYS){
            totalWorkingDays++;
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present for work full day ");
                    dailyEmpWage = WAGE_PER_HR * FULL_DAY_HR;
                    System.out.println("Employee daily wage on day is :" + dailyEmpWage);
                    toalWage += dailyEmpWage;
                    totalWorkingHrs += FULL_DAY_HR;
                    break;
                case 1:
                    System.out.println("Employee present for Halfday (part time)");
                    dailyEmpWage = WAGE_PER_HR * PART_TIME_HR;
                    System.out.println("Employee wage is :" + dailyEmpWage);
                    toalWage += dailyEmpWage;
                    totalWorkingHrs += PART_TIME_HR;
                    break;
                case 2:
                    System.out.println("Employee Absent for work on day");
            }
            System.out.println("Total Employee Wage  : " + toalWage);
            System.out.println("Number of Working Days:"+totalWorkingDays);
            System.out.println("Number of Working Hours:"+totalWorkingHrs);
        }
    }
}
