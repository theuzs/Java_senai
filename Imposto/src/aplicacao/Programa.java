package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // lista para armazenar os contribuintes
        List<Contribuinte> contribuintes = new ArrayList<>();

        // Solicita ao usuário a quantidade de contribuintes
        System.out.print("Quantos contribuintes você deseja registrar? ");
        int n = sc.nextInt();

        // Loop para registrar os contribuintes
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Dados do contribuinte #" + (i + 1) + ":");

            // Solicita o tipo de contribuinte
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char tipo = sc.next().charAt(0);

            // Solicita o nome do contribuinte
            System.out.print("Nome: ");
            sc.nextLine(); // Consumir o caractere de nova linha restante
            String nome = sc.nextLine();

            // Solicita a renda anual do contribuinte
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            // Verifica o tipo de contribuinte e solicita os dados específicos
            if (tipo == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosComSaude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
            } else {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();
                contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }
        }

        // Variável para acumular o total de impostos arrecadados
        double totalImpostos = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");

        // Loop para calcular e imprimir o imposto de cada contribuinte
        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            System.out.printf("%s: R$ %.2f%n", contribuinte.getNome(), imposto);
            totalImpostos += imposto;
        }

        // Imprime o total de impostos arrecadados
        System.out.printf("%nTOTAL DE IMPOSTOS: R$ %.2f%n", totalImpostos);

        sc.close();
    }
}