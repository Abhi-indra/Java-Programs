package easy;

public class Concept {
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- means pass the value and then subtract
//        --n means subtract the value then pass the value
    }
}
