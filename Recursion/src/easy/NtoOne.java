//ques = Print N to One number using Recursion
package easy;

public class NtoOne {
    public static void main(String[] args) {
       fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
