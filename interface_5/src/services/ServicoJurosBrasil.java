package services;



public class ServicoJurosBrasil implements ServicoJuros {

    private double taxaJuros;

    public ServicoJurosBrasil(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getTaxaJuros() {
        return taxaJuros;
    }
}