package javadsatest;

import java.util.Scanner;

public class SubArrayZeroSum {
public static boolean subArrayExists(int arr[], int n)
{
    for (int i = 0; i < n; i++) {
        int sum = arr[i];
        if (sum == 0)
            return true;
        for (int j = i + 1; j < n; j++) {
            sum += arr[j];
            if (sum == 0)
                return true;
        }
    }
    return false;
}
 
// Driver's code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
    
        // Function call
        if (subArrayExists(arr, N))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    
    }
}

