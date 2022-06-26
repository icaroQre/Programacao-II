//Café é um produto muito apreciado por programadores. Sabendo disso, a empresa
//ProgExpress lançou uma máquina de café que trabalha com cartões pré-pagos. O
//sistema funciona da seguinte maneira: o cliente adquire um cartão, inicialmente com
//10 unidades (10 cafés). A cada café retirado da máquina, o saldo do cartão é
//decrementado. O cliente pode comprar mais cafés (carregar o cartão) com uma
//quantidade qualquer de unidades.
//O exercício consiste em criar a classe Cartao com os atributos e métodos
//adequados.

public class Main {
    public static void main(String[] args) {
  
    Cartao cartao = new Cartao(10);
  
        System.out.println("Seu saldo é de: " + cartao.getSaldo());
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        cartao.pegarCafe();
        System.out.println("Seu saldo é de: " + cartao.getSaldo());
        cartao.recarregar(10);
        System.out.println("Seu saldo é de: " + cartao.getSaldo());

    }
}
