/*
	    Syntax of If statement:
	    if(boolean expression T or F){
	        //body
	    }else{

	    }
	 */
// Example if the salary is greater than 10,000 than ive bonus of 2000 otherwise give bonus of 1000

package com.Abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of Person Salary");
        long salary = input.nextLong();

        if(salary > 10000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }
        System.out.println("The salary of the person after bonus is :- "+salary);

    }
}
