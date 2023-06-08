package Assignment1;

public class CheckArmstrong {

    public static int findDig(int num){
        if(num==0)
            return 0;
        return 1+findDig(num/10);
    }

    public static void method1(int origNum, int num,int val,int dig){
        if(num==0){
            System.out.println("Using stack building method: "+(origNum==val));
            return;
        }
        method1(origNum,num/10,val+(int)Math.pow(num%10,dig),dig);

    }

    public static int method2(int num,int dig){
        if(num==0)
            return 0;
        return (int)Math.pow(num%10,dig) + method2(num/10,dig);
    }

    public static void main(String[] args) {
        int dig = findDig(153);
        method1(153, 153, 0, dig);
        System.out.println("Using stack falling method: "+(154==method2(154,dig)));
    }
}
