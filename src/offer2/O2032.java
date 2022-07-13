package offer2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class O2032 {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char tmp = t.charAt(i);
            if(!map.containsKey(tmp)){
                return false;
            }
            map.put(tmp, map.getOrDefault(tmp,0)-1);
        }
        for(int i: map.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    @Test
    public void test(){
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
