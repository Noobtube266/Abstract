package Hw2;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }
}
