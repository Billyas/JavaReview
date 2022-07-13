package day;

import org.junit.Test;

import java.util.HashSet;

public class M6042 {
    public int countLatticePoints(int[][] circles) {
        int  n= circles.length;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {

            int[] start = {circles[i][0] - circles[i][2], circles[i][1] - circles[i][2]};
            int[] end = {circles[i][0] + circles[i][2], circles[i][1] + circles[i][2]};
            for (int j = start[0]; j <= end[0]; j++) {
                for (int k = start[1]; k <= end[1] ; k++) {
                    int s = (j-circles[i][0])*(j-circles[i][0]) + (k-circles[i][1])*(k-circles[i][1]);
                    if(s <= circles[i][2]*circles[i][2]){
                        long temp=((long)j<<32)+(long)k;
                        set.add(temp);
                    }
                }
            }
        }
        return set.size();
    }
    @Test
    public void test(){
        int[][] r = {{2,2,2},{3,4,1}};
        System.out.println(countLatticePoints(r));
    }
}
