package offer;

import org.junit.Test;

import java.util.Stack;

public class m682
{
    public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(String i:ops){
            if(i.equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(i.equals("D")){
                int tmp = stack.peek();
                stack.push(tmp*2);
            }else if(i.equals("+")){
                int a =stack.pop();
                int b = stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }
        Integer[] a = stack.toArray(new Integer[stack.size()]);
        for(int i:a){
            sum +=i;
        }
        return sum;
    }
    @Test
   public void test(){
        String[] r = new String[]{"5","2", "C", "D", "+"};
        calPoints(r);
    }

}
