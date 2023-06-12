package Assignment6;

public class MazePathProblemUsingVoid {
    public static void solve(int i,int j,int n,String res){
        if(i==n-1 && j==n-1){
            System.out.println(res);
            return;
        }
        if(i>=n || j>=n)
            return;
        solve(i+1,j,n,res+"R");
        solve(i,j+1,n,res+"D");
    }
    public static void main(String[] args) {
        solve(0,0,3,"");
    }
}
