package projetoanimal;

public class AnimalTeste extends Animal {
    /*private String CadeiaAnimal;

    public AnimalTeste(String nome, String cor, int idade, int patas, String cadeiaAnimal) {
        super(nome, cor, idade, patas);
        this.CadeiaAnimal = cadeiaAnimal;
    }

    public AnimalTeste(){}

    public String getCadeiaAnimal() {
        return CadeiaAnimal;
    }

    public void setCadeiaAnimal(String cadeiaAnimal) {
        CadeiaAnimal = cadeiaAnimal;
    }*/

    public static void main (String[]args) {
        //animal 1
        Animal VidaAnimal = new Animal("Dog","Black",8,4);
        System.out.println("O nome do animal é: " + VidaAnimal.getNome());
        System.out.println("A cor do animal é: " + VidaAnimal.getCor());
        System.out.println("A idade do animal é: " + VidaAnimal.getIdade());
        System.out.println("O animal tem: " + VidaAnimal.getPatas() + "  Patas");

        //animal 2
        Animal Animal2 = new Animal("Horse","white",10,4);
        System.out.println("O nome do animal é: " + Animal2.getNome());
        System.out.println("A cor do animal é: " + Animal2.getCor());
        System.out.println("A idade do animal é: " + Animal2.getIdade());
        System.out.println("O animal tem: " + Animal2.getPatas() + "  Patas");

        //os dois animais são
        System.out.println("Os nome dos dois animais que temos são: " + Animal2.getNome()+ "  and   " +VidaAnimal.getNome());


    }
}
