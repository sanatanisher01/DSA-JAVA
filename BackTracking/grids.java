
public class Main {
    public static int uniquePaths(int m,int n) {
        int[][] grid=new int[m][n];
        return solve(0,0,m,n,grid);
    }

    public static int solve(int i,int j,int m,int n,int[][] grid) {
        if(i==m-1&&j==n-1) return 1;
        if(i>=m||j>=n) return 0;

        int down=solve(i+1,j,m,n,grid);
        int right=solve(i,j+1,m,n,grid);

        return down+right;
    }

    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(uniquePaths(m,n));
    }
}
