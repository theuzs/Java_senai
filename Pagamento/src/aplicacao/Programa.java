package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.ServicoPagamentoPaypal;
import servicos.ServicoProcessamentoContrato;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Entre com o número de parcelas: ");
        int meses = sc.nextInt();

        ServicoProcessamentoContrato servicoProcessamentoContrato = new ServicoProcessamentoContrato(new ServicoPagamentoPaypal());

        servicoProcessamentoContrato.processarContrato(contrato, meses);

        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela.getDataVencimento().format(fmt) + " - " + String.format("%.2f", parcela.getValor()));
        }

        sc.close();
    }
}