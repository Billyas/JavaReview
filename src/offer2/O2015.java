package offer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O2015 {
    public List<Integer> findAnagrams(String s, String p) {
        if(s == null || p == null || s.length() < p.length()) {
            return new ArrayList<>();
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for(int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        List<Integer> result = new ArrayList<>();
        if(Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        for(int i = 0 ; i < s.length() - p.length(); i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + p.length()) - 'a']++;
            if(Arrays.equals(pCount, sCount)) {
                result.add(i + 1);
            }
        }
        return result;
    }
    @Test
    public void test() {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
}
