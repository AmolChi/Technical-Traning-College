package Assignment1;

public class CountZeros {
    public static void method1(int num,int zeros){
        if(num==0){
            System.out.println("Using stack building method: "+zeros);
            return;
        }
        int dig = num%10;
        if(dig==0) 
            zeros++;
        method1(num/10,zeros);
    }

    public static int method2(int num){
        if(num==0)
            return 0;
        return ((num%10)==0?1:0) + method2(num/10);
    }
    public static void main(String[] args) {
        method1(1000100,0);
        System.out.println("Using stack falling method: "+method2(1000100));
    }
}
