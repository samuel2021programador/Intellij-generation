package funcionario;

public class TesteFuncionario {
    public static void main (String[]args){
        Funcionario novoFuncinario = new Funcionario("Samuel Saturno Santos","SAMUSAT","PM",19,987357310);
        System.out.println("O nome do funcionário é: " + novoFuncinario.getNome());
        System.out.println("A RACF do funcionário é: " + novoFuncinario.getRACF());
        System.out.println("O cargo do funcionário é: " + novoFuncinario.getCargo());
        System.out.println("A idade do funcionário é: " + novoFuncinario.getIdade());
        System.out.println("A funcional do funcionário é: " + novoFuncinario.getFuncional());

    }
}
