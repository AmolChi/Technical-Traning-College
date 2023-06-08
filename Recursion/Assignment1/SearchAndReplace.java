package Assignment1;

public class SearchAndReplace {

    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void method1(int[]arr,int val,int repVal,int ptr){
        if(ptr==arr.length){
            System.out.println("Using stack building method the array will be: ");
            printArray(arr);
            return;
        }
        else if(arr[ptr]==val)
            arr[ptr]=repVal;
        method1(arr, val, repVal, ptr+1);
    }

    public static int[] method2(int[]arr,int val,int repVal,int ptr){
        if(ptr==arr.length){
            return new int[ptr];
        }
        int curr[] = method2(arr,val,repVal,ptr+1);
        if(arr[ptr]==val)
            curr[ptr] = repVal;
        else    
            curr[ptr] = arr[ptr];
        return curr;
    }

    public static void main(String[] args) {
        method1(new int[]{1,1,1,2,3,4,1,1,5,1,6},1,9,0);
        System.out.println("\nBy stack falling method the array will be: ");
        printArray(method2(new int[]{1,1,1,2,3,4,1,1,5,1,6},1,9,0));
    }
}
