package Assignment4;
// you have a dice and you need to reach a sum. Print all ways
import java.util.ArrayList;
import java.util.List;
public class DiceProblem {
    public static void solve(int sum,int currSum,List<Integer> currList){
        if(sum==currSum){
            System.out.println(currList);
            return;
        }
        if(sum<currSum)
            return;
        for(int i=1;i<=6;i++){
            currList.add(i);
            solve(sum,currSum+i,currList);
            currList.remove(currList.size()-1);
        }
    }
    public static void main(String[] args) {
        solve(10,0,new ArrayList<Integer>());
    }
}
