// Welcome to CodeCollab!
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] maze = {
            {1, 1, 1, 0, 1},
            {1, 1, 0, 1, 1},
            {0, 1, 1, 1, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1}
        };
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visit = new boolean[n][n];
        solve(maze,0,0,"",visit,ans,n);
        System.out.println(ans);

    }

    public static void solve(int[][] maze,int row, int col, String path, boolean[][] visit, ArrayList<String> ans, int n) {

        // Your code here
        if(row == n-1 && col ==n-1){
            ans.add(path);
            return;
        }
        visit[row][col]=true;
        if(row+1<n && maze[row+1][col] ==1 && !visit[row+1][col]){
            solve(maze,row+1,col,path+"D",visit,ans,n);
        }
        if(col-1>=0 && maze[row][col-1]==1 && !visit[row][col-1]){
            solve(maze,row,col-1,path+"L",visit,ans,n);
        }
        if(col+1<n && maze[row][col+1]==1 && !visit[row][col+1]){
            solve(maze,row,col+1,path+"R",visit,ans,n);

        }
        if(row-1>=0 && maze[row-1][col]==1 && !visit[row-1][col]){
            solve(maze,row-1,col,path+"U",visit,ans,n);
        }
        visit[row][col]=false;

    }
}