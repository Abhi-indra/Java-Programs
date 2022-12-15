package com.Abhishek;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,4,5,4,5,8,3,21,8,2,1,5,3,1,5,0,1,3,02,78);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
