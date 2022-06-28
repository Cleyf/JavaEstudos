package applications;

import entities.Account;
import exceptions.BusinessException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();

        Account a = new Account(number, holder, balance, withdrawLimit);
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            a.withdraw(amount);
            System.out.printf("New amount: %.2f%n", a.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a.toString());




        sc.close();
    }
}
