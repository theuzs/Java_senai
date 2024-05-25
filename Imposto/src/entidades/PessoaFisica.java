package entidades;

public class PessoaFisica extends Contribuinte {
    private double gastosComSaude;

    // Construtor para inicializar os atributos, incluindo os herdados de Contribuinte
    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    // Métodos getters e setters para o atributo gastosComSaude
    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    // Implementação do método calcularImposto para PessoaFisica
    @Override
    public double calcularImposto() {
        // Calcula o imposto baseado na renda anual e nos gastos com saúde
        double imposto;
        if (getRendaAnual() < 20000.0) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }
        imposto -= getGastosComSaude() * 0.5;
        return imposto;
    }
}