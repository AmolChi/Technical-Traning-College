package Assignment1;

public class CheckPrime {
    public static void method1(int num,int div){
        if(div==(num/2)+1){
            System.out.println("By stack building method: "+true);
            return;
        }
        else if(num%div==0){
            System.out.println("By stack building method: "+false);
            return;
        }
        method1(num,div+1);
    }

    public static boolean method2(int num,int div){
        if(div==(num/2)+1)
            return true;
        return (num%div!=0) && method2(num,div+1);
    }
    public static void main(String[] args) {
        method1(14,2);
        System.out.println("Using stack falling method: "+method2(13, 2));
    }
}
