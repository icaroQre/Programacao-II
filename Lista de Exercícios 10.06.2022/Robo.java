
public class Robo {

    String nome;
    Ponto ponto;

    Robo(){
        nome ="";
        ponto = new Ponto();
    }

    Robo(String nome, Ponto ponto){
        this.nome = nome;
        this.ponto = ponto;
    }

    public void andarDrireita(){
        ponto.setX(ponto.getX()+1);
        System.out.println(nome + " andou para direita!");
    }
    public void andarEsquerda(){
        ponto.setX(ponto.getX()-1);
        System.out.println(nome + " andou para esquerda!");
    }

    public void andarCima(){
        ponto.setY(ponto.getY()+1);
        System.out.println(nome + " andou para cima!");
    }
    public void andarBaixo(){
        ponto.setY(ponto.getY()-1);
        System.out.println(nome + " andou para baixo!");
    }

    public String position(){
        return nome + " está em X: "+ ponto.getX() + " e Y: " + ponto.getY();
    }

    public void teleportar(int x, int y){
        ponto.setX(x);
        ponto.setY(y);
        System.out.println(nome + " se teleportou para X: " + ponto.getX() + " e Y: " + ponto.getY());
    }

}
