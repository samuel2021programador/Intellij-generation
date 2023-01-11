package estoqueloja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    public static void main(String[]args){
        //TODO auto-generated method stub

        //itens da lista
        List<String> estoque = new ArrayList<String>();

        estoque.add("Shirt");
        estoque.add("pants");
        estoque.add("hat");

        //estoque antes da atualização
        System.out.println("Temos em estoque antes da black friday : " + estoque);

        //atualizar lista
        //tbm dá pra remover por numero
        estoque.remove("hat");
        estoque.add("Phone");

        //lista impressa atualizada
        System.out.println("Temos em estoque após a black friday: " + estoque);

        //remover 1
        estoque.remove("Shirt");
        System.out.println("Temos em estoque após a black friday: " + estoque);

    }
}
