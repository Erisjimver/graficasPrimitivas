package Clases;
import static EntornoVisual.Principal.labelArea;
import static EntornoVisual.Principal.labelCoordenadas;
import static EntornoVisual.Principal.labelPerimetro;
import java.awt.Graphics;
import java.awt.Color;
public class Triangulo extends Punto implements calculos {
    private int baseT;
    private int AlturaT;
 
    public Triangulo()
    {
        super();
        this.baseT=0;
        this.AlturaT=0;
      
    }

    public int getBaseT() {
        return baseT;
    }

    public void setBaseT(int baseT) {
        this.baseT = baseT;
    }

    public int getAlturaT() {
        return AlturaT;
    }

    public void setAlturaT(int AlturaT) {
        this.AlturaT = AlturaT;
    }

    
    @Override
    public int area(){
        
        return ((this.baseT*this.AlturaT)/2);
    }
    @Override
    public int perimetro(){
        return 0;
    }
    
    public void DibujarTriangulo(Graphics T){
        T.setColor(Color.ORANGE);
        labelArea.setText(""+this.area());
        labelPerimetro.setText(""+this.perimetro());
        labelCoordenadas.setText(this.Coordenadas());
        T.drawLine(this.getX(), this.getY(), this.getX(), this.getY()+this.getAlturaT()); // linea p1 a p2
        T.drawLine(this.getX(), this.getY()+this.getAlturaT(), this.getX()+this.getBaseT(), this.getY()+this.getAlturaT());//linea p2 a p3
       T.drawLine(this.getX()+this.getBaseT(),this.getY()+this.getAlturaT(),this.getX(),this.getY()); //linea p3 a p1
        
    }
    
}
