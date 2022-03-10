package offer;
//剑指 Offer 05. 替换空格
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
//        示例 1：
//        输入：s = "We are happy."
//        输出："We%20are%20happy."
//        限制：
//        0 <= s 的长度 <= 10000
public class ReplaceSpace {
    //1. 直接复制新string
    public String replaceSpace(String s) {
        String res = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                res += "%20";
            }else{
                res += s.charAt(i);
            }
        }
        return res;
    }

/* *
 * @Author Billyme
 * @Date  2022/3/10 上午 10:03
 * @Description 利用正则表达式求解
 * @param
 * @return
 * */
    public String replace2 (String s){
//        return s.replaceAll("\\s", "%20");
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace("We are happy."));
        System.out.println(replaceSpace.replace2("We are happy."));
    }
}
