package application;

import java.util.Locale;
import java.util.Scanner;

import services.ServicoJurosBrasil;
import services.ServicoJuros;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();
        
        ServicoJuros sj = new ServicoJurosBrasil(2.0);
        double pagamento = sj.pagamento(quantia, meses);
        
        System.out.println("Pagamento após " + meses + " meses:");
        System.out.println(String.format("%.2f", pagamento));
        
        sc.close();
    }
}