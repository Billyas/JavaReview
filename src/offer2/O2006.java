package offer2;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
* 剑指 Offer II 006. 排序数组中两个数字之和
给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。

函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0 开始计数 ，所以答案数组应当满足 0 <= answer[0] < answer[1] < numbers.length 。

假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。


* */
public class O2006 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            map.put(numbers[i],i);
        }
        int[] res = new int[2];
        for(int i=0; i<numbers.length; i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp) && map.get(temp)!=i){
                res[0] = i;
                res[1] = map.get(temp);
                break;
            }
        }
        return res;
    }
    @Test
    public void test(){
        int[] t= {1, 2, 4, 6, 10};
        int[] res = twoSum(t,8);
        System.out.println(res[0]+" "+res[1]);
    }
}
