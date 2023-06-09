package Assignment3;

public class LargestElementInArray {
    public static void findMax(int arr[],int ptr,int currMax){
        if(ptr == arr.length){
            System.out.println("The maximum element is: "+currMax);
            return;
        }
        if(arr[ptr]>currMax)
            currMax=arr[ptr];
        findMax(arr, ptr+1, currMax);
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,3,5,42,2,6,9,8,1,10};
        findMax(arr,0,arr[0]);
    }
}
