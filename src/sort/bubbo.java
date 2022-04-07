package sort;

import org.junit.Test;

public class bubbo {
    public static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = n-1; i > 0; i-- ){
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }

    @Test
    public void test(){
        int[] a = {143,2,3,4,5,6,7,8,9,10};
        bubbleSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
