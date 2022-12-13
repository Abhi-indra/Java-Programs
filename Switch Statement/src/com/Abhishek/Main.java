//Syntax of switch statements:-
                /*
                            switch(expression){
                            //case 1:
                                        body
                                        break;
                            //case 2:
                                        body
                                        break;
                            //case 3:
                                        body
                                        break;
                            default:
                                        break;
                           }
                 */



package com.Abhishek;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the fruit name");
	String fruit = input.next();

	switch(fruit){
        case "Mango":
            System.out.println("King of fruit");
            break;

        case "Apple":
            System.out.println("The apple color is red");
            break;

        case "Grapes":
            System.out.println("This is sweet and bitter in taste");

        default:
            System.out.println("None of the fruit is present");
            break;

    }
    }
}
