package Assignment1;

public class SumOfNNaturalNumbers {
    public static void method1(int n,int sum){
        if(n==0){
            System.out.println("Using Stack Building Method: "+sum);
            return;
        }
        method1(n-1,sum+n);
    }

    public static int method2(int n){
        if(n==0)
            return 0;
        return n+method2(n-1);
    }
    public static void main(String[] args) {
        method1(10,0);
        System.out.println("Using Stack Falling Method: "+method2(10));
    }
}
