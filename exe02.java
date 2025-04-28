/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int x = 1;
        int y = 1;

        while (x != 0 && y !=0) {

            System.out.println(" Digite a coordenada X");
             x = scanner.nextInt();
            System.out.println(" Digite a coordenada Y");
            y = scanner.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
        }
        scanner.close();
    }
}
