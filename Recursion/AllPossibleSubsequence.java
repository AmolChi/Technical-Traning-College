import java.util.ArrayList;

public class AllPossibleSubsequence{

    public static ArrayList<String> rec(String s){
        if(s.length()==0){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> curr = rec(s.substring(1));
        int n = curr.size();
        for(int i=0;i<n;i++){
            String p = curr.get(i);
            p+=s.charAt(0);
            curr.add(p);
        }
        return curr;
    }
    public static void main(String[] args) {
        String s = "aaa";
        ArrayList<String> list = rec(s); 
        System.out.println(list);
    }
}