package offer;

import org.junit.Test;

//6038. 向表达式添加括号后的最小结果
public class M6038 {
    public String minimizeResult(String expression) {
            String[] a = expression.split("\\+");
            int num1 = Integer.valueOf(a[0]);
            int num2 = Integer.valueOf(a[1]);
            int min = num1+num2;
            int start = 0;
            int end = 0;
            int truel = 0;
            int truer = 0;
            if(a[0].length() ==1){
                start = 0;
                for (int j = 1; j <= a[1].length(); j++) {
                    end = j;
//                    System.out.println(a[0].substring(0,start)+"+"+a[1].substring(0,end));
                    int b = 1;
                    int c;

                    c = Integer.valueOf(a[0].substring(start, a[0].length()));

                    int d = Integer.valueOf(a[1].substring(0, end));
                    int e;
                    if(end == a[1].length()){
                        e = 1;
                    }else {
                        e = Integer.valueOf(a[1].substring(end, a[1].length()));
                    }
//                    int temp =Integer.parseInt(a[0].substring(0,start))*(Integer.parseInt(a[0].substring(start,a[0].length()))+Integer.parseInt(a[1].substring(0,j)))*Integer.parseInt(a[1].substring(j,a[1].length()));
                    int temp = b*(c+d)*e;
                    if(min > temp){
                        min = temp;
                        truel = start;
                        truer = end;
                    }
                }
                if(truel == 0&&truer == 0){
                    return "("+a[0]+"+"+a[1]+")";
                }
                String res = a[0].substring(0,truel)+"("+a[0].substring(truel,a[0].length())+"+"+a[1].substring(0,truer)+")"+a[1].substring(truer,a[1].length());

                return res;
            }
            for(int i=0; i<a[0].length(); i++){
                start = i;

                for (int j = 1; j <= a[1].length(); j++) {
                    end = j;
//                    System.out.println(a[0].substring(0,start)+"+"+a[1].substring(0,end));
                    int b ;
                    if(start == 0){
                        b = 1;
                    }else{
                        b = Integer.valueOf(a[0].substring(0, start));
                    }
                    int c;

                    c = Integer.valueOf(a[0].substring(start, a[0].length()));

                    int d = Integer.valueOf(a[1].substring(0, end));
                    int e;
                    if(end == a[1].length()){
                         e = 1;
                    }else {
                        e = Integer.valueOf(a[1].substring(end, a[1].length()));
                    }
//                    int temp =Integer.parseInt(a[0].substring(0,start))*(Integer.parseInt(a[0].substring(start,a[0].length()))+Integer.parseInt(a[1].substring(0,j)))*Integer.parseInt(a[1].substring(j,a[1].length()));
                    int temp = b*(c+d)*e;
                    if(min > temp){
                        min = temp;
                        truel = start;
                        truer = end;
                    }
                }
            }
//        System.out.println(min);
            if(truel == 0&&truer == 0){
                return "("+a[0]+"+"+a[1]+")";
            }
            String res = a[0].substring(0,truel)+"("+a[0].substring(truel,a[0].length())+"+"+a[1].substring(0,truer)+")"+a[1].substring(truer,a[1].length());

            return res;
    }
    @Test
    public void test(){
        System.out.println(minimizeResult("236+1841"));
    }
}
