package testeColecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
    public static void main(String[]args){
        Collection<String> nomes = new ArrayList<>();
        nomes.add("Mario");
        nomes.add("Rafael");
        nomes.add("Savio");
        nomes.add("Caio");

        for (String name : nomes)
        {
            System.out.println("Lista de nome: " + name); //percorrer todos os nomes
        }

        /*Collection<String> nomes2 = Arrays.asList("ISa","Carla");
        nomes.addAll(nomes2);//addAll faz essa adição na lista dos objetos
        System.out.println("Lista de nomes: " + nomes);*/


        /*System.out.println("Contém o nome Mario ? " + nomes.contains("Mario"));//verificar se tem o objeto
        System.out.println("Lista:" +nomes);*/

        /*System.out.println("Lista de nome: " + nomes);
        nomes.clear(); //limpar tudo
        System.out.println("Lista de nome: " + nomes);*/

        /*System.out.println("Lista de nome: " + nomes);
        nomes.remove("Mario"); //remove um elemento
        System.out.println("Lista de nome: " + nomes);*/

        /*if (nomes.isEmpty())
        {
            System.out.println("Lista vazia....");
        }else
        {
            System.out.println("Lista de nomes: " + nomes);
        }
            System.out.println("Lista de nome: " + nomes);*/
    }
}
