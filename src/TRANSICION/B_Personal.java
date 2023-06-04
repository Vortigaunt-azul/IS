
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
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class B_Personal extends javax.swing.JPanel {

    ButtonGroup btnGr;
    
  
    public B_Personal() {
        initComponents();
           
//      btnGr  = new ButtonGroup();
//      btnGr.add(nombre de elemento);
//      btnGr.add(segundo nombre de elemento);
        cargarTabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1100, 550));
        setMinimumSize(new java.awt.Dimension(1100, 550));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1100, 550));
        bg.setMinimumSize(new java.awt.Dimension(1100, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Personal");

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonal);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(0, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 102, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Linpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
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
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/personal asilo.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/pdf.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
   
        
        

      
    String nombre = txtNombre.getText();
    String telefono = txtTelefono.getText();
    String direccion = txtDireccion.getText();
    String descripcion = txtDescripcion.getText();

    try {
        Connection con = Conexion.getConexion();

        // Verificar si el número de teléfono tiene 8 dígitos
        if (telefono.length() != 8) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe tener exactamente 8 dígitos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Consulta para verificar si ya existe un registro con el mismo número de teléfono
        PreparedStatement consulta = con.prepareStatement("SELECT COUNT(*) FROM personal WHERE telefono = ?");
        consulta.setString(1, telefono);
        ResultSet resultado = consulta.executeQuery();
        resultado.next();
        int registrosExistentes = resultado.getInt(1);

        if (registrosExistentes > 0) {
            // El registro ya existe, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo número de teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // El registro no existe, insertarlo en la base de datos
            PreparedStatement ps = con.prepareStatement("INSERT INTO personal(nombre, telefono, direccion, descri_de_actividad) VALUES (?,?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setString(4, descripcion);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro Guardado");
            limpiar();
            cargarTabla();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El campo de teléfono debe contener solo números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }



        

        
                                              
    
//    String nombre = txtNombre.getText();
//    String telefono = txtTelefono.getText();
//    String direccion = txtDireccion.getText(); 
//    String descripcion = txtDescripcion.getText(); 
//        
//    try {
//     
//        Connection con = Conexion.getConexion();
//        PreparedStatement ps = con.prepareStatement("INSERT INTO personal(nombre, telefono, direccion, descri_de_actividad) VALUES (?,?,?,?)");
//          
//        ps.setString(1, nombre);
//        ps.setString(2, telefono);
//        ps.setString(3, direccion);
//        ps.setString(4, descripcion);
//          
//        ps.executeUpdate();
//        
//        JOptionPane.showMessageDialog(null, "Registro Guardado");
//        limpiar();
//        cargarTabla();
//    } catch (NumberFormatException e) {
//        JOptionPane.showMessageDialog(null, "El campo de teléfono debe contener solo números.", "Advertencia", JOptionPane.WARNING_MESSAGE);
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, e.toString());
//    }
//

      
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonalMouseClicked
        
        
        
        
        try{
            
            int fila = tblPersonal.getSelectedRow();
            int id = Integer.parseInt(tblPersonal.getValueAt(fila,0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            
             Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT nombre,telefono,direccion,descri_de_actividad FROM personal WHERE id = ?");
           
          ps.setInt(1, id);
           rs = ps.executeQuery();
           
           while(rs.next()){
              //txtId.setText(String.valueOf(id));
              txtNombre.setText(rs.getString("nombre"));
              txtTelefono.setText(rs.getString("telefono"));
              txtDireccion.setText(rs.getString("direccion"));
              txtDescripcion.setText(rs.getString("descri_de_actividad"));
              
           }
            
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tblPersonalMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
       String nombre = txtNombre.getText();
    String telefono = txtTelefono.getText();
    String direccion = txtDireccion.getText(); 
    String descripcion = txtDescripcion.getText(); 
    int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
    
    // Verificar que los campos estén llenos
    if (nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Por favor, complete todos los campos.</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Validar el formato y la longitud del teléfono
    if (!telefono.matches("\\d{8}")) {
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>El número de teléfono debe contener exactamente 8 dígitos.</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Connection con = Conexion.getConexion();

        // Verificar si el número de teléfono ya existe, excepto para el registro actual que se está modificando
        if (existeTelefono(telefono, con, id)) {
            JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                    "<h2 style='color: #FF0000;'>Error</h2>" +
                    "<p style='color: #808080;'>El número de teléfono ya existe en la base de datos.</p>" +
                    "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PreparedStatement ps = con.prepareStatement("UPDATE personal SET nombre=?, telefono=?, direccion=?, descri_de_actividad=? WHERE id=?");

        // Asignar los valores a los parámetros
        ps.setString(1, nombre);
        ps.setString(2, telefono);
        ps.setString(3, direccion);
        ps.setString(4, descripcion);
        ps.setInt(5, id);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro modificado correctamente.</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos o realizar otras acciones necesarias
        limpiar();
        cargarTabla();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Ha ocurrido un error al modificar el registro:<br>" + e.toString() + "</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        
                
       // int id = Integer.parseInt(txtId.getText());
        
         // int id = Integer.parseInt(txtId.getText());
//       String nombre = txtNombre.getText();
//       String telefono = txtTelefono.getText();
//       String direccion = txtDireccion.getText(); 
//       String descripcion = txtDescripcion.getText(); 
       int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id
        
       
       try{
           
            Connection con = Conexion.getConexion();
           PreparedStatement ps = con.prepareStatement("DELETE FROM personal WHERE id=? ");
           
          
        
               ps.setInt(1,id);
           
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Registro Eliminado");
              limpiar();
              cargarTabla();
              
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
       }
        
      
        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       generarPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            PdfPTable table = new PdfPTable(5);
            table.addCell("ID");
            table.addCell("Nombre");
            table.addCell("Teléfono");
            table.addCell("Dirección");
            table.addCell("Actividad");

            // Cargamos los datos desde la base de datos
            PreparedStatement ps;
            ResultSet rs;
            ResultSetMetaData rsmd;
            int columnas;

            try {
                Connection con = Conexion.getConexion();
                ps = con.prepareStatement("SELECT id,nombre,telefono,direccion,descri_de_actividad FROM personal");
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();

                while(rs.next()){
                    // Agregamos las filas a la tabla
                    for(int indice=0; indice<columnas; indice++){
                        table.addCell(rs.getObject(indice + 1).toString());
                    }
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.toString());
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

    
    private boolean existeTelefono(String telefono, Connection con, int id) throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM personal WHERE telefono = ? AND id <> ?");
    ps.setString(1, telefono);
    ps.setInt(2, id);
    ResultSet rs = ps.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    return count > 0;
}


    
    
    private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblPersonal.getSelectedRow();
    int id = Integer.parseInt(tblPersonal.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
    
    private void limpiar(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtDescripcion.setText("");
    }
    
    private void cargarTabla(){
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPersonal.getModel();
        modeloTabla.setRowCount(0);
        
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       int[] anchos = {30,50,80,150,150};
       
       for(int i= 0; i < tblPersonal.getColumnCount(); i++){
           
           tblPersonal.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       
       
       try{
           
            Connection con = Conexion.getConexion();
            
             ps = con.prepareStatement("SELECT id,nombre,telefono,direccion,descri_de_actividad FROM personal");
           
          
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
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
