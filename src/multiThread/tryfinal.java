package multiThread;

public class tryfinal {
    public static void main(String[] args) {
        try{
            System.out.println("hell0");
            int[] a = new int[3];
            System.out.println(a[4]);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);//
//            return; return与exit不同
        }finally {
            System.out.println("finally");
        }
    }
}
