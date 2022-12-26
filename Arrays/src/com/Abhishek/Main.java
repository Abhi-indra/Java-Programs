
// What is array?
        // -> Array is a collection of similar data types (primitive and non-primitive).

// Syntax of an Array
        // -> datatype[] variableName = new datatype[size];




package com.Abhishek;

public class Main {

    public static void main(String[] args) {
	    // Q: Store Roll no
        int rollNo = 4;

        // Q: Store name
        String name = "Abhishek";

        // Q Store n roll number
        /*
        int rollNo1 = 4;
        int rollNo2 = 4;
        int rollNo3 = 4;
        int rollNo4 = 4;
            .
            .
            .
            .
            .and so on with n numbers of time.
         */


       // example :- store 5 role number
//
//        int[] rollNumber = new int[5];
//        // or directly you can write
//        int[] rollNumber1 = {2, 3, 4, 5, 6};

        int[] rollnum; //declaration of an array, roll number is getting defined in stack
        rollnum = new int[5]; //initialization: actual memory creation (object is being created in the memory)[Heap Memory]

        System.out.println(rollnum[2]);
    }
}
