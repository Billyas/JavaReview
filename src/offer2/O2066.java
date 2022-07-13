package offer2;

import com.sun.tools.javac.Main;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class O2066 {
    class MapSum {
        Map<String, Integer> map;
        /** Initialize your data structure here. */
        public MapSum() {
            map = new HashMap<>();
        }

        public void insert(String key, int val) {
            map.put(key, val);
        }

        public int sum(String prefix) {
            int n= prefix.length();
            int sum =0;
            for(String str:map.keySet()){
                if(str.startsWith(prefix)){
                    sum += map.get(str);
                }
            }
            return sum;
        }
    }

    @Test
    public void test(){
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        System.out.println(mapSum.sum("ap"));           // return 3 (apple = 3)
        mapSum.insert("app", 2);
        System.out.println(mapSum.sum("ap"));           // return 5 (apple + app = 3 + 2 = 5)

    }
}
