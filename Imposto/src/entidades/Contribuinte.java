package entidades;

public abstract class Contribuinte {
    private String nome;
    private double rendaAnual;

    // Construtor para inicializar o nome e a renda anual do contribuinte
    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    // Métodos getters e setters para os atributos nome e rendaAnual
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    // Método abstrato que será implementado pelas subclasses para calcular o imposto
    public abstract double calcularImposto();
}