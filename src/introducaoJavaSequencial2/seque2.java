package introducaoJavaSequencial2;

import java.util.Scanner;

public class seque2 {
    //2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
    //expressa em anos, meses e dias.
    public static void main(String[] args) {
        int diasVida, dias, mes, ano;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Coloque a quantidade de dias de vida: \n");
        diasVida = entrada.nextInt();

        ano = (diasVida/365);
        mes = (diasVida%365/31);
        dias = (diasVida%365%31);

        System.out.println("Você tem " + ano + " anos de vida");
        System.out.println("Você tem " + mes + " meses de vida");
        System.out.println("Você tem " + dias + " dias de vida");
    }
}

