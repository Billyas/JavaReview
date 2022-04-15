package offer2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class O2016 {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int max = 0;
        int start = 0;
        int end = -1;
        Set<Character> set = new HashSet<>();
        for(int i=0 ;i<s.length(); i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while(end+1<s.length() && !set.contains(s.charAt(end+1))){
                set.add(s.charAt(end+1));
                ++end;
            }
            max = Math.max(max, end - i +1);
        }
        return max;
    }
    @Test
    public void test(){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
