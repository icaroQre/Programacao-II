public class Caixa {

    int largura, altura, comprimento;
    
    Caixa (){

        largura = 0;
        altura = 0;
        comprimento = 0;
    }

    Caixa (int largura, int altura, int comprimento){

        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;

    }

    Caixa (int largura){

        this.largura = largura;
        this.altura = largura;
        this.comprimento = largura;

    }

    public int calcularVolume (){

        return (largura * altura * comprimento);
        
    }
    
}
