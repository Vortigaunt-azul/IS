/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION;



import DATABASE.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
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
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 701));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Contraseña", "Rol", "email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Usuarios");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Rol");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(0, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 102, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"usuario","administrador", "medico", "desarrollador",}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/pdf.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña)
                            .addComponent(txtUsuario)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtemail))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/usuarios .png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed



    String role = seleccionComboBox;
    String username = txtUsuario.getText();
    String password = txtContraseña.getText();
    String email = txtemail.getText();

    // Validar campos vacíos
    if (role.isEmpty() || username.isEmpty() || password.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Sale del método sin guardar el registro
    }

    // Verificación de existencia y posterior inserción
    try {
        Connection con = Conexion.getConexion();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Sale del método sin guardar el registro
        }

        PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE username = ?");
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "El registro ya existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return; // Sale del método sin guardar el registro
        }

        PreparedStatement insertPs = con.prepareStatement("INSERT INTO login(username, password, role, email) VALUES (?, ?, ?, ?)");
        insertPs.setString(1, username);
        insertPs.setString(2, password);
        insertPs.setString(3, role);
        insertPs.setString(4, email);

        insertPs.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Guardado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarTabla();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }

// codigo base de boton guardar 


//         // int id = Integer.parseInt(txtId.getText());
//         
//         String role = seleccionComboBox;
//
//       String username = txtUsuario.getText();
//       String password = txtContraseña.getText();
//       String email = txtemail.getText();
//      // String role = txtRol.getText(); 
//     
//        
//        
//       
//       try{
//           
//            Connection con = Conexion.getConexion();
//           PreparedStatement ps = con.prepareStatement("INSERT INTO login(username,password,role,email) VALUES (?,?,?,?)");
//           
//          
//                  
//           ps.setString(1,username);
//            ps.setString(2,password);
//             ps.setString(3,role);
//               ps.setString(4,email);
//    
//           
//              ps.executeUpdate();
//              
//              JOptionPane.showMessageDialog(null,"Registro Guardado");
//              limpiar();
//              cargarTabla();
//              
//       }catch(SQLException e){
//           JOptionPane.showMessageDialog(null,e.toString());
//       }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    


        
      
    String role = seleccionComboBox;
    String username = txtUsuario.getText();
    String password = txtContraseña.getText();
    String email = txtemail.getText();
    int id = getIdDelRegistroQueDeseasActualizar(); // Obtén el valor correcto de id

    try {
        Connection con = Conexion.getConexion();
        // Consulta para verificar si ya existe un registro con el mismo nombre de usuario o correo electrónico
        PreparedStatement checkStmt = con.prepareStatement("SELECT * FROM login WHERE (username=? OR email=?) AND id <> ?");
        checkStmt.setString(1, username);
        checkStmt.setString(2, email);
        checkStmt.setInt(3, id);
        ResultSet rs = checkStmt.executeQuery();

        if (rs.next()) {
            // Si se encuentra un registro con el mismo nombre de usuario o correo electrónico, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo nombre de usuario o correo electrónico");
        } else {
            // Si no se encuentra ningún registro duplicado, procede a modificar el registro existente
            PreparedStatement ps = con.prepareStatement("UPDATE login SET username=?, password=?, role=?, email=? WHERE id=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, role);
            ps.setString(4, email);
            ps.setInt(5, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Modificado");
            limpiar();
            cargarTabla();
        }

        rs.close();
        checkStmt.close();
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }

 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

//        String role = seleccionComboBox;
//
//         String username = txtUsuario.getText();
//       String password = txtContraseña.getText();
//       String email = txtemail.getText();
//       
//      // String role = txtRol.getText(); 
//       int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
//        
//       
//       try{
//           
//            Connection con = Conexion.getConexion();
//           PreparedStatement ps = con.prepareStatement("UPDATE login SET username=?,password=?,role=?,email=? WHERE id=? ");
//           
//          
//           ps.setString(1,username);
//            ps.setString(2,password);
//             ps.setString(3,role);        
//               ps.setString(4,email);
//                 ps.setInt(5,id);
//           
//              ps.executeUpdate();
//              
//              
//              JOptionPane.showMessageDialog(null,"Registro Modeficado");
//              limpiar();
//              cargarTabla();
//              
//       }catch(SQLException e){
//           JOptionPane.showMessageDialog(null,e.toString());
//       }
//        
//        
        
        
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
       
   
         try {
        int fila = tblUsuarios.getSelectedRow();
        int id = Integer.parseInt(tblUsuarios.getValueAt(fila, 0).toString());
        PreparedStatement ps;
        ResultSet rs;
        
        Connection con = Conexion.getConexion();
        
        ps = con.prepareStatement("SELECT username, password, role, email FROM login WHERE id = ?");
        ps.setInt(1, id);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            txtUsuario.setText(rs.getString("username"));
            txtContraseña.setText(rs.getString("password"));
            txtemail.setText(rs.getString("email"));
            
            String role = rs.getString("role");
            jComboBox1.setSelectedItem(role); // Seleccionar el elemento correspondiente en el JComboBox
        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
        
      
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private String seleccionComboBox;

    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

         seleccionComboBox = (String)jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generarPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUsuariosMouseEntered

    
    private void generarPDF() {
    try {
        // Creamos un documento y lo abrimos
        Document document = new Document();
        
        // Pedimos al usuario la ubicación para guardar el archivo
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(this);
        
        // Si el usuario selecciona una ubicación, guardamos el archivo allí
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            PdfWriter.getInstance(document, new FileOutputStream(archivo+".pdf"));
            document.open();
            
            // Creamos la tabla y le agregamos las columnas
            PdfPTable table = new PdfPTable(4);
            table.addCell("ID");
            table.addCell("Nombre de Usuario");
            table.addCell("Contraseña");
            table.addCell("Rol");

            // Cargamos los datos desde la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblUsuarios.getModel();
            int filas = modeloTabla.getRowCount();
            int columnas = modeloTabla.getColumnCount();

            for(int i = 0; i < filas; i++){
                for(int j = 0; j < columnas; j++){
                    table.addCell(modeloTabla.getValueAt(i, j).toString());
                }
            }

            // Agregamos la tabla al documento y cerramos el documento
            document.add(table);
            document.close();

            JOptionPane.showMessageDialog(null, "PDF generado exitosamente");
        }
        
    } catch (DocumentException | FileNotFoundException ex) {
        Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
    }
}

    
    
        private void limpiar(){
        txtUsuario.setText("");
        txtContraseña.setText("");
       // txtRol.setText("");
        txtemail.setText("");
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
       
       int[] anchos = {5,20,30,40,70};
       
       for(int i= 0; i < tblUsuarios.getColumnCount(); i++){
           
           tblUsuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       
       
       try{
           
            Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT id,username,password,role,email FROM login");
           
          
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
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
