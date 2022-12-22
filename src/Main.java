import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaração de variaveis//
        int ano,mes,dia,somadias;
        Scanner entrada = new Scanner(System.in);

        //interação com o user//
        System.out.println("anos de vida: ");
        ano = entrada.nextInt();

        System.out.println("mes de nascimento: ");
        mes = entrada.nextInt();

        System.out.println("dia de nascimento: ");
        dia = entrada.nextInt();

        somadias = (((mes*31)+ dia)+(ano*365));
        System.out.println("sua idade em dias é : " + somadias);



    }
}