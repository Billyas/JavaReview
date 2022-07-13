package day;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D5234 {
    public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
            return false;

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++)
        {
            if (chars1[i] != chars2[i])
                return false;
        }

        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for(int i = words.length-1; i>0; i--){
            if(!isAnagram(words[i], words[i-1])){
                res.add(words[i]);
            }
        }
        res.add(words[0]);
        Collections.reverse(res);
        return res;
    }
    @Test
    public void test(){
        String[] words = {"a","b","c","d","e"};
        List<String> res = removeAnagrams(words);
        System.out.println(res);
    }

}
