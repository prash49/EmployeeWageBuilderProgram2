package com.bridgelabz.employeewagebuilder;

import java.util.Random;

public class employeeWageBuilder {
    static final int WAGEPERHR = 20;
    static final int FULLDAYHR = 8;

    public static void main(String[] args) {
        System.out.println("......Welcome to Employee Wage Builder Program.....");
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == 0) {
            System.out.println("Employee is present for work ");
            int dailyEmpWage = WAGEPERHR * FULLDAYHR;
            System.out.println("Employee daily wage: "+dailyEmpWage);
        } else {
            System.out.println("employee Absent for work");
        }
    }
}
