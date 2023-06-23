import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {

    public static void find(int arr[],int n,int k){
        Arrays.sort(arr);
        System.out.println("The "+k+"th largest element is: "+arr[n-k]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        if(k>n){
            System.out.println("Error!!! Cannot find kth element if k greater than n");
            sc.close();
            return;
        }
        find(arr,n,k);
        sc.close();
    }
}
