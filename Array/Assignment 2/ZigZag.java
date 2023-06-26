public class ZigZag{

    static void convertToZigZag(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,7,8,6,2,1};
        convertToZigZag(arr);
        for(int x:arr)
            System.out.print(x+" ");
    }
}