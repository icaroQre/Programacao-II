//Crie uma classe Caixa com os atributos largura, altura e comprimento. Crie o método
//calcularVolume( ), que retorna o volume da caixa (lagura x altura x comprimento).

//A classe deve ter um construtor “vazio”, que inicia os atributos com 0 (zero). Deve
//ter um segundo construtor, que recebe os três atributos como parâmetros. Deve ter
//um terceiro construtor, que recebe um único parâmetro. Neste caso, inicie os três
//atributos com o parâmetro recebido (a caixa é um cubo).
//Crie uma classe chamada Main para instanciar objetos. Instancie um objeto
//chamando o primeiro construtor, um chamando o segundo e outro chamando o
//terceiro construtor.

public class Main {
    public static void main(String[] args) throws Exception {

        Caixa caixa = new Caixa();
        Caixa caixa2 = new Caixa(2, 4, 3);
        Caixa caixa3 = new Caixa(5);

        System.out.println(caixa.calcularVolume());
        System.out.println(caixa2.calcularVolume());
        System.out.println(caixa3.calcularVolume());
    }
}

