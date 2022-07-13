package day;

import java.util.HashSet;
import java.util.Set;

public class K01 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int rl=-1;
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(i!=0){
                set.remove(s.charAt(i-1));
            }

            while(rl+1<n && !set.contains(s.charAt(rl+1))){
                set.add(s.charAt(rl+1));
                rl++;
            }
            ans = Math.max(ans, rl-i+1);
        }
        return ans;
    }
}
