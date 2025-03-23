package Vista;

import Controlador.Controlador;


public class Formulario_registro extends javax.swing.JFrame {
    private String cositas;
    private String cosas;

    public Formulario_registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Label_Titulo = new javax.swing.JLabel();
        Label_Serial = new javax.swing.JLabel();
        Label_Modelo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Campo_serial = new javax.swing.JTextField();
        Campo_Modelo = new javax.swing.JTextField();
        BotonRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        Label_Titulo.setBackground(new java.awt.Color(255, 255, 102));
        Label_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_Titulo.setForeground(new java.awt.Color(255, 51, 51));
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("REGISTRO");
        Label_Titulo.setToolTipText("");

        Label_Serial.setBackground(new java.awt.Color(102, 255, 51));
        Label_Serial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Serial.setText("INGRESE EL SERIAL DEL VEHICULO");
        Label_Serial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Label_Modelo.setText("INGRESE EL MODELO DEL CARRO");

        Campo_serial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Campo_serialFocusLost(evt);
            }
        });

        Campo_Modelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Campo_ModeloFocusLost(evt);
            }
        });

        BotonRegistro.setBackground(new java.awt.Color(255, 0, 0));
        BotonRegistro.setText("registrar");
        BotonRegistro.setEnabled(false);
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Label_Serial, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addComponent(Label_Modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_serialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Campo_serialFocusLost
        this.cositas=Campo_serial.getText();
        if (this.cositas == null || this.cositas.trim().isEmpty()) {
            jLabel1.setText("Digite el serial");
        } else {
            jLabel1.setText("Campo correcto");
        }

    }//GEN-LAST:event_Campo_serialFocusLost

    private void Campo_ModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Campo_ModeloFocusLost
       this.cosas=Campo_Modelo.getText(); 
        if (this.cosas == null || this.cosas.trim().isEmpty() || this.cosas==" ") {
            jLabel2.setText("Digite el modelo");
        } else {
            jLabel2.setText("Campo correcto");
        }
        validar_Campos();

    }//GEN-LAST:event_Campo_ModeloFocusLost

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        System.out.println("Se hizo click rey");
        String auxserial=Campo_serial.getText();
        String auxmodelo=Campo_Modelo.getText();
        Controlador objcontrolador=new Controlador(auxserial,auxmodelo);
        Formulario_usuario objFormulario_usuario=new Formulario_usuario();
        objFormulario_usuario.setVisible(true);
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void validar_Campos(){
        int validar = 0;
        if (this.cositas == null || this.cositas.trim().isEmpty()) {
            jLabel1.setText("Digite el serial");
            BotonRegistro.setEnabled(false);
        } else {
            jLabel1.setText("Campo correcto");
            validar+=1;
            if(validar==2){
            BotonRegistro.setEnabled(true);
        }
        }
        if (this.cosas == null || this.cosas.trim().isEmpty()) {
            jLabel2.setText("Digite el modelo"); 
            BotonRegistro.setEnabled(false);
        } else {
            jLabel2.setText("Campo correcto");
            validar+=1;
            if(validar==2){
            BotonRegistro.setEnabled(true);
        }
        }    
        if(validar==2){
            BotonRegistro.setEnabled(true);
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JTextField Campo_Modelo;
    private javax.swing.JTextField Campo_serial;
    private javax.swing.JLabel Label_Modelo;
    private javax.swing.JLabel Label_Serial;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
