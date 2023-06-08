package Assignment1;

public class LastIndexOf {
    public static void method1(int []arr,int val,int ptr){
        if(ptr==-1){
            System.out.println("Using stack building method position: " +ptr);
            return;
        }
        else if(arr[ptr]==val){
            System.out.println("Using stack building method position: "+ptr);
            return;
        }
        else
            method1(arr, val, ptr-1);
    }

    public static int method2(int arr[],int val,int ptr){
        if(ptr==-1)
            return ptr;
        else if(arr[ptr]==val)
            return ptr;
        return method2(arr, val, ptr-1);
    }
    public static void main(String[] args) {
        method1(new int[]{1,2,3,4,4,4,7},4,6);
        System.out.println("Using stack falling method position: "+method2(new int[]{1,2,3,4,4,4,7},4,6));
    }
}
