package offer2;

import org.junit.Test;

import java.util.Arrays;

public class O2014 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] s1_count = new int[26];
        int[] s2_count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1_count[s1.charAt(i) - 'a']++;
            s2_count[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1_count,s2_count)) return true;

        for(int i = s1.length(); i < s2.length(); i++){
            s2_count[s2.charAt(i) - 'a']++;
            s2_count[s2.charAt(i - s1.length()) - 'a']--;
            if(Arrays.equals(s1_count,s2_count)) return true;
        }
        return false;
    }
    @Test
    public void test(){
        System.out.println(checkInclusion("a", "ab"));
    }
}
