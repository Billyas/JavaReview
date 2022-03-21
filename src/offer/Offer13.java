package offer;

public class Offer13 {
    int m, n, k;
    boolean[][] visited;
    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
    public int movingCount(int m, int n, int k) {
        this.m = m; this.n = n; this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0);
    }

    public int dfs(int i, int j){
        if(i>=m||j>=n||visited[i][j]||get(i)+get(j)>k) return 0;
        visited[i][j] = true;
        return 1+dfs(i,j+1)+dfs(i+1, j);
    }
}
