package com.Abhishek;
import java.util.*;
public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Ritik";
        System.out.println(Arrays.toString(str));
    }
}
