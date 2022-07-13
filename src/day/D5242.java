package day;

import org.junit.Test;

import java.util.LinkedHashMap;

public class D5242 {
    public String greatestLetter(String s) {
        String res = "";
        int[]low = new int[26];
        int[]upper = new int[26];

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                low[c-'a']++;
            }else{
                upper[c-'A']++;
            }
        }

        for(int i= 25; i>=0; i--){
            if(low[i]>0 && upper[i]>0){
                char tmp = (char) ('A'+i);
                res  =tmp+"";
                return res;
            }
        }

        return res;
    }
    @Test
    public void test(){
        String s="arRAzFif";
        System.out.println(greatestLetter(s));
    }
}
