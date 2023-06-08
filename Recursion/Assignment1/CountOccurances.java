package Assignment1;

public class CountOccurances {
    public static void method1(int []arr,int val,int ptr,int occ){
        if(ptr==arr.length){
            System.out.println("Using stack building method occurances are: "+occ);
            return;
        }
        method1(arr,val,ptr+1,(arr[ptr]==val)?occ+1:occ);
    }

    public static int method2(int []arr,int val,int ptr){
        if(ptr==arr.length)
            return 0;
        return ((arr[ptr]==val)?1:0) + method2(arr,val,ptr+1);
    }

    public static void main(String[] args) {
        method1(new int[]{1,2,3,4,4,4,5,4,4,7,8},4,0,0);
        System.out.println("Using stack falling method occuracnes are: "+method2(new int[]{1,2,3,4,4,4,5,4,4,7,8},4,0));
    }
}
