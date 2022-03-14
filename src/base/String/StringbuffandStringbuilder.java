package base.String;
/**
 * @Author: Billyme
 * @Date: 2022/3/13 上午 10:35
 * @Describe: StringBuffer StringBuilder
 */

public class StringbuffandStringbuilder {
    /**
     *  String: 不可变化,char[]存储
     *  StringBuffer: 可变，线程安全,效率低char[]存储
     *  StringBuilder: 可变，不安全,char[]存储
     * */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        String str = new String();
        sb.setCharAt(1,'h');
        System.out.println(sb);
        sb.append("abc");
        System.out.println(sb.compareTo(new StringBuffer("gogoog")));
        System.out.println(sb.substring(2, 4));
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
