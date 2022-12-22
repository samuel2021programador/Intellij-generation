package POO;

public class pessoa {
    private String primeiroNome;
    private String ultimoNome;
    private String NomesdoMeio;

    public pessoa(String primeiro,String meio,String ultimo){
        primeiroNome=primeiro;
        ultimoNome=ultimo;
        NomesdoMeio=meio;
    }

    public String getNomeCompleto(){
        String nomeCompleto = primeiroNome + "" + NomesdoMeio + "" +  ultimoNome;
        return nomeCompleto;

    }
}
