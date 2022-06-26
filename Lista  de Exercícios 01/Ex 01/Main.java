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
