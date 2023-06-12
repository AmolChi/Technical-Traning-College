package Assignment4;
// you have a dice and you need to reach a sum. Print all ways

public class DiceProblem {
    public static void solve(int sum,int currSum,String res){
        if(sum==currSum){
            System.out.println(res);
            return;
        }
        if(sum<currSum)
            return;
        for(int i=1;i<=6;i++){
            String curr = res + i;
            solve(sum,currSum+i,curr);
        }
    }
    public static void main(String[] args) {
        solve(5,0,"");
    }
}
