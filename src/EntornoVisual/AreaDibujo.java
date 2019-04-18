package EntornoVisual;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Poligono;
import Clases.Rectangulo;
import Clases.Triangulo;
import java.awt.Color;
import java.awt.Graphics;

public class AreaDibujo extends javax.swing.JPanel {

    Cuadrado cu;
    Rectangulo re;
    Triangulo triang;
    Circulo circulo;
    Poligono poli;

    
    public AreaDibujo() {
        initComponents();
        cu=new Cuadrado();
        re=new Rectangulo();
        triang= new Triangulo();
        circulo=new Circulo();
        poli=new Poligono();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void CargarCoordenadasMouse(int x, int y)
    {
        re.setX(x);
        re.setY(y);
        triang.setX(x+100);
        triang.setY(y);
        circulo.setX(x+200);
        circulo.setY(y);
    }
    
    public void CargarLongitud(int longi){
        cu.setLongitud(longi);
    }
    public void CargarBaseyAlturaRect(int base, int altura){
        re.setBase(base);
        re.setAltura(altura);
    }
    public void CargarBaseyAlturaTriang(int base, int altura)
    {
        triang.setBaseT(base);
        triang.setAlturaT(altura);
    }
    public void CargarRadioCirculo(int radio)
    {
        //circulo.setRadio(radio);
        circulo.setRadio(radio);
        
    }  
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        g.setColor(Color.WHITE);
        cu.DibujarCuadrado(g);
        re.DibujarRectangulo(g);
        triang.DibujarTriangulo(g);
        circulo.DibujarCirculo(g);
        poli.DibujarPoligono(g);
    }    
    

    public void Actualizar()
    {
        repaint();
    }
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:    
        cu.setX(evt.getX());
        cu.setY(evt.getY());
        re.setX(evt.getX());
        re.setY(evt.getY());
        triang.setX(evt.getX());
        triang.setY(evt.getY());
        circulo.setX(evt.getX());
        circulo.setY(evt.getY());
        poli.setX(evt.getX());
        poli.setY(evt.getY());     
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
