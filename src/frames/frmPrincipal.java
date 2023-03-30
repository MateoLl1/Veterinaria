/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import clases.conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    
    public static String nombreUsuario="";
    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo, "src/imagenes/medicina.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src/imagenes/abstracto.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSobra1, "src/imagenes/f.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSobra2, "src/imagenes/f.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSobra3, "src/imagenes/f.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblSobra4, "src/imagenes/f.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblfon2, "src/imagenes/cuadrado.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblfon3, "src/imagenes/cuadrado.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblfon4, "src/imagenes/cuadrado.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblfon5, "src/imagenes/cuadrado.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImgEs1, "src/imagenes/hosp.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImgEs2, "src/imagenes/consu.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImgEs3, "src/imagenes/vacu.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImgEs4, "src/imagenes/cirugia.jpg");
        frmRegistro obj1 = new frmRegistro();
        btnAdmin.setVisible(false);
        lblCita.setVisible(false);
        if (frmInicioSeccion.admin==1) {
                btnAdmin.setVisible(true);
            }
        if (frmRegistro.nombre.equals("") && frmInicioSeccion.nombreBs.equals("")) {
            lblImgUsuario.setVisible(false);
            lblNombre.setVisible(false);
        } else if (!frmRegistro.nombre.equals("")) {
            lblImgUsuario.setVisible(true);
            lblNombre.setVisible(true);
            nombreUsuario = frmRegistro.nombre;
            conexion.TuCita(nombreUsuario);
            if (conexion.activar==1) {
                lblCita.setVisible(true);
                lblCita.setText(conexion.fecha);
                JOptionPane.showMessageDialog(null,"Se te asigno una cita");
            }else{
                lblCita.setVisible(false);
            }
            if (frmRegistro.avatar == 1) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/calvo.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/facha.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 3) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/jefa.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 4) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/kevin.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 5) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/lentes.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 6) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/mujer.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 7) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/negra.png");
                lblNombre.setText(frmRegistro.nombre);
            }
            if (frmRegistro.avatar == 8) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/rubia.png");
                lblNombre.setText(frmRegistro.nombre);

            }
        } else if (!frmInicioSeccion.nombreBs.equals("")) {
            
            lblImgUsuario.setVisible(true);
            lblNombre.setVisible(true);
            nombreUsuario = frmInicioSeccion.nombreBs;
            conexion.TuCita(nombreUsuario);
            if (conexion.activar==1) {
                lblCita.setVisible(true);
                lblCita.setText(conexion.fecha);
                JOptionPane.showMessageDialog(null,"Se te asigno una cita");
            }else{
                lblCita.setVisible(false);
            }
            if (frmInicioSeccion.avatarBs == 1) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/calvo.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/facha.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 3) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/jefa.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 4) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/kevin.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 5) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/lentes.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 6) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/mujer.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 7) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/negra.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }
            if (frmInicioSeccion.avatarBs == 8) {
                rsscalelabel.RSScaleLabel.setScaleLabel(lblImgUsuario, "src/avatar/rubia.png");
                lblNombre.setText(frmInicioSeccion.nombreBs);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btrInicio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblImgUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Copyright = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblImgEs1 = new javax.swing.JLabel();
        lblImgEs2 = new javax.swing.JLabel();
        lblImgEs3 = new javax.swing.JLabel();
        lblImgEs4 = new javax.swing.JLabel();
        lblTHos = new javax.swing.JLabel();
        lblTHos1 = new javax.swing.JLabel();
        lblTHos2 = new javax.swing.JLabel();
        lblTHos3 = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        lblText4 = new javax.swing.JLabel();
        lblfon2 = new javax.swing.JLabel();
        lblfon3 = new javax.swing.JLabel();
        lblfon4 = new javax.swing.JLabel();
        lblfon5 = new javax.swing.JLabel();
        lblSobra1 = new javax.swing.JLabel();
        lblSobra2 = new javax.swing.JLabel();
        lblSobra3 = new javax.swing.JLabel();
        lblSobra4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("CLINICA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("VETERINARIA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("LUCAS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btrInicio.setBackground(new java.awt.Color(0, 153, 153));
        btrInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btrInicio.setForeground(new java.awt.Color(255, 255, 255));
        btrInicio.setText("Iniciar sección");
        btrInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btrInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 120, 50));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sobre nosotros");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 130, 50));

        jButton2.setBackground(new java.awt.Color(153, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reservar cita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 110, 50));
        jPanel2.add(lblImgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 60, 60));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 70, 20));

        btnAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 120));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        Copyright.setForeground(new java.awt.Color(255, 255, 255));
        Copyright.setText("Copyright © 2022 CLINICA VETERINARIA LUCAS | DESIGNED BY MATEO LLERENA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(Copyright, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 166, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Copyright))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 830, 40));
        jPanel1.add(lblImgEs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 70));
        jPanel1.add(lblImgEs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 140, 70));
        jPanel1.add(lblImgEs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 150, 70));
        jPanel1.add(lblImgEs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 150, 70));

        lblTHos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTHos.setForeground(new java.awt.Color(255, 255, 255));
        lblTHos.setText("Hospitalización");
        jPanel1.add(lblTHos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, -1));

        lblTHos1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTHos1.setForeground(new java.awt.Color(255, 255, 255));
        lblTHos1.setText("Consulta medica");
        jPanel1.add(lblTHos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 20));

        lblTHos2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTHos2.setForeground(new java.awt.Color(255, 255, 255));
        lblTHos2.setText("Cirugías");
        jPanel1.add(lblTHos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 100, -1));

        lblTHos3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTHos3.setForeground(new java.awt.Color(255, 255, 255));
        lblTHos3.setText("Vacunación");
        jPanel1.add(lblTHos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 120, -1));

        lblText1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setText("<html>Es el conjunto de<br>servicios destinados al<br>ingreso de pacientes<br>para su diagnóstico,<br>recupración y/o<br>tratamiento.<html>");
        jPanel1.add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 110));

        lblText2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setText("<html>Contamos con excelentes<br>especialistas con<br>herramientas y equipos<br>de última generación.<html>");
        jPanel1.add(lblText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, 100));

        lblText3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblText3.setForeground(new java.awt.Color(255, 255, 255));
        lblText3.setText("<html>Las vacunas en los<br>animales tienen tanta<br> importancia como en los<br>humanos y esuna de<br>nuestras<br>responsabilidades como<br>sus dueños.<html>");
        jPanel1.add(lblText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, 110));

        lblText4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblText4.setForeground(new java.awt.Color(255, 255, 255));
        lblText4.setText("<html>Nuestro equipo de <br>especialistas destaca por<br>su capacidad profesional lo<br> que nos permite situarnos<br>al filo de la vanguardia.<html>");
        jPanel1.add(lblText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 110));
        jPanel1.add(lblfon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 280));
        jPanel1.add(lblfon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 280));
        jPanel1.add(lblfon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 170, 280));
        jPanel1.add(lblfon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 170, 280));
        jPanel1.add(lblSobra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 230, 350));
        jPanel1.add(lblSobra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 330));
        jPanel1.add(lblSobra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 220, 350));
        jPanel1.add(lblSobra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 230, 350));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Especialidades");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 190, -1));
        jPanel1.add(lblCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btrInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrInicioActionPerformed
        frmInicioSeccion obj1 = new frmInicioSeccion();
        obj1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btrInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (frmCita.InicioSeccio == 1) {
            frmCita obj1 = new frmCita();
            obj1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Primero Inicie Seccion");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        frmAdmin obj1 = new frmAdmin();
        obj1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAdminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Copyright;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btrInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCita;
    private javax.swing.JLabel lblImgEs1;
    private javax.swing.JLabel lblImgEs2;
    private javax.swing.JLabel lblImgEs3;
    private javax.swing.JLabel lblImgEs4;
    private javax.swing.JLabel lblImgUsuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSobra1;
    private javax.swing.JLabel lblSobra2;
    private javax.swing.JLabel lblSobra3;
    private javax.swing.JLabel lblSobra4;
    private javax.swing.JLabel lblTHos;
    private javax.swing.JLabel lblTHos1;
    private javax.swing.JLabel lblTHos2;
    private javax.swing.JLabel lblTHos3;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblText4;
    private javax.swing.JLabel lblfon2;
    private javax.swing.JLabel lblfon3;
    private javax.swing.JLabel lblfon4;
    private javax.swing.JLabel lblfon5;
    // End of variables declaration//GEN-END:variables
}
