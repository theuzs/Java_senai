package entidades;

public class PessoaJuridica extends Contribuinte {
    private int numeroDeFuncionarios;

    // Construtor para inicializar os atributos, incluindo os herdados de Contribuinte
    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    // Métodos getters e setters para o atributo numeroDeFuncionarios
    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    // Implementação do método calcularImposto para PessoaJuridica
    @Override
    public double calcularImposto() {
        // Calcula o imposto baseado na renda anual e no número de funcionários
        if (numeroDeFuncionarios > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}