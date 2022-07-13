package day;

import org.junit.Test;

public class D6070 {
    String getsum(String a){
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            sum += Character.getNumericValue(a.charAt(i));
        }
        return String.valueOf(sum);
    }
    public String digitSum(String s, int k) {
        if(s.length()<=k){
            return s;
        }
        String t = s;
        while(t.length()>k){
            String ne = "";
            int n = t.length()/k;
            for (int i = 0; i < n; i++) {
                String tmp = t.substring(i*k,(i+1)*k);
                ne += getsum(tmp);
            }
            if(n*k<t.length()){
                String tmp = t.substring(n*k, t.length());
                ne += getsum(tmp);
            }
            t = ne;
        }
        return t;
    }
    @Test
    public void  test(){
        System.out.println(digitSum("00000000", 3));
    }
}
