import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x= leia.nextInt();
        double nota1, nota2, nota3 , media;
        for (int i=1; i<=x; i++){
            System.out.println("Informe a nota: ");
            nota1 = leia.nextDouble();
            System.out.println("Informe a nota: ");
            nota2 = leia.nextDouble();
            System.out.println("Informe a nota: ");
            nota3 = leia.nextDouble();

            if(i == 1) {
                media = (nota1*2 + nota2*3 + nota3*5)/10 ;
                System.out.println("A média é " + media);
            } else if (i == 2) {
                media = (nota1*2 + nota2*3 + nota3*5)/10 ;
                System.out.println("A média é " + media);
            } else if (i == 3) {
                media = (nota1*2 + nota2*3 + nota3*5)/10 ;
                System.out.println("A média é " + media);
            }

        }
        leia.close();
    }
}
