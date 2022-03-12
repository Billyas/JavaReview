package offer;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {
    public char firstUniqChar(String s) {
        char res = ' ';
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0;i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Offer50 o = new Offer50();
       o.firstUniqChar("leetcode");
    }
}
