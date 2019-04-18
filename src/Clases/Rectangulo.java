package Clases;
import static EntornoVisual.Principal.labelArea;
import static EntornoVisual.Principal.labelCoordenadas;
import static EntornoVisual.Principal.labelPerimetro;
import java.awt.Graphics;
import java.awt.Color;

public class Rectangulo extends Punto implements calculos {
    private int base;
    private int altura;
     public Rectangulo()
     { 
         super();
         this.base=0;
         this.altura=0;
     }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
     public int area(){
         return this.getBase()*this.getAltura();
     }
    @Override
     public int perimetro(){
         return ((2*this.getBase())+(2*this.getAltura()));
     }
     public void DibujarRectangulo(Graphics r)
     {
        r.setColor(Color.red);
        labelArea.setText(""+this.area());
        labelPerimetro.setText(""+this.perimetro());
        labelCoordenadas.setText(this.Coordenadas());
        r.drawLine(this.getX(), this.getY(), this.getX()+this.getBase(), this.getY()); //linea del p1 al p2
        r.drawLine(this.getX()+this.getBase(),this.getY(), this.getX()+this.getBase(),this.getY()+this.getAltura()); //linea p2 a p3
        r.drawLine(this.getX()+this.getBase(),this.getY()+this.getAltura(), this.getX(), this.getY()+this.getAltura()); //linea p3 a p4
        r.drawLine(this.getX(), this.getY()+this.getAltura(), this.getX(), this.getY());// linea p4 a la p1
     }
     
    
}
