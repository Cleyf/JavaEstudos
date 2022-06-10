package exercbank;

import java.util.Locale;
import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank b;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("is there na initial value? (y/n)");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value ");
            double initialDeposit = sc.nextDouble();
            b = new Bank(accountNumber, name, initialDeposit);
        } else {
            b = new Bank(accountNumber, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(b);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        b.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(b);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        b.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(b);

        for (int i=0; i<4; i++) {

        }

        System.out.println(b.toString());
        sc.close();
    }
}
