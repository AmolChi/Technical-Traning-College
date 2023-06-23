import java.util.Scanner;

public class ThirdLargest{

    public static int find3rdLargest(int []arr){
        int first = arr[0],second = arr[0],third = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>=second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>=third)
                third = arr[i];
        }
        return third;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n<=2){
            System.out.println("Cannot find 3rd largest element as there is no such ");
            sc.close();
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        int ele = find3rdLargest(arr);
        System.out.println("Third Largest element: "+ ele);
        sc.close();
    }
}