public class maxNum{
    public static void main(String[] args) {
        int arr[] = new int[]{ 3, 5, 8, 10, 12};
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]&arr[j])>max)
                    max = arr[i]&arr[j];
            }
        }
        System.out.println("MAX AND: "+max);
    }
}