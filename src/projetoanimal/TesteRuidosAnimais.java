package projetoanimal;

public class TesteRuidosAnimais {
    public static void main(String[] args) {

        RuidosAnimais ruidosAnimais = new RuidosAnimais();

        System.out.println("O ruído emitido foi" + ruidosAnimais.ruido("cachorro"));
        System.out.println("O ruído emitido foi" + ruidosAnimais.ruido("cavalo", true));
        System.out.println("O ruído emitido foi" + ruidosAnimais.ruido("gato", true, true));

    }
}
