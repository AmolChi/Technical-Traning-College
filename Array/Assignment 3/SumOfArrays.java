public class SumOfArrays{
    public static int[] addArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];
        int carry = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = result.length-1;
        while(i>=0 || j>=0){
            int val1 = (i >= 0) ? arr1[i] : 0;
            int val2 = (j>=0) ? arr2[j] : 0;
            int sum = val1 + val2 + carry;
            
            result[k] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
            k--;
        }
        
        if (carry != 0) {
            int[] extendedResult = new int[result.length + 1];
            System.arraycopy(result, 0, extendedResult, 1, result.length);
            extendedResult[0] = carry;
            return extendedResult;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {9, 9, 9, 9};
        int[] array2 = {1, 2, 3, 4};

        int[] sumArray = addArrays(array1, array2);
        
        // Print the sumArray
        for (int num : sumArray) {
            System.out.print(num);
        }
        System.out.println();
    }
}