package ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[]args){
        //
        contabancaria novaConta=new contabancaria(12879,6555,2,"Samuel Saturno Santos",
                60000f,10000);
        System.out.println("Numero da conta: "+ novaConta.getNumero());
        System.out.println("Numero da agencia: "+ novaConta.getAgencia());
        System.out.println("Conta: "+ novaConta.getTipo());
        System.out.println("Nome titular: "+ novaConta.getTitular());
        System.out.println("Você fez um saque de: " + novaConta.getSacado());
        novaConta.sacar(novaConta.getSacado());
    }
}
