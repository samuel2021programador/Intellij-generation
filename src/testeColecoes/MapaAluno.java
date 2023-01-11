package testeColecoes;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno { //mapeia as estruturas dos valores - valores podem ser duplicados, mas a chaves n
    public static void main(String args[])
    {
        Map<String,Aluno> mapa = new TreeMap<String,Aluno>();

        Aluno a = new Aluno("Geovana","Inglês",7.8);
        Aluno b = new Aluno("Carlos","Inglês",4.8);
        Aluno c = new Aluno("Rodrigo","Inglês",2.8);
        Aluno d = new Aluno("Samuel","Inglês",10.0);

        mapa.put("Geovana",a);
        mapa.put("Carlos",b);
        mapa.put("Rodrigo",c);
        mapa.put("Samuel",d);

        System.out.println(mapa);
        System.out.println(mapa.get("Samuel"));

        Collection<Aluno> alunos = mapa.values();
        for (Aluno e:alunos)
        {
            System.out.println(e);
        }
    }
}
