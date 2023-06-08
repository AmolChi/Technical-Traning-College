package Assignment1;

public class PowerOfNumber {
    static void method1(int num,int pow,long ans){
        if(pow==0){
            System.out.println("By stack building method: "+ans);
            return;
        }
        method1(num,pow-1,ans*num);
    }
    static long method2(int num,int pow){
        if(pow==0)
            return 1;
        return num*method2(num,pow-1);
    }
    public static void main(String[] args) {
        method1(2,3,1);
        System.out.println("By stack falling method: "+method2(2, 3));
    }
}
