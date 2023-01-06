//Searching in String
package com.Abhishek;
public class SearchingInString {
    public static void main(String[] args) {
        String name = "Abhsishek";
        char search = 'i';
        boolean ans = searchStr(name, search);
        System.out.println(ans);
    }
    static boolean searchStr(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
