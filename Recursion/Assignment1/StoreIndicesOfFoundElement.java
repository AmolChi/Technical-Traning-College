package Assignment1;

public class StoreIndicesOfFoundElement {

    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static int[] method1(int arr[],int ptr,int val,int occ){
        if(ptr == arr.length)
            return new int[occ];
        if(arr[ptr]==val)
            occ++;
        int curr[] = method1(arr,ptr+1,val,occ);
        if(arr[ptr]==val)
            curr[occ-1] = ptr;
        return curr;
    }

    public static void main(String[] args) {
        System.out.println("The position of occurances are: ");
        printArray(method1(new int[]{1,2,2,1,1,3,1,1,3,1,2}, 0, 1, 0));
    }
}
