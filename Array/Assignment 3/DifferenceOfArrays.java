public class DifferenceOfArrays {
    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];
        int borrow = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;

        while (i >= 0 || j >= 0) {
            int val1 = (i >= 0) ? arr1[i] : 0;
            int val2 = (j >= 0) ? arr2[j] : 0;

            // Subtract the borrow from val1
            val1 -= borrow;

            if (val1 < val2) {
                // Need to borrow from the previous digit
                borrow = 1;
                val1 += 10;
            } else {
                // No borrowing required
                borrow = 0;
            }

            int diff = val1 - val2;
            result[k] = diff;

            i--;
            j--;
            k--;
        }

        // Remove leading zeros if any
        int startIndex = 0;
        while (startIndex < result.length - 1 && result[startIndex] == 0) {
            startIndex++;
        }

        int[] trimmedResult = new int[result.length - startIndex];
        System.arraycopy(result, startIndex, trimmedResult, 0, trimmedResult.length);

        return trimmedResult;
    }

    public static void main(String[] args) {
        int[] array1 = {9, 1, 9, 9};
        int[] array2 = {1, 2, 3, 4};

        int[] diffArray = subtractArrays(array1, array2);

        // Print the diffArray
        for (int num : diffArray) {
            System.out.print(num);
        }
        System.out.println();
    }
}