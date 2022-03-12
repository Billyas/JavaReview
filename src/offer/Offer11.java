package offer;

/* *
 * @Author Billyme
 * @Date  2022/3/12 上午 9:30
 * @Description  Offer11
 * @param
 * @return
 * */
public class Offer11 {
    public int minArray(int[] numbers) {
        int a = Integer.MIN_VALUE;
        int min = numbers[0];
        for(int i:numbers){
            if(i>=a){
                a = i;
            }else{
                min = i;
                break;
            }
        }
        return min;
    }

//    class Solution {
        public int minArray2(int[] numbers) {
            int low = 0;
            int high = numbers.length - 1;
            while (low < high) {
                int pivot = low + (high - low) / 2;
                if (numbers[pivot] < numbers[high]) {
                    high = pivot;
                } else if (numbers[pivot] > numbers[high]) {
                    low = pivot + 1;
                } else {
                    high -= 1;
                }
            }
            return numbers[low];
        }
}
