
package model;
public class Computador extends Produto{
    private int VelocidadeDeProcessamento = 3; //3GHz

    @Override
    public void ligar() {
        System.out.println("Computador pronto para o uso");
    }

    @Override
    public void desligar() {
        System.out.println("ocomputador ja pode ser desligado com seguranca");
    }
    public final void processar(){
        System.out.println("computador processando");
    }

    public int getVelocidadeDeProcessamento() {
        return VelocidadeDeProcessamento;
    }

    public void setVelocidadeDeProcessamento(int VelocidadeDeProcessamento) {
        this.VelocidadeDeProcessamento = VelocidadeDeProcessamento;
    }
}
