
public class DNFProb {
    static void solveDNF(int arr[],int mid){
        int i=0;
        int j=0;
        int k = arr.length-1;

        while(j<=k){
            if(arr[j]<mid){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j+=1;
                i+=1;
            }
            else if(arr[j]>mid){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k-=1;
            }
            else
                j+=1;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,1,0,1,0,1,2,2,1,2,0};
        solveDNF(arr,1);
        for(int x:arr)
            System.out.print(x+" ");
    }
}
