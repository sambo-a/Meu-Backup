
package model;
public class Impressora extends Produto{
    private String descricaoSobreAVelocidade = "6 ppm";

    @Override
    public void ligar() {
        System.out.println("A  Impressora esta pronta para o receber documentos");
    }

    @Override
    public void desligar() {
        System.out.println("Impressora nao esta desponivel;");
    }
    public final void imprimir(){
        System.out.println("a Impressora esta em uso");
    }

    public String getDescricaoSobreAVelocidade() {
        return descricaoSobreAVelocidade;
    }

    public void setDescricaoSobreAVelocidade(String descricaoSobreAVelocidade) {
        this.descricaoSobreAVelocidade = descricaoSobreAVelocidade;
    }

  
}
