public class XAndN {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for(int x=0;x<=n;x++){
            if((x&n)==x)
                count++;
        }
        System.out.println("Count: "+count);
    }
}
