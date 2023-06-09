/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION;

import DATABASE.Conexion;
import TRANSICION.Sub.A_agregar_Actividad;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class J_Actividades extends javax.swing.JPanel {

    /**
     * Creates new form J_Actividades
     */
    public J_Actividades() {
        initComponents();
        
         cargarTablaActividadesNO();
         cargarTabla_dos();
       cargarTabla_residentes_actividades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarMAS = new javax.swing.JPanel();
        JActividades = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResidentes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtResidentes = new javax.swing.JTextField();
        txtActividades = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResidentesActividades = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        agregarMAS.setBackground(new java.awt.Color(0, 204, 255));
        agregarMAS.setForeground(new java.awt.Color(51, 153, 255));

        JActividades.setBackground(new java.awt.Color(255, 255, 255));

        tblResidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Genero", "Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResidentesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblResidentes);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Actividades");

        jButton5.setText("Nueva actividad");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblActividades);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Recidentes");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblResidentesActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Residente", "Actividad"
            }
        ));
        tblResidentesActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResidentesActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResidentesActividades);

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Linpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PDF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Guardar ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JActividadesLayout = new javax.swing.GroupLayout(JActividades);
        JActividades.setLayout(JActividadesLayout);
        JActividadesLayout.setHorizontalGroup(
            JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JActividadesLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)))
                .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JActividadesLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(txtResidentes)
                            .addComponent(txtActividades, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JActividadesLayout.setVerticalGroup(
            JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JActividadesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JActividadesLayout.createSequentialGroup()
                        .addComponent(txtResidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout agregarMASLayout = new javax.swing.GroupLayout(agregarMAS);
        agregarMAS.setLayout(agregarMASLayout);
        agregarMASLayout.setHorizontalGroup(
            agregarMASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JActividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregarMASLayout.setVerticalGroup(
            agregarMASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarMAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarMAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         A_agregar_Actividad p5 = new  A_agregar_Actividad();
        ShowPanel(p5); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   

try {
    int residente_id = Integer.parseInt(txtResidentes.getText());
    int actividad_id = Integer.parseInt(txtActividades.getText());

    int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

    Connection con = Conexion.getConexion();

    // Verificar si el residente ya está asignado a la actividad
    PreparedStatement psVerificar = con.prepareStatement("SELECT * FROM residentes_actividades WHERE residente_id = ? AND actividad_id = ?");
    psVerificar.setInt(1, residente_id);
    psVerificar.setInt(2, actividad_id);
    ResultSet rs = psVerificar.executeQuery();

    if (rs.next()) {
        // El residente ya está asignado a la actividad
        JOptionPane.showMessageDialog(null, "El residente ya está asignado a esta actividad");
    } else {
        // Actualizar los datos en la tabla "residentes_actividades"
        PreparedStatement psActualizar = con.prepareStatement("UPDATE residentes_actividades SET residente_id=?, actividad_id=? WHERE id=?");
        psActualizar.setInt(1, residente_id);
        psActualizar.setInt(2, actividad_id);
        psActualizar.setInt(3, id);

        psActualizar.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Modificado");
        limpiar();
        cargarTabla_residentes_actividades();
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en los campos de Residentes y Actividades.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

try {
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("DELETE FROM residentes_actividades WHERE id=?");

    ps.setInt(1, id);

    ps.executeUpdate();

    JOptionPane.showMessageDialog(null, "Registro Eliminado");
    limpiar();
     cargarTabla_residentes_actividades();

} catch(SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}
 


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limpiar(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 
        
        // Obtener los IDs de residentes y actividades de los text fields
    int residenteId = Integer.parseInt(txtResidentes.getText());
    int actividadId = Integer.parseInt(txtActividades.getText());

    try {
        // Establecer la conexión con la base de datos
        Connection con = Conexion.getConexion();

        // Verificar si el residente ya está asignado a la actividad
        PreparedStatement psVerificar = con.prepareStatement("SELECT * FROM residentes_actividades WHERE residente_id = ? AND actividad_id = ?");
        psVerificar.setInt(1, residenteId);
        psVerificar.setInt(2, actividadId);
        ResultSet rs = psVerificar.executeQuery();

        if (rs.next()) {
            // El residente ya está asignado a la actividad
            JOptionPane.showMessageDialog(null, "El residente ya está asignado a esta actividad");
        } else {
            // Insertar los datos en la tabla "residentes_actividades"
            PreparedStatement psInsertar = con.prepareStatement("INSERT INTO residentes_actividades(residente_id, actividad_id) VALUES (?, ?)");
            psInsertar.setInt(1, residenteId);
            psInsertar.setInt(2, actividadId);
            psInsertar.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }

    cargarTabla_residentes_actividades(); 
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tblResidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResidentesMouseClicked
       
    try {
        int fila = tblResidentes.getSelectedRow();
        int id = Integer.parseInt(tblResidentes.getValueAt(fila, 0).toString());
        
        txtResidentes.setText(String.valueOf(id));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
    }//GEN-LAST:event_tblResidentesMouseClicked

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked
          try {
        int fila = tblActividades.getSelectedRow();
        int id = Integer.parseInt(tblActividades.getValueAt(fila, 0).toString());
        txtActividades.setText(String.valueOf(id));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
    }//GEN-LAST:event_tblActividadesMouseClicked

    private void tblResidentesActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResidentesActividadesMouseClicked
     
      try{
    int fila = tblResidentesActividades.getSelectedRow();
    int id = Integer.parseInt(tblResidentesActividades.getValueAt(fila,0).toString());
    PreparedStatement ps;
    ResultSet rs;
    
    Connection con = Conexion.getConexion();
    ps = con.prepareStatement("SELECT residente_id, actividad_id FROM residentes_actividades WHERE id = ?");
    ps.setInt(1, id);
    rs = ps.executeQuery();
    
    while(rs.next()){
        txtResidentes.setText(String.valueOf(rs.getInt("residente_id")));
        txtActividades.setText(String.valueOf(rs.getInt("actividad_id")));
    }
} catch(SQLException e){
    JOptionPane.showMessageDialog(null,e.toString());
}

        
        
        
    }//GEN-LAST:event_tblResidentesActividadesMouseClicked


            private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblResidentesActividades.getSelectedRow();
    int id = Integer.parseInt(tblResidentesActividades.getValueAt(filaSeleccionada, 0).toString());
    return id;
    
}
    
    
    
    
    private void cargarTabla_residentes_actividades() {
    DefaultTableModel modeloTabla = (DefaultTableModel) tblResidentesActividades.getModel();
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    
    int[] anchos = {30, 80, 80};
    
    for (int i = 0; i < tblResidentesActividades.getColumnCount(); i++) {
        tblResidentesActividades.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }
    
    try {
        Connection con = Conexion.getConexion();
        
        ps = con.prepareStatement("SELECT id, residente_id, actividad_id FROM residentes_actividades");
        
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while (rs.next()) {
            Object[] fila = new Object[columnas];
            for (int indice = 0; indice < columnas; indice++) {
                fila[indice] = rs.getObject(indice + 1);
            }
            modeloTabla.addRow(fila);
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}

         private void limpiar(){
             
        txtResidentes.setText("");
        txtActividades.setText("");   
        
    }
    
    
    
    
    private void cargarTabla_dos(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblResidentes.getModel();
        modeloTabla.setRowCount(0);
        
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       int[] anchos = {30,50,50,50,50,150,150};
       
       for(int i= 0; i < tblResidentes.getColumnCount(); i++){
           
           tblResidentes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       
       
       try{
           
            Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT id, nombre, genero, habitacion FROM residentes");
           
          
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while(rs.next()){
            
               Object[] fila = new Object[columnas];
               for(int indice=0; indice<columnas; indice++){
                   
                   fila[indice] = rs.getObject(indice + 1);
               }
               modeloTabla.addRow(fila);
           }
           
       } catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
           
       }
       
    }

    
    
    
    
private void cargarTablaActividadesNO() {
    DefaultTableModel modeloTabla = (DefaultTableModel) tblActividades.getModel();
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    
    int[] anchos = {50, 150};
    
    for (int i = 0; i < tblActividades.getColumnCount(); i++) {
        tblActividades.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }
    tblActividades.getColumnModel().getColumn(0).setResizable(false);
    
    try {
        Connection con = Conexion.getConexion();
        ps = con.prepareStatement("SELECT id, nombre FROM actividades");
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while (rs.next()) {
            Object[] fila = new Object[columnas];
            fila[0] = rs.getObject(1);
            fila[1] = rs.getObject(2);
            modeloTabla.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}


    
    private void ShowPanel(JPanel p){
 
        p.setSize(1490, 725);
        p.setLocation(0, 0);
        
        JActividades.removeAll();
        JActividades.add(p, BorderLayout.CENTER);
        JActividades.revalidate();
        JActividades.repaint();
        
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JActividades;
    private javax.swing.JPanel agregarMAS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblActividades;
    private javax.swing.JTable tblResidentes;
    private javax.swing.JTable tblResidentesActividades;
    private javax.swing.JTextField txtActividades;
    private javax.swing.JTextField txtResidentes;
    // End of variables declaration//GEN-END:variables
}
