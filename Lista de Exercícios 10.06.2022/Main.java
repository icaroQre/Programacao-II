//1) Crie uma classe chamada Ponto, com campos x e y, que representam uma
//coordenada no plano cartesiano. Os campos devem ser privados com métodos get()
//e set() para cada um. Crie um construtor parametrizado e um construtor vazio.

//2) Crie uma classe chamada Robo, que simula um robô. A classe deve ter um
//campo, do tipo String, com o nome do robô e um campo do tipo Ponto, que
//representa a posição do Robo no plano cartesiano. A classe deve ter
//a) um construtor parametrizado que recebe o nome do robô e um Ponto
//b) um construtor vazio
//Um robô pode andar para direita (x é incrementado), andar para esquerda (x
//é decrementado), andar para baixo (y é decrementado) e andar para cima (y
//é incrementado). Um robô pode, também, se teletransportar para uma
//coordenada específica. Um robô também deve saber informar sua posição
//(um método que retorna a coordenada em que está).
//3) Crie um vetor com o tamanho de sua preferência. Instancie alguns objetos do
//tipo Robo e armazene nas posições do vetor. Depois, utilizando uma estrutura
//de repetição, mostre todos os robôs, nome e posição.

public class Main{
        public static void main(String[] args) {

            Robo vetorRobo[] = new Robo[3];
            Ponto ponto;

            Robo robo0 = new Robo("Severino", ponto = new Ponto());
            Robo robo1 = new Robo("02-TW", ponto = new Ponto(5,6));
            Robo robo2 = new Robo("Carlos Salgado", ponto = new Ponto(8,8));

            vetorRobo[0] = robo0;
            vetorRobo[1] = robo1;
            vetorRobo[2] = robo2;

            robo0.andarDrireita();
            robo0.andarCima();
            robo0.andarCima();
            robo0.andarDrireita();

            robo0.teleportar(-5, -5);

        
            for(int i=0; i<3; i++){
                System.out.println(vetorRobo[i].position());
            }
    }
}
