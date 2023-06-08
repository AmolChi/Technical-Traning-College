package Assignment1;

public class CheckPalindrome {

    public static void method1(String s, int ptr){
        if(ptr>=s.length()/2){    
            System.out.println("Using stack building method: "+true);
            return;
        }
        else if(s.charAt(ptr)!=s.charAt(s.length()-ptr-1)){
            System.out.println("Using stack building method: "+false);
            return;
        }
        method1(s,ptr+1);
    }

    public static boolean method2(String s,int ptr){
        if(ptr>=s.length()/2)
            return true;
        return (s.charAt(ptr)==s.charAt(s.length()-ptr-1)) && method2(s, ptr+1);
    }

    public static void main(String[] args) {
        method1("naman", 0);
        System.out.println("Using stack falling method: "+method2("naman", 0));
    }
}
