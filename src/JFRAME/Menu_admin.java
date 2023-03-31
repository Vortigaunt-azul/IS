package JFRAME;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import TRANSICION.A_Inicio;
import TRANSICION.B_Personal;
import TRANSICION.C_Almacen;
import TRANSICION.D_Usuarios;
import TRANSICION.E_Donaciones;
import TRANSICION.F_Residentes_menu;
import TRANSICION.G_Medicina_menu;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;


public class Menu_admin extends javax.swing.JFrame {

    /**
     * Creates new form Menu_admin
     */
    public Menu_admin() {
        initComponents();
        
//       this.setMaximumSize(new Dimension(1200, 700));
//        this.setMinimumSize(new Dimension(1200, 700));
        
        
       
         A_Inicio p0 = new A_Inicio();
        ShowPanel(p0);
        
    // CENTRADO DE VENTANA 
         setTitle("Mi ventana");
        setSize(1187, 687);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
       // CIERRE DE CENTRADO DE VENTANA
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pageBtn1 = new javax.swing.JButton();
        pageBtn2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        secion = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(204, 204, 204));
        bg.setMaximumSize(new java.awt.Dimension(1100, 550));
        bg.setMinimumSize(new java.awt.Dimension(1100, 550));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(51, 153, 255));
        content.setMaximumSize(new java.awt.Dimension(1100, 550));
        content.setMinimumSize(new java.awt.Dimension(1100, 550));
        content.setPreferredSize(new java.awt.Dimension(0, 424));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 1020, 600));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("RESIDENTES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 50));

        jButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton5.setText("MEDICINA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 50));

        pageBtn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pageBtn1.setText("PERSONAL");
        pageBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(pageBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 50));

        pageBtn2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pageBtn2.setText("ALMACEN");
        pageBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageBtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(pageBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, 50));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("DONACIONES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 150, 51));

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("USUARIOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 150, 50));

        secion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        secion.setText("CERRAR CESION ");
        secion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secionActionPerformed(evt);
            }
        });
        jPanel3.add(secion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 150, 50));

        Inicio.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Inicio.setText("INICIO");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel3.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 50));

        jPanel4.setBackground(new java.awt.Color(27, 27, 142));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 200, 50));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 650));

        jPanel2.setBackground(new java.awt.Color(27, 27, 142));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1031, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pageBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageBtn1ActionPerformed
         B_Personal p1 = new B_Personal();
        ShowPanel(p1);
    }//GEN-LAST:event_pageBtn1ActionPerformed

    private void pageBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageBtn2ActionPerformed
      C_Almacen p2 = new C_Almacen();
        ShowPanel(p2);
    }//GEN-LAST:event_pageBtn2ActionPerformed

    private void secionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secionActionPerformed
             
         new Login().setVisible(true);
        dispose();   
    }//GEN-LAST:event_secionActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
      
          A_Inicio p0 = new A_Inicio();
        ShowPanel(p0);
        
        
    }//GEN-LAST:event_InicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        // LLAMADA A VENTANA PARA REGISTAR NUEVAS CUENTAS DE LOGEO
        
        D_Usuarios p3 = new D_Usuarios();
        ShowPanel(p3);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        E_Donaciones p4 = new E_Donaciones();
        ShowPanel(p4);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        F_Residentes_menu p5 = new  F_Residentes_menu();
        ShowPanel(p5); 
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        G_Medicina_menu p5 = new  G_Medicina_menu();
        ShowPanel(p5); 
    }//GEN-LAST:event_jButton5ActionPerformed

    

    private void ShowPanel(JPanel p){
        p.setSize(1100, 597);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    
    
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Menu_admin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inicio;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton pageBtn1;
    private javax.swing.JButton pageBtn2;
    private javax.swing.JButton secion;
    // End of variables declaration//GEN-END:variables
}
