/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
import java.util.Scanner;


public class exe03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int combustivel =1;

        while( combustivel != 0){
            System.out.println("Digite a numeração do combustivel abastecido");
             combustivel = scanner.nextInt();

             if (combustivel >= 1 && combustivel <= 4){
                 System.out.println("Código Invalido! Digite de novo");
             } else if (combustivel ==1 ){
                 System.out.println("1.Álcool");
             } else if (combustivel == 2){
                 System.out.println("2.Gasolina");
             }else if (combustivel == 3){
                 System.out.println("2.Diesel");
             }else if (combustivel == 4){
                 System.out.println("2.Fim");
             }
        }
        System.out.println("Muito Obrigado!");
        scanner.close();
    }

}
 */

import java.util.Scanner;

public class exe03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int combustivel = 0;

        System.out.println("Digite a numeração do combustivel abastecido:");
        combustivel = scanner.nextInt();

        while (combustivel != 4){
            if (combustivel == 1){
                alcool++;
            } else if (combustivel == 2){
                gasolina++;
            } else if (combustivel == 3){
                diesel++;
            } else {
                System.out.println("Código inválido! Digite novamente:");
            }

            combustivel = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
