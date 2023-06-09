/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION.Sub;

import DATABASE.Conexion;
import TRANSICION.J_Actividades;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hecto
 */
public class A_agregar_Actividad extends javax.swing.JPanel {

    /**
     * Creates new form A_agregar_Actividad
     */
    public A_agregar_Actividad() {
        initComponents();
             cargarTablaActividades();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuevaActividad = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        NuevaActividad.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel5.setText("Fecha");

        jLabel6.setText("Hora");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Duracion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(147, 147, 147)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(142, 142, 142)
                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(19, 19, 19)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(jButton3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Fecha", "Hora", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Actividad");

        javax.swing.GroupLayout NuevaActividadLayout = new javax.swing.GroupLayout(NuevaActividad);
        NuevaActividad.setLayout(NuevaActividadLayout);
        NuevaActividadLayout.setHorizontalGroup(
            NuevaActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaActividadLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addGap(113, 113, 113)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(170, 170, 170))
            .addGroup(NuevaActividadLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NuevaActividadLayout.setVerticalGroup(
            NuevaActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NuevaActividadLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(NuevaActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NuevaActividadLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(174, 174, 174))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NuevaActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      

    
String nombre = txtNombre.getText();
String descripcion = txtDescripcion.getText();


// Obtener la fecha
Date fecha = txtFecha.getDate();

// Obtener la hora
Time hora = null;
String horaStr = txtHora.getText();

// Validar que la hora sea válida
if (horaStr == null || horaStr.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar una hora.");
    return;
} else {
    try {
        hora = Time.valueOf(horaStr + ":00");
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(this, "Hora inválida. Ingrese una hora en formato hh:mm.");
        return;
    }
}

// Obtener la duración
int duracion = 0;
String duracionStr = txtDuracion.getText();

// Validar que la duración sea un número entero
if (duracionStr == null || duracionStr.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar la duración.");
    return;
} else {
    try {
        duracion = Integer.parseInt(duracionStr);
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Duración inválida. Ingrese un número entero.");
        return;
    }
}

// Validar que todos los campos estén llenos
if (nombre.isEmpty() || descripcion.isEmpty() || fecha == null || duracion == 0) {
    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
    return;
}

// Si llega hasta aquí, es porque todo está bien
// Realizar el proceso de guardado o actualización de la actividad


    try {
        // Establecer conexión con la base de datos
        Connection con = Conexion.getConexion();

        // Preparar la consulta SQL para insertar los datos
        String sql = "INSERT INTO actividades (nombre, descripcion, fecha, hora, duracion) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        // Asignar los valores a los parámetros de la consulta
        ps.setString(1, nombre);
        ps.setString(2, descripcion);
        ps.setDate(3, new java.sql.Date(fecha.getTime())); // Convertir la fecha a un objeto java.sql.Date
        ps.setTime(4, hora);
        ps.setInt(5, duracion);

        // Ejecutar la consulta
        ps.executeUpdate();

        // Mostrar un mensaje de confirmación y limpiar los campos
        JOptionPane.showMessageDialog(null, "Registro guardado");
        limpiar();
          cargarTablaActividades();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked
     

try {
    int fila = tblActividades.getSelectedRow();
    int id = Integer.parseInt(tblActividades.getValueAt(fila, 0).toString());
    
    PreparedStatement ps;
    ResultSet rs;

    Connection con = Conexion.getConexion();

    ps = con.prepareStatement("SELECT nombre, descripcion, fecha, hora, duracion FROM actividades WHERE id = ?");
    ps.setInt(1, id);
    rs = ps.executeQuery();

    while (rs.next()) {
        txtNombre.setText(rs.getString("nombre"));
        txtDescripcion.setText(rs.getString("descripcion"));
        //txtFecha.setText(rs.getString("fecha"));
         txtFecha.setDate(rs.getDate("fecha"));
        // Formatear la hora
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formatoHora.format(rs.getTime("hora"));
        txtHora.setText(horaFormateada);

        txtDuracion.setText(String.valueOf(rs.getInt("duracion")));
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}

    }//GEN-LAST:event_tblActividadesMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        
        String nombre = txtNombre.getText();
String descripcion = txtDescripcion.getText();
//String fecha = txtFecha.getText();

String fecha = dcn.format(txtFecha.getDate()); 

String hora = txtHora.getText();
int duracion = Integer.parseInt(txtDuracion.getText());
int id = getIdDelRegistroQueDeseasActualizar(); // Aquí debes obtener el valor correcto de id

try {
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("UPDATE actividades SET nombre=?, descripcion=?, fecha=?, hora=?, duracion=? WHERE id=?");

    ps.setString(1, nombre);
    ps.setString(2, descripcion);
    ps.setString(3, fecha);
    ps.setString(4, hora);
    ps.setInt(5, duracion);
    ps.setInt(6, id);

    ps.executeUpdate();

    JOptionPane.showMessageDialog(null, "Registro Modificado");
    limpiar();
   cargarTablaActividades();

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     int id = getIdDelRegistroQueDeseasEliminar(); // Aquí debes obtener el valor correcto de id

try {
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("DELETE FROM actividades WHERE id=?");

    ps.setInt(1, id);

    ps.executeUpdate();

    JOptionPane.showMessageDialog(null,"Registro Eliminado");
    
      limpiar();
    cargarTablaActividades();
  
} catch(SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

        private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblActividades.getSelectedRow();
    int id = Integer.parseInt(tblActividades.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
    
        
                    private int getIdDelRegistroQueDeseasEliminar() {
    int filaSeleccionada = tblActividades.getSelectedRow();
    int id = Integer.parseInt(tblActividades.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
    
   
      private void limpiar(){
        txtNombre.setText(""); 
        txtDescripcion.setText("");
        txtFecha.setDate(null);  
        txtHora.setText("");
        txtDescripcion.setText("");
        txtDuracion.setText("");
    }
   
                    
                    
    
private void cargarTablaActividades() {
    DefaultTableModel modeloTabla = (DefaultTableModel) tblActividades.getModel();
    modeloTabla.setRowCount(0);
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    
    int[] anchos = {30, 150, 200, 100, 100, 50};
    
    for (int i = 0; i < tblActividades.getColumnCount(); i++) {
        tblActividades.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }
    
    try {
        Connection con = Conexion.getConexion();
        ps = con.prepareStatement("SELECT id, nombre, descripcion, fecha, hora, duracion FROM actividades");
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


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NuevaActividad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblActividades;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDuracion;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
