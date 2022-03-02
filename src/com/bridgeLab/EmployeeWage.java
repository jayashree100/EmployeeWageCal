package com.bridgeLab;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To main");
        int randVal = (int) (Math.floor(Math.random()*10)%2);
        if(randVal==1) {

            System.out.print("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");

    }
}
