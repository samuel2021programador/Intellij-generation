package aviao;

public class TesteAviao {
    public static void main(String[]args){
        //adicionando os valores - inserindo o 2 escopo
        Aviao novoAviao = new Aviao(2,3,5000,false,true,"azul","carga","boeing","gol","azul");
        System.out.println("Quantidade de motores: " + novoAviao.getMotores());
        System.out.println("Quantidade de classes: " + novoAviao.getClasses());
        System.out.println("Quantidade de capacidade: " + novoAviao.getCapacidade());
        System.out.println("tem lanche? " + novoAviao.isTemLanche());
        System.out.println("Companhia: " + novoAviao.getCompanhia());
        System.out.println("Tipo de transporte: " + novoAviao.getTipoTransporte());
        System.out.println("Fabricante: " + novoAviao.getFabricante());
        System.out.println("Marca: " + novoAviao.getMarca());
        System.out.println("Cor: " + novoAviao.getCor());
    }
}
