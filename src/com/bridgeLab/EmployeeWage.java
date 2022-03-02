package com.bridgeLab;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To main");
        int randVal = (int) (Math.floor(Math.random()*10)%2);
          int wagePerHr=20;
        if(randVal==1) {
            int empHr = 8;
            int empWage = wagePerHr * empHr;

            System.out.print(empWage);
        }
        else
            System.out.println("Employee is Absent");

    }
}
