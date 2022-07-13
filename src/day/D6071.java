package day;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class D6071 {
    Map<Integer,Integer> map = new HashMap<>();
    int getcount(int c){
        if(c<2){
            return -1;
        }
        if(c==2){
            return 1;
        }
        if(c==3){
            return 1;
        }
        int count = 0; //完成得次数
        int[] d = new int[c+1];
        d[1] = Integer.MAX_VALUE;
        d[2] = 1;
        d[3] = 1;
        for(int i=4; i<=c; i++){
            d[i] = Math.min(d[i-2],d[i-3])+1;
        }
        return d[c];
    }
    public int minimumRounds(int[] tasks) {
        for(int i = 0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0)+1);
        }
        int count = 0;
        for(int i:map.keySet()){
            int c = map.get(i);
            int tmpcount = getcount(c);
            if(tmpcount==-1){
                return -1;
            }
            count+=tmpcount;
        }
        return count;
    }
    @Test
    public void test(){
        System.out.println(minimumRounds(new int[]{2,3,3}));
    }
}
