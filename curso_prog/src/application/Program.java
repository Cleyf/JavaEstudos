package application;

import java.text.ParseException;
import entities.Rent;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
        System.out.println("Rent #" + i + ":");
        System.out.println("name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();

        vect[i] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++) {
            if (vect[i] != null ){
                System.out.println(i + ": " + vect[10]);
            }
        }

        sc.close();
    }
}
