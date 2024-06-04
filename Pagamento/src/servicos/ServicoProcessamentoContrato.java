package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcela;

public class ServicoProcessamentoContrato {
    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoProcessamentoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void processarContrato(Contrato contrato, int meses) {
        double valorBaseParcela = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            LocalDate dataVencimento = contrato.getData().plusMonths(i);
            double valorAtualizado = valorBaseParcela + servicoPagamentoOnline.juros(valorBaseParcela, i);
            double valorFinal = valorAtualizado + servicoPagamentoOnline.taxaPagamento(valorAtualizado);
            contrato.adicionarParcela(new Parcela(dataVencimento, valorFinal));
        }
    }
}