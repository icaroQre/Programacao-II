public class Robo {

    String nomeRobo;
    int x;
    int y;
    int x2;
    int y2;

    public Robo (String nomeRobo, int x, int y, int x2, int y2){

        this.nomeRobo = nomeRobo;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;

    }

    public void andarDireita (){
        x++;
    }

    public void andarEsquerda (){
        x--;
    }

    public void andarFrente (){
        y++;
    }

    public void andarTras (){
        y--;
    }
    
    public void teleporte (){
        x = x2;
        y = y2;
    }

    public String mostrarLocal (){

        String local = null;

        local = "Roberto está em X: " + x + " e Y: " + y;

        return local;
    }
}
