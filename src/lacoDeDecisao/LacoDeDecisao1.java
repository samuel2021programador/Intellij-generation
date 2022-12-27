package lacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n1, n2, n3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe 3 valores: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 +" é maior!");
        }else if (n2 > n3){
            System.out.println(n2 +" é maior!");
        }else {
            System.out.println(n3 +" é maior!");
        }
        System.out.println("Fim da execução!");
    }
}
