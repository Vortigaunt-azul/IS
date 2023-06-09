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


public class K_Medico extends javax.swing.JPanel {

    /**
     * Creates new form K_Medico
     */
    public K_Medico() {
        initComponents();
        cargarTabla();
        
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedico = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Especialidad");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtEspecialidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnModificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtEspecialidad)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 490, 590));

        tblMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Especialidad", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 550));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 96, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    //private void initComponents() {
    
     
   // }  // </editor-fold> 
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    String nombre = txtNombre.getText();
    String especialidad = txtEspecialidad.getText();
    String telefono = txtTelefono.getText();

    // Verificar que los campos estén llenos
    if (nombre.isEmpty() || especialidad.isEmpty() || telefono.isEmpty()) {
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

        // Verificar si el número de teléfono ya existe
        if (existeTelefono(telefono, con)) {
            JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                    "<h2 style='color: #FF0000;'>Error</h2>" +
                    "<p style='color: #808080;'>El número de teléfono ya existe en la base de datos.</p>" +
                    "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PreparedStatement ps = con.prepareStatement("INSERT INTO medicos(nombre, especialidad, telefono) VALUES (?, ?, ?)");

        // Asignar los valores a los parámetros
        ps.setString(1, nombre);
        ps.setString(2, especialidad);
        ps.setString(3, telefono);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro guardado correctamente.</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos o realizar otras acciones necesarias
        limpiar();
        cargarTabla();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Ha ocurrido un error al guardar el registro:<br>" + e.toString() + "</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private boolean existeTelefono(String telefono, Connection con) throws SQLException {
    PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM medicos WHERE telefono = ?");
    ps.setString(1, telefono);
    ResultSet rs = ps.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    return count > 0;
}
    
    
    // Verificar si el médico ya existe en la base de datos
private boolean existeMedico(String nombre, String especialidad, String telefono) {
    boolean existe = false;

    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM medicos WHERE nombre = ? AND especialidad = ? AND telefono = ?");
        ps.setString(1, nombre);
        ps.setString(2, especialidad);
        ps.setString(3, telefono);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            existe = count > 0;
        }

        rs.close();
        ps.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return existe;
}
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
 int fila = tblMedico.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Seleccione una fila de la tabla.</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String nombre = txtNombre.getText();
    String especialidad = txtEspecialidad.getText();
    String telefono = txtTelefono.getText();
    int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

    // Verificar que los campos estén llenos
    if (nombre.isEmpty() || especialidad.isEmpty() || telefono.isEmpty()) {
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

        // Verificar si el número de teléfono ya existe
        if (existeTelefono(telefono, con, id)) {
            JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                    "<h2 style='color: #FF0000;'>Error</h2>" +
                    "<p style='color: #808080;'>El número de teléfono ya existe en la base de datos.</p>" +
                    "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PreparedStatement ps = con.prepareStatement("UPDATE medicos SET nombre=?, especialidad=?, telefono=? WHERE id=?");

        // Asignar los valores a los parámetros
        ps.setString(1, nombre);
        ps.setString(2, especialidad);
        ps.setString(3, telefono);
        ps.setInt(4, id);

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

     int fila = tblMedico.getSelectedRow();
    if (fila == -1) {
        //JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Seleccione una fila de la tabla.</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

         int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

try{
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("DELETE FROM medicos WHERE id=? ");
    ps.setInt(1, id);
    ps.executeUpdate();
     JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro eliminado correctamente.</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos o realizar otras acciones necesarias
        limpiar();
        cargarTabla();
} catch(SQLException e){
    JOptionPane.showMessageDialog(null,e.toString());
}


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generarPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicoMouseClicked
        // TODO add your handling code here:
        try{

    int fila = tblMedico.getSelectedRow();
    int id = Integer.parseInt(tblMedico.getValueAt(fila, 0).toString());
    PreparedStatement ps;
    ResultSet rs;

    Connection con = Conexion.getConexion();

    ps = con.prepareStatement("SELECT nombre, especialidad, telefono FROM medicos WHERE id = ?");
    ps.setInt(1, id);
    rs = ps.executeQuery();

    while(rs.next()){
        txtNombre.setText(rs.getString("nombre"));
        txtEspecialidad.setText(rs.getString("especialidad"));
        txtTelefono.setText(rs.getString("telefono"));
    }

} catch(SQLException e){
    JOptionPane.showMessageDialog(null, e.toString());
}

    }//GEN-LAST:event_tblMedicoMouseClicked
private void cargarTabla(){
        
    DefaultTableModel modeloTabla = (DefaultTableModel) tblMedico.getModel();
    modeloTabla.setRowCount(0);

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;

    int[] anchos = {30,50,50,150};

    for(int i= 0; i < tblMedico.getColumnCount(); i++){
        tblMedico.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }

    try{

        Connection con = Conexion.getConexion();

        ps = con.prepareStatement("SELECT id,nombre,especialidad,telefono FROM medicos");

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
private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblMedico.getSelectedRow();
    int id = Integer.parseInt(tblMedico.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
    private void limpiar(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtEspecialidad.setText("");
        
    }
    
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
            table.addCell("Nombre");
            table.addCell("Especialidad");
            table.addCell("Teléfono");

            // Cargamos los datos desde la base de datos
            PreparedStatement ps;
            ResultSet rs;
            ResultSetMetaData rsmd;
            int columnas;

            try {
                Connection con = Conexion.getConexion();
                ps = con.prepareStatement("SELECT id, nombre, especialidad, telefono FROM medicos");
                rs = ps.executeQuery();
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();

                while(rs.next()){
                    // Agregamos las filas a la tabla
                    table.addCell(rs.getObject(1).toString()); // ID
                    table.addCell(rs.getObject(2).toString()); // Nombre
                    table.addCell(rs.getObject(3).toString()); // Especialidad
                    table.addCell(rs.getObject(4).toString()); // Teléfono
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
    PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM medicos WHERE telefono = ? AND id <> ?");
    ps.setString(1, telefono);
    ps.setInt(2, id);
    ResultSet rs = ps.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    return count > 0;
} 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedico;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
