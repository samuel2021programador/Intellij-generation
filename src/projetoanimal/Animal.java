package projetoanimal;

public class Animal{
    private String nome;
    private String cor;
    private int idade;
    private int patas;


    public Animal(String nome, String cor, int idade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.patas = patas;
    }
    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
