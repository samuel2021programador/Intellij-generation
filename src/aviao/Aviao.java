package aviao;

public class Aviao {
    //2) Crie uma classe avião e apresente os atributos e métodos referentes
    //esta classe, em seguida crie um objeto avião, defina as instancias deste
    //objeto e apresente as informações deste objeto no console.
    //tipo

    private int motores;
    private int classes;
    private int capacidade;
    private boolean tipoMotor;
    private boolean temLanche;
    private String companhia;
    private String tipoTransporte;
    private String fabricante;
    private String marca;
    private String cor;

    public Aviao(int motores, int classes, int capacidade, boolean tipoMotor, boolean temLanche, String companhia, String tipoTransporte, String fabricante, String marca, String cor) {
        //vão ser digitados pelo user
        //contrutor cheio

        if (tipoTransporte == "carga"){
            classes = 0;
            temLanche = false;

        }
        this.motores = motores;
        //true =
        //false =
        this.classes = classes;
        this.capacidade = capacidade;
        this.tipoMotor = tipoMotor;
        this.temLanche = temLanche;
        this.companhia = companhia;
        this.tipoTransporte = tipoTransporte;
        this.fabricante = fabricante;
        this.marca = marca;
        this.cor = cor;
    }

    public Aviao(){}
    //construtor vazio - automatico


    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(boolean tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public boolean isTemLanche() {
        return temLanche;
    }

    public void setTemLanche(boolean temLanche) {
        this.temLanche = temLanche;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
