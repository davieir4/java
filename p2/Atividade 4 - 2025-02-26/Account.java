package Atividade4;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;

    }

    public int getNumber(){
        return this.number;
    }
    public String getHolder(){
        return this.holder;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getWithdrawLimit(){
        return this.withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

}
