package exercbank;

import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String name;
    private double balance;

    Scanner sc = new Scanner(System.in);

    public Bank(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public Bank(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double d){
        d = this.balance + d;
    }

    public void withdraw(double w){
        w = this.balance - w + 5.00;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
