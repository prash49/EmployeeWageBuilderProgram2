package com.bridgelabz.employeewagebuilder;

import java.util.Random;

public class employeeWageBuilder {
    static final int WAGEPERHR = 20;
    static final int FULLDAYHR = 8;
    static final int PARTTIMEHR = 4;


    public static void main(String[] args) {
        System.out.println("......Welcome to Employee Wage Builder Program.....");
        Random random = new Random();
        int dailyEmpWage;
        int empCheck = random.nextInt(3);
        if (empCheck == 0) {
            System.out.println("Employee is present for work full day ");
            dailyEmpWage = WAGEPERHR * FULLDAYHR;
            System.out.println("Employee daily wage: " + dailyEmpWage);
        } else if (empCheck == 1) {
            System.out.println("Employee present for Halfday (part time)");
            dailyEmpWage = WAGEPERHR * PARTTIMEHR;
            System.out.println("Employee wage: "+dailyEmpWage);
        } else {
            System.out.println("Employee Absent for work");
        }
    }
}
