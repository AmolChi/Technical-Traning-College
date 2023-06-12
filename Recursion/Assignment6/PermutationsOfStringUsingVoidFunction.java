package Assignment6;

public class PermutationsOfStringUsingVoidFunction {
    public static void perm(String s,String res,int length){
        if(res.length()==length){
            System.out.println(res);
            return;
        }
        char start = s.charAt(0);
        s = s.substring(1);
        for(int i=0;i<=res.length();i++){
            StringBuilder sb = new StringBuilder(res);
            sb.insert(i,start);
            perm(s,sb.toString(),length);
        }
    }
    public static void main(String[] args) {
        perm("abc","",3);
    }
}