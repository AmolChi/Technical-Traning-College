package Assignment4;

// Print all possible paths from (0,0) to (n,n) when we have two moves Right and Down

public class MazeProblem {
    public static void solve(int i,int j,int n,String curr){
        if(i==n-1 && j==n-1){
            System.out.println(curr);
            return;
        }
        if(i>n)
            return;
        if(j>n)
            return;
        solve(i+1,j,n,curr+"R");
        solve(i,j+1,n,curr+"D");
    }
    public static void main(String[] args) {
        solve(0,0,3,"");
    }
}
