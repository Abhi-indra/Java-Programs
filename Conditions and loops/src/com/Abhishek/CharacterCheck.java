package com.Abhishek;
import java.util.*;
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Character = ");
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The Character is in Lower Case :- "+ch);
        }else{
            System.out.println("The Character is in Upper Case :- "+ch);
        }
    }
}
