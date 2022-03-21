package offer;

import java.util.Collection;
import java.util.Collections;

public class Offer58 {
    public String reverseWords(String s) {
        s = s.strip();
        String[] strs = s.split("\\s{1,8}");
        String res="";
        for(int i= strs.length-1; i>=0; i--){
            res+=strs[i]+" ";
        }
        return res.strip();
    }
}
