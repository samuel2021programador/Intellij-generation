package Teste;

public class TesteCarro {
    public static void main (String args[]){
        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "BMW";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMax = 80;

        meuCarro.liga();
        System.out.println("A cor do seu carro é: " + meuCarro.cor);
        System.out.println("O modelo do seu carro é: " +  meuCarro.modelo);
        meuCarro.acelera(55);
        System.out.println("A velocidade do seu carro é: " + meuCarro.velocidadeAtual + "KM por hora");
        meuCarro.pegaMarcha();
        System.out.println("Seu carro está na marcha: " + meuCarro.pegaMarcha());

    }
}
