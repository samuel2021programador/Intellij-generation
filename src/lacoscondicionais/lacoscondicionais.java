package lacoscondicionais;

import java.util.Scanner;

public class lacoscondicionais {
    // Faça um programa que receba três inteiros e diga qual deles é o maior.
    public static void main(String[] args) {

        int n1,n2,n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextInt();

        System.out.println("Informe o segundo valor");
        n2 = entrada.nextInt();

        System.out.println("Informe o terçeiro valor");
        n3 = entrada.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println("O primeiro numero inserido e maior " + n1);
        }

        else if(n3 < n2) {
            System.out.println("O segundo numero inserido é o maior "+ n2);
        }

        else {
            System.out.println("O terceiro numero é o maior "+ n3);
        }

        System.out.println("Fim do programa");
    }
}
