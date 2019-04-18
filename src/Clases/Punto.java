package Clases;

public class Punto {
    private int x,y;
    
    public Punto(){
        this.x=0;
        this.y=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public  String Coordenadas(){
        return "("+this.x+","+this.y+")";
    }
    
    
}
