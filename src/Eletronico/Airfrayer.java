package Eletronico;

import Teste.Carro;

public class Airfrayer {

    //3) Crie uma classe produto eletrônico e apresente os atributos e métodos
    //referentes esta classe, em seguida crie um objeto produto eletrônico,
    //defina as instancias deste objeto e apresente as informações deste objeto
    //no console.

    String cor;
    String marca;
    float preco;

    void liga()
    {
        System.out.println("A airfryer está ligada ");
    }

    public static void main(String args[]) {
        Airfrayer minhaAirfrayer = new Airfrayer();
        minhaAirfrayer.cor = "Preta";
        minhaAirfrayer.marca = "mundial";

        System.out.println("A marca da airfrayer é: " + minhaAirfrayer.marca);
        System.out.println("A cor da airfrayer é: " + minhaAirfrayer.cor );
        minhaAirfrayer.liga();
    }
}


