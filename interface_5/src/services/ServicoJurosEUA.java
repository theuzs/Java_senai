package services;



public class ServicoJurosEUA implements ServicoJuros {

    private double taxaJuros;

    public ServicoJurosEUA(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }
}