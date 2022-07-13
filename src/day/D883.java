package day;

import org.junit.Test;

public class D883 {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    ans++;
                }
                max = Math.max(max, grid[i][j]);
            }
            ans += max;
        }
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, grid[i][j]);
            }
            ans += max;
        }
        return ans;
    }
    @Test
    public void test() {
        int[][] grid = {{1,2},{3,4}};
        System.out.println(projectionArea(grid));
    }
}
