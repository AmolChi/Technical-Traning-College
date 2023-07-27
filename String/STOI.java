import java.util.Scanner;

public class STOI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();    
        int n = s.length();
        boolean sign = true;            //true means positive
        int num = 0;
        for(char x:s.toCharArray()){
            if(x=='-')
                sign = false;
            if(Character.isDigit(x)){
                num = num*10 + (int)(x-'0');
            if(num>Integer.MAX_VALUE){
                num = Integer.MAX_VALUE;
            break;
        }
            }
        }
        if(!sign)
            num*=-1;
        System.out.println(num);
        sc.close();
    }
}