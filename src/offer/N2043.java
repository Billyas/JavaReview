package offer;

import org.junit.Test;

class Bank {

    long[] balance;

    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(account1<= balance.length&&account2<= balance.length&&money<=balance[account1-1]){
            balance[account1-1] -=money;
            balance[account2-1] +=money;
            return true;
        }else {
            return false;
        }
    }

    public boolean deposit(int account, long money) {
        if(money<=0||account>balance.length){
            return false;
        }else{
            balance[account-1] +=money;
            return true;
        }
    }

    public boolean withdraw(int account, long money) {
        if(account<=balance.length&&balance[account-1]>=money){
            balance[account-1] -= money;
            return true;
        }else{
            return false;
        }
    }
}


public class N2043 {
    @Test
    public void test(){
        Bank bank = new Bank(new long[]{10,100,20,50,30});
        bank.withdraw(3, 10);
        bank.transfer(5, 1, 20);
    }
}
