package Clases;
import static EntornoVisual.Principal.labelArea;
import static EntornoVisual.Principal.labelCoordenadas;
import static EntornoVisual.Principal.labelPerimetro;
import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Punto implements calculos{
   
    private int radio;
    public Circulo(){
        this.radio=0;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    
    public int area()
    {
      return (int) (Math.PI*(this.getRadio() * this.getRadio()));
        
    }
    @Override
    public int perimetro()
    {
        return (int) (2*Math.PI*(this.getRadio()));
    }
    
    public void DibujarCirculo(Graphics cir)
    {
        cir.setColor(Color.black);
        cir.drawString("Bienvenidos a dibujando con java: ",10, 10);
        labelArea.setText(""+this.area());
        labelPerimetro.setText(""+this.perimetro());
        labelCoordenadas.setText(this.Coordenadas()); 
        cir.drawOval(this.getX(), this.getY(), this.getRadio(),this.getRadio());
    } 
    
    
    
    
}
