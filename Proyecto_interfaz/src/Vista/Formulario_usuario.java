
package Vista;

import Controlador.Controlador;



public class Formulario_usuario extends javax.swing.JFrame {

    private String cositas;
    private String cosas;
    private String cosa;

    
    public Formulario_usuario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();
        Label_nombre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Label_cedula = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        Label_correo = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        Boton_registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Label_titulo.setForeground(new java.awt.Color(255, 51, 51));
        Label_titulo.setText("REGISTRO");
        Label_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        Label_nombre.setText("INGRESE SU NOMBRE PORFAVOR ");

        Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFocusLost(evt);
            }
        });

        Label_cedula.setText("INGRESE SU NUMERO DE CEDULA");

        Cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CedulaFocusLost(evt);
            }
        });

        Label_correo.setText("INGRESE EL CORREO ELECTRONICO");

        Correo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CorreoFocusLost(evt);
            }
        });

        Boton_registrar.setBackground(new java.awt.Color(255, 0, 0));
        Boton_registrar.setText("Registrar");
        Boton_registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(Boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_cedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cedula)
                            .addComponent(Label_correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Correo)
                            .addComponent(Nombre)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(Boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusLost
        this.cositas=Nombre.getText();
        if (this.cositas == null || this.cositas.trim().isEmpty()) {
            jLabel1.setText("Digite el Nombre");
        } else {
            jLabel1.setText("Campo correcto");
        }
    }//GEN-LAST:event_NombreFocusLost

    private void CedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CedulaFocusLost
        this.cosas=Cedula.getText();
        if (this.cosas == null || this.cosas.trim().isEmpty()) {
            jLabel2.setText("Digite la cedula");
        } else {
            jLabel2.setText("Campo correcto");
        }
    }//GEN-LAST:event_CedulaFocusLost

    private void CorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoFocusLost
        this.cosa=Correo.getText();
        if (this.cosa== null || this.cosa.trim().isEmpty()) {
            jLabel3.setText("Digite la cedula");
        } else {
            jLabel3.setText("Campo correcto");
        }
        validar_Campos();
    }//GEN-LAST:event_CorreoFocusLost

    private void Boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_registrarActionPerformed
        String auxnombre = Nombre.getText();
        String auxcedula = Cedula.getText();
        String auxcorreo = Correo.getText();
        Controlador objcontrolador=new Controlador(auxnombre,auxcedula,auxcorreo);
    }//GEN-LAST:event_Boton_registrarActionPerformed

    private void validar_Campos(){
        int validar = 0;
        if (this.cositas == null || this.cositas.trim().isEmpty()) {
            jLabel1.setText("Digite nombre");
            Boton_registrar.setEnabled(false);
        } else {
            jLabel1.setText("Campo correcto");
            validar+=1;
            if(validar==3){
            Boton_registrar.setEnabled(true);
        }
        }
        if (this.cosas == null || this.cosas.trim().isEmpty()) {
            jLabel2.setText("Digite la cedula"); 
            Boton_registrar.setEnabled(false);
        } else {
            jLabel2.setText("Campo correcto");
            validar+=1;
            if(validar==3){
            Boton_registrar.setEnabled(true);
        }
        }  
        
        if (this.cosa == null || this.cosa.trim().isEmpty()) {
            jLabel3.setText("Digite el correo"); 
            Boton_registrar.setEnabled(false);
        } else {
            jLabel3.setText("Campo correcto");
            validar+=1;
            if(validar==3){
            Boton_registrar.setEnabled(true);
        }
        }
        if(validar==3){
            Boton_registrar.setEnabled(true);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_registrar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel Label_cedula;
    private javax.swing.JLabel Label_correo;
    private javax.swing.JLabel Label_nombre;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
