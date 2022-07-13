package day;

import org.junit.Test;

import java.util.Arrays;

public class D1089 {

    /**
     * @Author Billyme
     * @Date  2022/6/17 下午 10:05
     * @Description  1089. 复写零[ LC ]https://leetcode.cn/problems/duplicate-zeros/
     * @param
     * @return
     **/
    public void duplicateZeros(int[] arr) {
        int[] real = arr.clone();
        int j = 0;
        for(int i = 0; i<real.length&&j< real.length; i++,j++){
            arr[j]=real[i];
            if(real[i]==0){
                j++;
                if (j< real.length) arr[j]=0;
            }
        }
    }
    @Test
    public void test(){
        int [] a = {1,0,2,3,0,4,5,0};
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }
}
