package day;

import org.junit.Test;

public class D944 {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        int n = strs.length;
        int m = strs[0].length();
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                res++;
            }
        }
        return res;
    }
    @Test
    public void test() {
        String[] strs = {"cba", "daf", "ghi"};
        System.out.println(minDeletionSize(strs));
    }
}
