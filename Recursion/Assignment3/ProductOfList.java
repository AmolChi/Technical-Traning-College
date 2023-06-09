package Assignment3;

public class ProductOfList {

    static int[] square(int []arr,int pos){
        if(pos==arr.length)
            return new int[pos];
        int curr[]=square(arr,pos+1);
        curr[pos] = arr[pos]*arr[pos];
        return curr;
    }
    public static void main(String[] args) {
        int[]res = square(new int[]{1,2,3,4,5,6},0);
        for(int x:res)
            System.out.print(x+" ");
    }
}
