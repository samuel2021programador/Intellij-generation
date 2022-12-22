package introducaoJavaSequencial;

import java.util.Scanner;
        //1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
        //dias e mostre-a expressa apenas em dias.
        public class introducaoJavaSequencial1 {
            public static void main(String[] args) {
                // declaração de variaveis
                int ano, mes, dia, somadias;
                // declaração de uso do scanner, para pegar dados de entrada do usuário
                Scanner entrada = new Scanner(System.in);

                // interação com o usuario
                System.out.println("Anos de vida: ");
                // a variável entrada será preenchida com o proximo inteiro digitado no terminal
                // e depois será repassada para a variavel ano
                ano = entrada.nextInt();

                System.out.println("Mes de nascimento: ");
                mes = entrada.nextInt();

                System.out.println("Dia de nascimento: ");
                dia = entrada.nextInt();

                somadias = (((mes*31)+ dia)+(ano*365));
                System.out.println("Sua idade em dias eh: " + somadias);
            }
        }

