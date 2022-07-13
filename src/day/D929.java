package day;

import org.junit.Test;

import java.util.HashSet;

public class D929 {

    public String checkEmail(String str){
        String[] a = str.split("@");
        a[0]=a[0].split("\\+")[0];
        a[0] = a[0].replaceAll("\\.", "");
        return a[0]+"@"+a[1];
    }

    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String i:emails) {
            set.add(checkEmail(i));
        }
        return set.size();
    }

    @Test
    public void test(){
        String[] a = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] c = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(numUniqueEmails(c));
    }

}
