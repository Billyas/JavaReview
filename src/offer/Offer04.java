package offer;

/* *
 * @Author Billyme
 * @Date  2022/3/12 上午 9:05
 * @Description  剑指Offer 04
 * @param
 * @return
 * */
public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++ ){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0||matrix[0].length==0){
            return false;
        }
        int rows = matrix.length;
        int cows = matrix[0].length;
        int  row = 0, cow = cows-1;

        while(row<rows&&cow>=0){
            int tmp = matrix[row][cow];
            if(tmp==target){
                return true;
            }else if(tmp>target){
                cow--;
            }else{
                row++;
            }
        }
        return false;
    }
}
