package lacosrepeticao;

public class exercicio1lacorepeticao {
    //informar todos os numeros de 1000 a 1999 que quando dividido por 11
    //obtemos resto = 5. (for)

    public static void main(String[] args){
        int incremento;

        for (incremento = 1000; incremento <= 1999; incremento++){
            if(incremento % 11 == 5 ){
                System.out.println(incremento);
            }
        }
    }
}
