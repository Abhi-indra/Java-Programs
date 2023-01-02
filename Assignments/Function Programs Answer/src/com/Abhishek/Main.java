//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package com.Abhishek;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maxAns = max(a,b,c);
        int minAns = min(a,b,c);
        System.out.println("The max number : "+maxAns);
        System.out.println("The min number: "+minAns);
    }

    static int min(int a, int b, int c) {
        return (Math.min(c,Math.min(a,b)));
    }

    static int max(int a, int b, int c) {
        return (Math.max(c,Math.max(a,b)));
    }

}
