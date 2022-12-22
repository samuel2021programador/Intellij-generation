package funcionario;

public class Funcionario {
    //4) Crie uma classe funcionário e apresente os atributos e métodos
    //referentes esta classe, em seguida crie um objeto funcionário, defina as
    //instancias deste objeto e apresente as informações deste objeto no
    //console.

    private String nome;
    private String RACF;
    private String cargo;
    private int idade;
    private int funcional;

    public Funcionario(String nome, String RACF, String cargo, int idade, int funcional) {
        this.nome = nome;
        this.RACF = RACF;
        this.cargo = cargo;
        this.idade = idade;
        this.funcional = funcional;
    }
    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRACF() {
        return RACF;
    }

    public void setRACF(String RACF) {
        this.RACF = RACF;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }
}
