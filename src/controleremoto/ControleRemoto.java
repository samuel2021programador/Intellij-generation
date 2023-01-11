package controleremoto;

public class ControleRemoto {
    public String mover(String tipoBrinquedo,boolean paraquedas){
        return "O brinquedo movido foi o Avião";
    }
    public String mover(String tipoBrinquedo,boolean sinalizador, boolean boia)
    {
        return "O brinquedo movido foi o barco";
    }
    public String mover(String tipoBrinquedo){
        return "O brinquedo movido foi o carro";
    }
}
