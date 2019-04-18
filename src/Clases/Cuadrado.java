package Clases;
import java.awt.Graphics;
import java.awt.Color;


public class Cuadrado extends Punto implements calculos {
    int longitud;
    public Cuadrado(){
        super();
        this.longitud=0;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public int area(){
        return 2*this.getLongitud();
    }
    @Override
    public int perimetro()
    {
        return 4*this.getLongitud();
    }
    public void DibujarCuadrado(Graphics c){
        c.setColor(Color.BLUE);
        c.drawString("BIENVENIDO A DIBUJANDO CON JAVA", 10, 20);
        c.setColor(Color.MAGENTA);
        c.drawString("Area cuadrado:"+this.area(),10, 30);
        c.drawString("Perimetro cuadrado"+this.perimetro(),10, 40);
        c.drawString("Coordenadas"+this.Coordenadas(), 10, 50);
        c.drawLine(this.getX(), this.getY(), this.getX()+this.getLongitud(), this.getY()); //linea p1 al p2
        c.drawLine(this.getX()+this.getLongitud(),this.getY(), this.getX()+this.getLongitud(), this.getY()+this.getLongitud()); //linea p2 a p3
        c.drawLine(this.getX()+this.getLongitud(), this.getY()+this.getLongitud(),this.getX(), this.getY()+this.getLongitud()); //linea p3 a p4
        c.drawLine(this.getX(), this.getY()+this.getLongitud(), this.getX(), this.getY()); //linea p4 a p1
        
    }
    
}
