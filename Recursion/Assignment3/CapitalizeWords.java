package Assignment3;

public class CapitalizeWords {
    static String[] capitalize(String[]ar,int ptr){
        if(ptr == ar.length)
            return new String[ptr];
        String[]curr = capitalize(ar,ptr+1);
        curr[ptr] = "";
        for(int i=0;i<ar[ptr].length();i++){
            char c = ar[ptr].charAt(i);
            if(c>=97){
                c -=32;
            }
            curr[ptr]+=c;
        } 
        return curr;
    }
    public static void main(String[] args) {
        String[]res = capitalize(new String[]{"amol","rAm","shyam","mohit"},0);
        for(String s:res)
            System.out.println(s);
    }
}
