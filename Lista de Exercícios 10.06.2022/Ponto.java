
public class Ponto {

    private int x;
    private int y;

    Ponto(){
        x=0;
        y=0;
    }

    Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

}
