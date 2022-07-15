package test;

public class buboo {
    public int[] MySort (int[] arr) {
        // write code here
        int[] sorted = arr.clone();
        int temp = 0;
        for(int i=sorted.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(sorted[j]>sorted[j+1]){
                    temp = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = temp;
                }
            }
            System.out.println("one sorted finished");
        }
        return sorted;
    }
}
