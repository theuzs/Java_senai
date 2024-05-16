package Aplicacoes;
import Entidades.Ingresso;
import Entidades.VIP;
import Entidades.CamaroteInferior;
import Entidades.CamaroteSuperior;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50);
        ingresso.imprimeValor();

        Normal normal = new Normal(50);
        normal.imprimeValor();
        normal.imprimeIngressoNormal();

        VIP vip = new VIP(50, 20);
        vip.imprimeValor();

        CamaroteInferior camaroteInferior = new CamaroteInferior(50, 20, "Frente ao palco");
        camaroteInferior.imprimeValor();
        camaroteInferior.imprimeLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(50, 20, 30);
        camaroteSuperior.imprimeValor();
    }
}
