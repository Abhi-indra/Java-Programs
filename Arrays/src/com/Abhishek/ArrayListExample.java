package com.Abhishek;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Syntax:-
            ArrayList<Integer> list = new ArrayList<>(10);
//
//            list.add(67);
//            list.add(45);
//            list.add(458);
//            list.contains(7889);
//
//        System.out.println(list);
//        System.out.println(list.contains(455));
        //taking input
        for (int i = 0; i < 10 ; i++) {
            list.add(input.nextInt());
        }

        //get item of any index
        for (int i = 0; i < 10 ; i++) {
            System.out.println(list.get(i)); // here we can pass the index, list of index[] syntax will not work here
        }
        System.out.print(list);

    }
}
