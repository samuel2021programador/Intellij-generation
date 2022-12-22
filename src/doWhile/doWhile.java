package doWhile;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero , incremento = 0 ;

        System.out.println("digite um numero inteiro: ");
        numero = entrada.nextInt();



       do{System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
            incremento++;
        } while (incremento == 10);
    }
}

