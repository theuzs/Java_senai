package Aplicacoes;
import Entidades.Ingresso;

public class Normal extends Ingresso {

    public Normal(double valor) {
        super(valor);
    }

    public void imprimeIngressoNormal() {
        System.out.println("Ingresso Normal");
    }
}