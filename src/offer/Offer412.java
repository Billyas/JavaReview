package offer;

public class Offer412 {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        long start = 1;
        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = String.valueOf(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
