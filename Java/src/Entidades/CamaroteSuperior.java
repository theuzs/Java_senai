package Entidades;

public class CamaroteSuperior extends VIP {
    private double valorAdicionalSuperior;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }

    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorAdicionalSuperior;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do ingresso Camarote Superior: R$ " + getValorCamaroteSuperior());
    }
}
