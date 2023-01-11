package testeColecoes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
    public static void main(String args[])
    {
        Set<Aluno>conjunto = new HashSet<Aluno>();
        Aluno a = new Aluno("Geovana","Inglês",7.8);
        Aluno b = new Aluno("Carlos","Inglês",4.8);
        Aluno c = new Aluno("Rodrigo","Inglês",2.8);
        Aluno d = new Aluno("Samuel","Inglês",10.0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);

    }
}
