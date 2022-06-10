package application;

import java.util.Scanner;

public class Program {
/*  este programa faz uma matriz com L para quantidade de linhas e C para colunas.
*   depois ele procura no proximo for o número int = x, revela sua posição
*  e os números que estão a sua direita esquerda e embaixo.
*
*
*
*  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        int mat[][] = new int[L][C];

        for (int l=0; l< mat.length; l++) {
            for (int c=0;c<mat[l].length; c++){
                mat[l][c] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int l=0; l<mat.length; l++) {
            for (int c=0;c<mat[l].length; c++){
                if (mat[l][c] == x){
                    System.out.println("x position " + mat[x]);
                    System.out.println("Position " + l + "," + c + ":");
                    if (l > 0) {
                        System.out.println("Left: " + mat[l][c-1]);
                    }
                    if (c > 0) {
                        System.out.println("Up: " + mat[l-1][c]);
                    }
                    if (l < mat[l].length-1) {
                        System.out.println("Right: " + mat[l][c+1]);
                    }
                    if (c < mat.length-1) {
                        System.out.println("Down: " + mat[l+1][c]);
                    }
                }
            }
        }

        sc.close();
    }
}
