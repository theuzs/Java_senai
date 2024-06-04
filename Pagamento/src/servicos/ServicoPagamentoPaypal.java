package servicos;

public class ServicoPagamentoPaypal implements ServicoPagamentoOnline {

    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double JUROS_MENSAL = 0.01;

    @Override
    public double taxaPagamento(double quantia) {
        return quantia * TAXA_PAGAMENTO;
    }

    @Override
    public double juros(double quantia, int meses) {
        return quantia * JUROS_MENSAL * meses;
    }
}