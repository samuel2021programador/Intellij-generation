package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?\n");
        idade = entrada.nextInt();

        entrada.nextLine(); //limpar o buffer de entrada(Scanner);
        System.out.println("Qual o seu nome?\n");
        nome = entrada.nextLine();

        if (idade > 0 && idade <= 14) {
            System.out.println(nome + " categoria infantil pois sua idade: " + idade + " anos");
        } else if (idade >= 15 && idade < 18) {
            System.out.println(nome + " categoria junvenil pois sua idade: " + idade + " anos");
            } else if (idade >= 18) {
            System.out.println(nome +" categoria adulto pois sua idade: "+ idade+" anos");
        }
    }
}

