package EntornoVisual;

public class Principal extends javax.swing.JFrame {

    private int longitud,base,altura,catetoOpuesto,catetoAdyacente,radio;
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.textValor1.setVisible(false);
        this.textValor2.setVisible(false);
        this.indice1.setVisible(false);
        this.indice2.setVisible(false);

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoOpciones = new javax.swing.ButtonGroup();
        PanelAreaDibujo = new javax.swing.JPanel();
        areaDibujo1 = new EntornoVisual.AreaDibujo();
        PanelOpciones = new javax.swing.JPanel();
        rbCircunferencia = new javax.swing.JRadioButton();
        rbTriangulo = new javax.swing.JRadioButton();
        rbRectangulo = new javax.swing.JRadioButton();
        indice1 = new javax.swing.JLabel();
        textValor1 = new javax.swing.JTextField();
        textValor2 = new javax.swing.JTextField();
        indice2 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        labelPerimetro = new javax.swing.JLabel();
        labelCoordenadas = new javax.swing.JLabel();
        PanelBarraEstado = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textX = new javax.swing.JTextField();
        textY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graficas Primitivas");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(915, 585));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAreaDibujo.setBackground(new java.awt.Color(255, 255, 255));
        PanelAreaDibujo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Area de dibujo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        areaDibujo1.setBackground(new java.awt.Color(255, 255, 255));
        areaDibujo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaDibujo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout areaDibujo1Layout = new javax.swing.GroupLayout(areaDibujo1);
        areaDibujo1.setLayout(areaDibujo1Layout);
        areaDibujo1Layout.setHorizontalGroup(
            areaDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        areaDibujo1Layout.setVerticalGroup(
            areaDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelAreaDibujoLayout = new javax.swing.GroupLayout(PanelAreaDibujo);
        PanelAreaDibujo.setLayout(PanelAreaDibujoLayout);
        PanelAreaDibujoLayout.setHorizontalGroup(
            PanelAreaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaDibujo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAreaDibujoLayout.setVerticalGroup(
            PanelAreaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAreaDibujoLayout.createSequentialGroup()
                .addComponent(areaDibujo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelAreaDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 420));

        PanelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoOpciones.add(rbCircunferencia);
        rbCircunferencia.setText("Circunferencia");
        rbCircunferencia.setContentAreaFilled(false);
        rbCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCircunferenciaActionPerformed(evt);
            }
        });
        PanelOpciones.add(rbCircunferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        GrupoOpciones.add(rbTriangulo);
        rbTriangulo.setText("Triangulo");
        rbTriangulo.setContentAreaFilled(false);
        rbTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrianguloActionPerformed(evt);
            }
        });
        PanelOpciones.add(rbTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        GrupoOpciones.add(rbRectangulo);
        rbRectangulo.setText("Rectangulo");
        rbRectangulo.setContentAreaFilled(false);
        rbRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRectanguloActionPerformed(evt);
            }
        });
        PanelOpciones.add(rbRectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        indice1.setText("..................");
        PanelOpciones.add(indice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));
        PanelOpciones.add(textValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 75, -1));
        PanelOpciones.add(textValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 75, -1));

        indice2.setText("..................");
        PanelOpciones.add(indice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        getContentPane().add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 350, 100));

        PanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Area:");

        jLabel2.setText("Perimetro:");

        jLabel3.setText("Coordenadas");

        labelArea.setText(".....................................................................");

        labelPerimetro.setText(".....................................................................");

        labelCoordenadas.setText(".....................................................................");

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labelCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, Short.MAX_VALUE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(labelArea, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelArea))
                .addGap(9, 9, 9)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelPerimetro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCoordenadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 250, 100));

        PanelBarraEstado.setBackground(new java.awt.Color(0, 0, 0));

        labelEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(255, 255, 255));
        labelEstado.setText("..........................................................");

        javax.swing.GroupLayout PanelBarraEstadoLayout = new javax.swing.GroupLayout(PanelBarraEstado);
        PanelBarraEstado.setLayout(PanelBarraEstadoLayout);
        PanelBarraEstadoLayout.setHorizontalGroup(
            PanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBarraEstadoLayout.createSequentialGroup()
                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        PanelBarraEstadoLayout.setVerticalGroup(
            PanelBarraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        getContentPane().add(PanelBarraEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 900, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coordenadas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/GO_LOG_OFF.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("X:");

        jLabel5.setText("Y:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textY))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 260, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void DibujarCircunferencia(){
        try 
        {
            radio=Integer.parseInt(this.textValor1.getText());
            areaDibujo1.CargarRadioCirculo(radio);
            areaDibujo1.Actualizar();           
        } catch (NumberFormatException e) {
            labelEstado.setText("Error: "+e);
        }
    }

    public void DibujarTriangulo(){
        try 
        {
            catetoOpuesto=Integer.parseInt(this.textValor1.getText());
            catetoAdyacente=Integer.parseInt(this.textValor2.getText());
            areaDibujo1.CargarBaseyAlturaTriang(catetoOpuesto, catetoAdyacente);
            areaDibujo1.Actualizar();           
        } catch (NumberFormatException e) {
            labelEstado.setText("Error: "+e);
        }
    }
    
    public void DibujarRectangulo(){
        try 
        {
            base=Integer.parseInt(this.textValor1.getText());
            altura=Integer.parseInt(this.textValor2.getText());
            areaDibujo1.CargarBaseyAlturaRect(base, altura);
            areaDibujo1.Actualizar();           
        } catch (NumberFormatException e) {
            labelEstado.setText("Error: "+e);
        }
    }
       
    public void ErrorValorVacio(){
        if((textValor1.getText().equals(""))||(textValor2.getText().equals(""))){
            labelEstado.setText("Ingrese todos lso valores requeridos porfavor.......");
        }
    }
    
        public void Limpiar(){
            labelEstado.setText("....................................................");
        
    }
    
    private void rbCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCircunferenciaActionPerformed
        // TODO add your handling code here:+
        try {
            this.indice1.setVisible(true);
            this.indice2.setVisible(false);
            this.indice1.setText("Radio:");
            this.textValor1.setVisible(true);
            this.textValor2.setVisible(false);
        } catch (Exception e) {
            labelEstado.setText("Error: "+e);
        }
    }//GEN-LAST:event_rbCircunferenciaActionPerformed

    private void rbTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrianguloActionPerformed
        // TODO add your handling code here:
        try {
            this.indice1.setVisible(true);
            this.indice2.setVisible(true);
            this.indice1.setText("Cateto opuesto:");
            this.indice2.setText("Cateto Adyacente:");
            this.textValor1.setVisible(true);
            this.textValor2.setVisible(true);
        } catch (Exception e) {
            labelEstado.setText("Error: "+e);
        }
    }//GEN-LAST:event_rbTrianguloActionPerformed

    private void rbRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRectanguloActionPerformed
        // TODO add your handling code here:
        try {
            this.indice1.setVisible(true);
            this.indice2.setVisible(true);
            this.indice1.setText("Base:");
            this.indice2.setText("Altura:");
            this.textValor1.setVisible(true);
            this.textValor2.setVisible(true);
        } catch (Exception e) {
            labelEstado.setText("Error: "+e);
        }
    }//GEN-LAST:event_rbRectanguloActionPerformed

    private void areaDibujo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaDibujo1MouseClicked
        // TODO add your handling code here:
        
        try {
            if(rbCircunferencia.isSelected()){
                
                DibujarCircunferencia();

            }
            if(rbTriangulo.isSelected()){
                DibujarTriangulo();
            }
            if(rbRectangulo.isSelected()){
                DibujarRectangulo();
            }
        } catch (Exception e) {
            labelEstado.setText("Error: "+e);
        }
        ErrorValorVacio();
    }//GEN-LAST:event_areaDibujo1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Leyendo coordenadas desde las cajas de texto
        int x= Integer.valueOf(textX.getText());
        int y= Integer.valueOf(textY.getText());
        areaDibujo1.CargarCoordenadasMouse(x, y);

        try {
            if(rbCircunferencia.isSelected()){

                DibujarCircunferencia();
                Limpiar();
            }
            if(rbTriangulo.isSelected()){

                DibujarTriangulo();
                Limpiar();
            }
            if(rbRectangulo.isSelected()){

                DibujarRectangulo();
                Limpiar();
            }
        } catch (Exception e) {
            labelEstado.setText("Error: "+e);
        }
        ErrorValorVacio();
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoOpciones;
    private javax.swing.JPanel PanelAreaDibujo;
    private javax.swing.JPanel PanelBarraEstado;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelOpciones;
    private EntornoVisual.AreaDibujo areaDibujo1;
    private javax.swing.JLabel indice1;
    private javax.swing.JLabel indice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel labelArea;
    public static javax.swing.JLabel labelCoordenadas;
    public static javax.swing.JLabel labelEstado;
    public static javax.swing.JLabel labelPerimetro;
    private javax.swing.JRadioButton rbCircunferencia;
    private javax.swing.JRadioButton rbRectangulo;
    private javax.swing.JRadioButton rbTriangulo;
    private javax.swing.JTextField textValor1;
    private javax.swing.JTextField textValor2;
    private javax.swing.JTextField textX;
    private javax.swing.JTextField textY;
    // End of variables declaration//GEN-END:variables
}
