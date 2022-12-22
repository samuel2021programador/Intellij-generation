package lacoscondicionais;

import java.util.Scanner;


public class swithCase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao;

        //System.out.println("digite seu numero");
        //opcao = entrada.nextInt();

        while(true){
            System.out.println ("digite um numero de 0 a 5 onde: "
                + "\n 1 - soma 2 com 5"
                + "\n 2 - elevar o numero digitado ao cubo"
                    + "\n 3 - mostrar o numero de letras"
                    + "\n 4 - qual é a quinta letra da palavra inconstitucionalissimamente? "
                    + "\n 5 - sortear um numero aleatório de 0 a 5");
            opcao = entrada.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("o resultado de 2 + 5 é 7");
                    break;
                case 2:
                    System.out.println("2 elevado ao cubo é" + Math.pow(opcao,3));
                    break;
                case 3:
                    System.out.println("a palavra paralelepipedo tem" + "paralelepipedo".length() + "letras nela");
                    break;
                case 4:
                    System.out.println("a 5 letra é: " + "inconstitucionalissimamente".charAt(4));
                    break;
                case 5:
                    System.out.println("o numero sorteado foi: " + Math.random());
                    break;

                case 0:
                    System.out.println("Obg até mais");
                    System.exit(0);
                    break;
                default:
                    System.out.println("digite um numero de 1 a 3");
                    break;
            }
        }
    }
}
