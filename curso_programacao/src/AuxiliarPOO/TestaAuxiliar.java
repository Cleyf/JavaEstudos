package AuxiliarPOO;

import java.util.Scanner;
// neste exercicio fiz o teste do Currency Converter que converte o valor de Dolar em real com 6 %de juros
public class TestaAuxiliar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? " + CurrencyConverter.DOLLAR );
        System.out.print("How many dollars will be bought? ");
        double dolar = sc.nextDouble();
        System.out.println("Amount to be paid in reais: " + CurrencyConverter.converter(dolar));




        sc.close();
    }
}
