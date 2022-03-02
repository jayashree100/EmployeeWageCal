package com.bridgeLab;

public class EmployeeWage {
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;

    public static void main(String[] args) {
        System.out.println("Welcome To main");
        int empWageperHr=20;

        int randVal = (int) (Math.floor(Math.random()*10)%3);
          if(randVal==1) {
                    int empHr=4;
                    int empWage=empWageperHr*empHr;
                    System.out.println(empWage);


                  }
        else if(randVal==2) {
            int empHr = 8;
            int empWage = empWageperHr * empHr;
            System.out.println(empWage);

        }
        else
            System.out.println("Employee is Absent");

    }
}
