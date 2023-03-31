/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION;



import DATABASE.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class D_Usuarios extends javax.swing.JPanel {

    /**
     * Creates new form D_Usuarios
     */
    public D_Usuarios() {
        initComponents();
        
          cargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtRol = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Contraseña", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 208, 91));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Rol");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtContraseña)
                    .addComponent(txtRol))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnGuardar)
                .addGap(36, 36, 36)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(33, 33, 33)
                .addComponent(btnLimpiar)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 103, -1, 427));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1010, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         // int id = Integer.parseInt(txtId.getText());
         
       String username = txtUsuario.getText();
       String password = txtContraseña.getText();
       String role = txtRol.getText(); 
     
        
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("INSERT INTO login(username,password,role) VALUES (?,?,?)");
           
          
           ps.setString(1,username);
            ps.setString(2,password);
             ps.setString(3,role);
    
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Guardado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     
        
         String username = txtUsuario.getText();
       String password = txtContraseña.getText();
       String role = txtRol.getText(); 
       int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("UPDATE login SET username=?,password=?,role=? WHERE id=? ");
           
          
           ps.setString(1,username);
            ps.setString(2,password);
             ps.setString(3,role);
               ps.setInt(4,id);
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Modeficado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        
        int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("DELETE FROM login WHERE id=? ");
           
          
        
               ps.setInt(1,id);
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Eliminado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
      
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
       
          
        
        try{
            
            int fila = tblUsuarios.getSelectedRow();
            int id = Integer.parseInt(tblUsuarios.getValueAt(fila,0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            
             Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT username,password,role FROM login WHERE id = ?");
           
          ps.setInt(1, id);
           rs = ps.executeQuery();
           
           while(rs.next()){
              //txtId.setText(String.valueOf(id));
              txtUsuario.setText(rs.getString("username"));
              txtContraseña.setText(rs.getString("password"));
              txtRol.setText(rs.getString("role"));
              
              
           }
            
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tblUsuariosMouseClicked

        private void limpiar(){
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtRol.setText("");

    }
        
        
            private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblUsuarios.getSelectedRow();
    int id = Integer.parseInt(tblUsuarios.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
    
    
        private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblUsuarios.getModel();
        modeloTabla.setRowCount(0);
        
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       int[] anchos = {30,50,50,150,150};
       
       for(int i= 0; i < tblUsuarios.getColumnCount(); i++){
           
           tblUsuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       
       
       try{
           
            Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT id,username,password,role FROM login");
           
          
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
