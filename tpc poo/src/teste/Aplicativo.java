package teste;

import model.Computador;
import model.Impressora;

public class Aplicativo {

    public static void main(String[] args) {
        Computador c = new Computador();
        c.setVelocidadeDeProcessamento(100);
        c.setNumeroDeSerie(100);
        c.setTipo("hhhhh");
        Impressora i = new Impressora();
        i.setDescricaoSobreAVelocidade("8 ppm");
        i.setNumeroDeSerie(100);
        i.setTipo("hhhhh");
        
        Simulacao s = new Simulacao();
        s.simular(i);
        s.simular(c);
    }
}
