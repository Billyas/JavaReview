package offer;

public class Offer14 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int mod = 1000000007;
        long res = 1;
        while (n > 4) {
            res = res * 3 % mod;
            n -= 3;
        }
        res = res * n % mod;
        return (int) res;

    }

    public static void main(String[] args) {

/*
        // 创建新线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });
        thread.start();
        // base64编码
        String str = "abcdefg";
        byte[] bytes = str.getBytes();
        String encode = Base64.encode(bytes);
        System.out.println(encode);
        // base64解码
        byte[] decode = Base64.decode(encode);
        String str2 = new String(decode);
        System.out.println(str2);

*/

    }
}
