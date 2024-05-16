package Entidades;

public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso VIP: R$ " + (valor + valorAdicional));
    }

    public double getValorVIP() {
        return valor + valorAdicional;
    }
}
