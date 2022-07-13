package day;
class ATM {
    long[] money;
    long[] b;
    public ATM() {
        money = new long[5];
        b = new long[]{20, 50, 100, 200, 500};
    }

    public void deposit(int[] banknotesCount) {
        for(int i=0; i<5; i++){
            money[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] res = new int[5];
        for(int i=4; i>=0; i--){
            int tmp = (int) Math.min(money[i],amount/b[i]);
            res[i] = tmp;
            amount -= res[i]*b[i];
        }
        if(amount>0){
            return new int[]{-1};
        }
        for (int i = 0; i < 5; i++) {
            money[i] -= res[i];
        }
        return res;
    }
}
public class D6062 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(new int[]{0,0,1,2,1});
        System.out.println(atm.withdraw(600));
        atm.deposit(new int[]{0,1,0,1,1});
        System.out.println(atm.withdraw(600));
        System.out.println(atm.withdraw(500));
    }
}
