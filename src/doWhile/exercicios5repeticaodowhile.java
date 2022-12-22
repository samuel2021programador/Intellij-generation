package doWhile;

import java.util.Scanner;

public class exercicios5repeticaodowhile {
    //5- Crie um programa que leia um número do teclado até que encontre um
    //número igual a zero. No final, mostre a soma dos números
    //digitados.(DO...WHILE)
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int numero,soma = 0;

        do{ System.out.println("digite um numero inteiro para add e 0 para sair");
            numero = entrada.nextInt();
            soma += numero;
            //soma = soma +numer0

        }while(numero != 0);
            System.out.println("A soma dos numeros é: " + soma );
    }
}
