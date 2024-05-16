package Entidades;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    // Getter and Setter
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        dados();
        System.out.println("Característica: " + caracteristica);
    }
}
