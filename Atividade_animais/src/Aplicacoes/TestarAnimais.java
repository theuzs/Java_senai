package Aplicacoes;

import Entidades.Mamifero;
import Entidades.Peixe;

public class TestarAnimais {

    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0f, "Plantas");
        camelo.dadosMamifero();
        
        Peixe tubarao = new Peixe("Tubarão", 300, 0, "Cinza", "Mar", 1.5f, "Barbatanas afiladas");
        tubarao.dadosPeixe();
        
        Mamifero urso = new Mamifero("Urso", 180, 4, "Marrom", "Floresta", 0.5f, "Peixes e Frutas");
        urso.dadosMamifero();
    }
}
