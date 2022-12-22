package lacoscondicionais;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n1 , n2 , n3, cont;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe 1 número:\n");
        n1 = entrada.nextInt();
        System.out.println("Informe 1 número:\n");
        n2 = entrada.nextInt();
        System.out.println("Informe 1 número:\n");
        n3 = entrada.nextInt();

        if(n1 > n2){
            cont = n2;
            n2 = n1;
            n1 = cont;
        }
        if(n1 > n3) {
            cont = n3;
            n3 = n1;
            n1 = cont;
        }
        if(n2 > n3){
            cont = n3;
            n3 = n2;
            n2 = cont;
        }
        System.out.println("Em ordem crescente: "+ n1+" "+n2+" "+n3);
    }

}
