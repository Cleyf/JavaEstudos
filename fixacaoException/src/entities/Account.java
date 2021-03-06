package entities;

import exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        amount += balance;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
        System.out.println("Withdraw sucess!");
        System.out.println(this.getBalance());
    }

    private void validateWithdraw(double amount) {
        if(amount > getWithdrawLimit()){
            throw new BusinessException("The amount exceeds withdraw limits!");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Not enought Balance!");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", Holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
