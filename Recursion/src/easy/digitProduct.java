package easy;
public class digitProduct {
    public static void main(String[] args) {
        int ans = digit(1342);
        System.out.println(ans);
    }
    static int digit(int n){
        if( n%10 == n){
            return n;
        }
        return (n%10) * digit(n/10);
    }
}
