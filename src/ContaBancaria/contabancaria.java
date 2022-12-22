package ContaBancaria;
//6) Crie uma classe conta bancaria e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto conta bancaria, defina
//as instancias deste objeto e apresente as informações deste objeto no
//console.


public class contabancaria {

    //nome do objeto
    // atributos - caracteristicas do objeto
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;
    private float sacado;


    public contabancaria(int numero, int agencia, int tipo, String titular, float saldo,float sacado) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
        this.sacado = sacado;

    }


    public contabancaria(){}
    //metodos acessores da classe contabancaria - depender de objeto pra objeto


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSacado() {
        return sacado;
    }
    public void setSacado(float sacado) {
        this.sacado = sacado;
    }
//metodos especificos de conta bancaria

    public boolean sacar(float valorSacado){
        if (this.getSaldo() < valorSacado){
            System.out.println("Saldo insuficiente, trbalhe mais ");
            return false;
        }
        this.setSaldo(this.getSaldo() - valorSacado);
        System.out.println("Valor sacado com sucesso! O Seu saldo atual é:  " + this.getSaldo());
        return true;
    }
}
