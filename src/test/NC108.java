package test;

import org.junit.Test;

public class NC108 {
    /**
     * 最大正方形
     *
     * @param matrix char字符型二维数组
     * @return int整型
     */
    char[][] matrix;
    int n;
    int m;

    //以ij位置的最大正方形面积
    public int maxarea(int a, int b) {
        int area = 1;//只有一个顶点的情况
        int ll = 1;//边
        System.out.println("Hello");
        int i = a;
        int j = b;
        while (i + 1 < n && j + 1 < m) {
            int aadd = i + 1;
            int badd = j + 1;

            boolean flag = true;
            for (int v = a; v <= aadd; v++) {
                for (int c = b; c <= badd; c++) {
                    if (matrix[v][c] != '1') {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (!flag) {
                break;
            }
            ll++;
            int tmp = ll*ll;
            area = Math.max(area, tmp);
            i++;
            j++;

        }
        return area;
    }
    //以ij位置的最大正方形面积
    public int maxarea2(int a, int b) {
        int area = 1;//只有一个顶点的情况
        int ll = 1;//边
        int aadd = a+1;
        int badd = b+1;
        while (aadd < n && badd < m) {

            boolean flag = true;
            for (int v = a; v <= aadd; v++) {
                for (int c = b; c <= badd; c++) {
                    if (matrix[v][c] != '1') {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
            if (!flag) break;
            ll++;
            area = Math.max(area, ll*ll);
            aadd++;
            badd++;

        }
        return area;
    }

    public int solve(char[][] matrix) {
        // write code here
        this.matrix = matrix;
        int max = 0;
        n = matrix.length;
        if (n == 0) {
            return 0;
        }
        m = matrix[0].length;

        //遍历每个点寻找对应的正方形
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    max = Math.max(maxarea(i, j), max);
                }
            }
        }
        return max;
    }

    @Test
    public void test() {
        char[][] a = {
                {'1', '1', '1', '1'},
                {'0', '1', '0', '1'}
        };
        System.out.println(solve(a));
    }
}
