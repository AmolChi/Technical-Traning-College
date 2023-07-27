public class palindromeBit {

    static boolean isPal(int x){
        int reversedNumber = 0;
        int tempNumber = x;

        while (tempNumber != 0) {
            reversedNumber <<= 1;
            reversedNumber |= (tempNumber & 1);
            tempNumber >>= 1;
        }

        return x == reversedNumber;
    }

    static int findPal(int n){
        int count = 0;
        int res = 0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(isPal(i))
                count++;
            if(count==n){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(findPal(n));
    }
}
