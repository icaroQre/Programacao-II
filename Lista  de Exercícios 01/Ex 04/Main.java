//Crie uma classe chamada Robo, que simula um robô. A classe deve ter um
//campo, do tipo texto, com o nome do robô e dois campos do tipo inteiro que indicam
//respectivamente os valores de x e y no plano cartesiano (figura). A classe deve ter
//um construtor parametrizado que recebe o nome do robô, o valor de x e o valor de y.
//Um robô pode andar para direita (x é incrementado), andar para esquerda (x é
//decrementado), andar para baixo (y é decrementado) e andar para cima (y é
//incrementado). Um robô pode, também, se teletransportar para uma coordenada
//específica. Um robô também deve saber informar sua posição (um método que
//retorna x e y).
  
public class Main {
    public static void main(String[] args) throws Exception {

        Robo robo;
        robo = new Robo("Roberto", 0, 0, 5, 8);

        System.out.println(robo.nomeRobo);
        System.out.println(robo.mostrarLocal());
        robo.andarFrente();
        robo.andarFrente();
        robo.andarFrente();
        robo.andarDireita();
        robo.andarDireita();
        robo.andarDireita();
        System.out.println(robo.mostrarLocal());
        robo.teleporte();
        System.out.println(robo.mostrarLocal());

    }
}
