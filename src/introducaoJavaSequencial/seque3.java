package introducaoJavaSequencial;

import java.util.Scanner;

public class seque3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int eventoSegundos, horas, minutos, segundos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite a quantidade de segundos do evento: ");

        eventoSegundos = entrada.nextInt();

        horas = (eventoSegundos/60/60);
        minutos = (eventoSegundos/60%60);
        segundos = (eventoSegundos%60);

        System.out.println("o evento durou "+horas+" horas, " + minutos + " minutos e " +segundos + " segundos");

    }
}
