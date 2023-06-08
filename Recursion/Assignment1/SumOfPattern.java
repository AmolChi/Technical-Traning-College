package Assignment1;
// Pattern is 1/1^1 + 2/2^2 + ..... + n/n^n
public class SumOfPattern {

    public static void method1(int n,double ans){
        if(n==0){
            System.out.println("Using stack building method: "+ans);
            return;
        }
        ans+=n/Math.pow(n,n);
        method1(n-1, ans);
    }

    public static double method2(int n){
        if(n==0)
            return 0;
        double val = n/Math.pow(n, n);
        return val+method2(n-1);
    }
    public static void main(String[] args) {
        method1(5, 0);
        System.out.println("Using stack falling method: "+method2(5));
    }
}
