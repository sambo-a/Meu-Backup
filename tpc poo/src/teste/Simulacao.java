package teste;

import model.Computador;
import model.Impressora;
import model.Produto;

public class Simulacao {

    public void simular(Computador produto) {
        produto.desligar();
        produto.ligar();
        produto.processar();
    }
    public void simular(Impressora produto) {
        produto.desligar();
        produto.ligar();
        produto.imprimir();
    }


}
