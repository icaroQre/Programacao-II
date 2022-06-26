//Crie uma classe chamada Lampada. A classe deve ter o atributo (campo) acesa.
//A classe deve ter os métodos:
//● acender( ) (muda o campo acesa para verdadeiro)
//● apagar( ) (muda o campo acesa para falso)
//Crie um método chamado mostrarEstado( ) que retorna a mensagem “acesa” ou
//“apagada” conforme o valor do campo acesa.
  
public class Main {
  public static void main(String[] args) {

    Lampada lampada = new Lampada();

    System.out.println(lampada.mostrar());
    lampada.ligar();
    System.out.println(lampada.mostrar());
    lampada.desligar();
    System.out.println(lampada.mostrar());
  }
}
