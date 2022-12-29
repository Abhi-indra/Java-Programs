//To find out whether the given String is Palindrome or not.
package com.Abhishek;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = in.next();
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String data = buffer.toString();
        if(str.equals(data)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }

}
