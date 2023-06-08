import java.util.ArrayList;

public class PermutationsOfString {


    static ArrayList<String> perm(String s){
        if(s.length()==0){
            ArrayList<String> l = new ArrayList<String>();
            l.add("");
            return l;
        }
        ArrayList<String> curr = perm(s.substring(1));
        char start = s.charAt(0);
        ArrayList<String> finalList = new ArrayList<>();
        for(String t: curr){
            for(int i=0;i<=t.length();i++){
                StringBuilder sb= new StringBuilder(t);
                sb.insert(i,start);
                finalList.add(sb.toString());
            }
        }
        return finalList;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(perm(s));
    }
}
