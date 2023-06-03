/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TRANSICION;

import DATABASE.Conexion;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class I_Recidentes extends javax.swing.JPanel {

    /**
     * Creates new form I_Recidentes
     */
    public I_Recidentes() {
        initComponents();
        
        //prueba de esta onda
         cargarTabla();
         cargarTabla_dos ();
    }
    
    
  /////////------------------------------------------------------------
    
    // posible uso de scrop para panel 
    
//public I_Recidentes() {
//    initComponents();
//
//    // Crear el JScrollPane
//    JScrollPane scrollPane = new JScrollPane(bg);
//    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//    scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//
//    // Agregar el panel contenedor al JScrollPane
//    scrollPane.setViewportView(bg);
//
//    // Agregar el JScrollPane al panel principal
//    setLayout(new BorderLayout());
//    add(scrollPane, BorderLayout.CENTER);
//
//    cargarTabla();
//    cargarTabla_dos();
//}

    
    /////////------------------------------------------------------------
    


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResidentes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtFecha_de_nacimiento = new com.toedter.calendar.JDateChooser();
        txtHabitacion = new javax.swing.JTextField();
        txtFecha_de_ingreso = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitaciones = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMaximumSize(new java.awt.Dimension(1790, 925));
        bg.setMinimumSize(new java.awt.Dimension(1790, 925));
        bg.setPreferredSize(new java.awt.Dimension(1790, 925));

        tblResidentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha de nacimiento", "Genero", "Fecha de ingreso", "Habitacion", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResidentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResidentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblResidentes);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Recidentes");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Habitaciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre");

        jLabel2.setText("Fecha de nacimiento");

        jLabel3.setText("Genero");

        jLabel4.setText("Fecha de ingreso");

        jLabel5.setText("Habitacion");

        jLabel6.setText("Descripcion de actividad");

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

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha_de_ingreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtFecha_de_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha_de_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha_de_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/recidente 1 lo.png"))); // NOI18N

        tblHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHabitaciones);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
        
        
 SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");

    String nombre = txtNombre.getText();
    String genero = txtGenero.getText();
    String habitacion = txtHabitacion.getText();
    String descripcion = txtDescripcion.getText();
    String fecha_nacimiento = dcn.format(txtFecha_de_nacimiento.getDate());       
    String fecha_ingreso = dcn.format(txtFecha_de_ingreso.getDate());
    
         // Verificar que los campos estén llenos
        if (nombre.isEmpty() || genero.isEmpty() || habitacion.isEmpty() || descripcion.isEmpty() || fecha_nacimiento.isEmpty() || fecha_ingreso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
            "<h2 style='color: #FF0000;'>Error</h2>" +
            "<p style='color: #808080;'>Por favor, complete todos los campos.</p>" +
            "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            // Verificar si el médico ya existe
            if (existeResidente(nombre, genero, habitacion, descripcion, fecha_nacimiento, fecha_ingreso)) {
             JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
            "<h2 style='color: #FF0000;'>Error</h2>" +
            "<p style='color: #808080;'>El Residente ya existe en la base de datos.</p>" +
            "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

    
    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement("SELECT capacidad FROM habitaciones WHERE id = ?");
        ps.setString(1, habitacion);
        ResultSet rs = ps.executeQuery();
        int capacidadTotal = 0;
        if (rs.next()) {
            capacidadTotal = rs.getInt("capacidad");
        }

        // Obtener el número de residentes en la habitación seleccionada
        ps = con.prepareStatement("SELECT COUNT(*) AS num_residentes FROM residentes WHERE habitacion = ?");
        ps.setString(1, habitacion);
        rs = ps.executeQuery();
        int numResidentes = 0;
        if (rs.next()) {
            numResidentes = rs.getInt("num_residentes");
        }

        // Comprobar si la capacidad máxima se ha superado
        if (numResidentes < capacidadTotal) {
            // Si la capacidad no se ha superado, continuar con el proceso de guardado
            ps = con.prepareStatement("INSERT INTO residentes(nombre, fecha_nacimiento, genero, fecha_ingreso, habitacion, descri_de_actividad) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, nombre);
            ps.setString(2, fecha_nacimiento);
            ps.setString(3, genero);
            ps.setString(4, fecha_ingreso);
            ps.setString(5, habitacion);
            ps.setString(6, descripcion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro guardado exitosamente</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
            cargarTabla();
            cargarTabla_dos();
        } else {
            
            JOptionPane optionPane = new JOptionPane("La capacidad máxima de las habitaciones se ha superado.", JOptionPane.WARNING_MESSAGE);
JDialog dialog = optionPane.createDialog("Advertencia");
dialog.setAlwaysOnTop(true);
dialog.setVisible(true);
            
            //JOptionPane.showMessageDialog(null, "La capacidad máxima de las habitaciones se ha superado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private boolean existeResidente(String nombre, String genero, String habitacion, String descripcion, String fecha_nacimiento, String fecha_ingreso) {
    boolean existe = false;

    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM residentes WHERE nombre = ? AND genero = ? AND habitacion = ? AND descri_de_actividad = ? AND fecha_nacimiento = ? AND fecha_ingreso = ?");
        ps.setString(1, nombre);
        ps.setString(2, genero);
        ps.setString(3, habitacion);
        ps.setString(4, descripcion);
        ps.setString(5, fecha_nacimiento);
        ps.setString(6, fecha_ingreso);
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

    
    private void tblHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionesMouseClicked
      
   try {
        int fila = tblHabitaciones.getSelectedRow();
        int id = Integer.parseInt(tblHabitaciones.getValueAt(fila, 0).toString()); // Obtener el id de la habitación
        PreparedStatement ps;
        ResultSet rs;

        Connection con = Conexion.getConexion();

        ps = con.prepareStatement("SELECT * FROM habitaciones WHERE id = ?"); // Consultar por el id de la habitación

        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            int capacidad = rs.getInt("capacidad");
            
            // Mostrar el ID de la habitación en el campo de texto
            txtHabitacion.setText(String.valueOf(id));
            
            // Realizar las acciones necesarias con los datos obtenidos
            // Por ejemplo, mostrar la capacidad en otro campo de texto
            // txtCapacidad.setText(String.valueOf(capacidad));
            // ...
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }  
     
        
    }//GEN-LAST:event_tblHabitacionesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
int fila = tblResidentes.getSelectedRow();
if (tblResidentes.getSelectedRow() == -1) {
    //JOptionPane.showMessageDialog(null, "Seleccione un registro para modificar.");
    JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Seleccione un registro para modificar</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}


SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");

String nombre = txtNombre.getText();
String fecha_nacimiento = dcn.format(txtFecha_de_nacimiento.getDate()); 
String genero = txtGenero.getText();
String fecha_ingreso = dcn.format(txtFecha_de_ingreso.getDate());
String habitacion_texto = txtHabitacion.getText();
String descripcion = txtDescripcion.getText();
int id = getIdDelRegistroQueDeseasActualizar();

if (nombre.isEmpty() || fecha_nacimiento.isEmpty() || genero.isEmpty() || fecha_ingreso.isEmpty() || habitacion_texto.isEmpty() || descripcion.isEmpty()) {
    JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Todos los campos son requeridos. Por favor, llena todos los campos antes de continuar</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
  
    return;
}

int habitacion = Integer.parseInt(habitacion_texto);

try {
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) AS num_residentes FROM residentes WHERE habitacion = ?");
    ps.setInt(1, habitacion);
    ResultSet rs = ps.executeQuery();
    int numResidentes = 0;
    int capacidadTotal = 0;
    if (rs.next()) {
        numResidentes = rs.getInt("num_residentes");
        PreparedStatement ps2 = con.prepareStatement("SELECT capacidad FROM habitaciones WHERE id = ?");
        ps2.setInt(1, habitacion);
        ResultSet rs2 = ps2.executeQuery();
        if (rs2.next()) {
            capacidadTotal = rs2.getInt("capacidad");
        }
    }
    if (numResidentes < capacidadTotal) {
        PreparedStatement ps3 = con.prepareStatement("UPDATE residentes SET nombre=?,fecha_nacimiento=?,genero=?,fecha_ingreso=?,habitacion=?,descri_de_actividad=? WHERE id=?");
        ps3.setString(1, nombre);
        ps3.setString(2, fecha_nacimiento);
        ps3.setString(3, genero);
        ps3.setString(4, fecha_ingreso);
        ps3.setInt(5, habitacion);
        ps3.setString(6, descripcion);
        ps3.setInt(7, id);
        ps3.executeUpdate();
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro Modificado</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        cargarTabla_dos();
    } else {     
        JOptionPane optionPane = new JOptionPane("La capacidad máxima de las habitaciones se ha superado.", JOptionPane.WARNING_MESSAGE);
        JDialog dialog = optionPane.createDialog("Advertencia");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);  
    }
} catch(SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int fila = tblResidentes.getSelectedRow();
    if (fila == -1) {
        //JOptionPane.showMessageDialog(null, "Seleccione una fila de la tabla");
        JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Seleccione una fila de la tabla.</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        int id = getIdDelRegistroQueDeseasEliminar(); // Aquí debes obtener el valor correcto de id
        
try {
    Connection con = Conexion.getConexion();
    PreparedStatement ps = con.prepareStatement("DELETE FROM residentes WHERE id=?");

    ps.setInt(1, id);

    ps.executeUpdate();

    JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #00FF00;'>Éxito</h2>" +
                "<p style='color: #808080;'>Registro eliminado correctamente</p>" +
                "</body></html>", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    limpiar();
    cargarTabla();
    cargarTabla_dos ();

} catch(SQLException e) {
   // JOptionPane.showMessageDialog(null, e.toString());
    JOptionPane.showMessageDialog(null, "<html><body style='width: 250px; text-align: center;'>" +
                "<h2 style='color: #FF0000;'>Error</h2>" +
                "<p style='color: #808080;'>Ha ocurrido un error al borrar el registro:<br>" + e.toString() + "</p>" +
                "</body></html>", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblResidentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResidentesMouseClicked
     
        
       try {
           
    int fila = tblResidentes.getSelectedRow();
    int id = Integer.parseInt(tblResidentes.getValueAt(fila, 0).toString());
    
    
    
    
    PreparedStatement ps;
    ResultSet rs;

    Connection con = Conexion.getConexion();

    ps = con.prepareStatement("SELECT nombre, fecha_nacimiento, genero, fecha_ingreso, habitacion, descri_de_actividad FROM residentes WHERE id = ?");
    ps.setInt(1, id);
    rs = ps.executeQuery();

    while (rs.next()) {
        txtNombre.setText(rs.getString("nombre"));
        txtFecha_de_nacimiento.setDate(rs.getDate("fecha_nacimiento"));
        txtGenero.setText(rs.getString("genero"));
        txtFecha_de_ingreso.setDate(rs.getDate("fecha_ingreso"));
        txtHabitacion.setText(String.valueOf(rs.getInt("habitacion")));
        txtDescripcion.setText(rs.getString("descri_de_actividad"));
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}
 
       
        
    }//GEN-LAST:event_tblResidentesMouseClicked

    
    // tblRecidentes   
    
            
            private int getIdDelRegistroQueDeseasEliminar() {
    int filaSeleccionada = tblResidentes.getSelectedRow();
    int id = Integer.parseInt(tblResidentes.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
        
            private int getIdDelRegistroQueDeseasActualizar() {
    int filaSeleccionada = tblResidentes.getSelectedRow();
    int id = Integer.parseInt(tblResidentes.getValueAt(filaSeleccionada, 0).toString());
    return id;
}
     
    
        private void limpiar(){
        txtNombre.setText(""); 
        txtFecha_de_nacimiento.setDate(null);  
        txtGenero.setText("");
        txtFecha_de_ingreso.setDate(null);  
        txtHabitacion.setText("");     
        txtDescripcion.setText("");
    }
   
    

    
    
    
     private void cargarTabla_dos (){
        
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
            
             ps = con.prepareStatement("SELECT id,nombre,fecha_nacimiento,genero,fecha_ingreso,habitacion,descri_de_actividad FROM residentes");
           
          
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
    
    
    private void cargarTabla() {
        
 
    // Obtener la capacidad total de las habitaciones
    int capacidadTotal = 0;
    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement("SELECT SUM(capacidad) FROM habitaciones");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            capacidadTotal = rs.getInt(1);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }

    // Actualizar la tabla de habitaciones en la interfaz gráfica
    DefaultTableModel modeloTabla = (DefaultTableModel) tblHabitaciones.getModel();
    modeloTabla.setRowCount(0);

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;

    int[] anchos = {50, 50}; // Anchos para las columnas "id" y "capacidad"

    for (int i = 0; i < tblHabitaciones.getColumnCount(); i++) {
        tblHabitaciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }

    try {
        Connection con = Conexion.getConexion();

        ps = con.prepareStatement("SELECT id, capacidad FROM habitaciones"); // Seleccionar solo "id" y "capacidad"

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

        // Obtener el número total de residentes alojados en las habitaciones
        int numResidentes = 0;
        ps = con.prepareStatement("SELECT COUNT(*) FROM residentes");
        rs = ps.executeQuery();
        if (rs.next()) {
            numResidentes = rs.getInt(1);
        }

        // Comprobar si la capacidad máxima se ha superado
        if (numResidentes >= capacidadTotal) {
            JOptionPane.showMessageDialog(null, "La capacidad máxima de las habitaciones se ha superado.");
        } else {
            // Si la capacidad no se ha superado, continuar con el proceso de guardado
            // Código para guardar los datos en la base de datos
            // ...
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }


    
}

    
    
// private void cargarTabla(){
//        
//        DefaultTableModel modeloTabla = (DefaultTableModel) tblHabitaciones.getModel();
//        modeloTabla.setRowCount(0);
//        
//       PreparedStatement ps;
//       ResultSet rs;
//       ResultSetMetaData rsmd;
//       int columnas;
//       
//       int[] anchos = {50,50};
//       
//       for(int i= 0; i < tblHabitaciones.getColumnCount(); i++){
//           
//           tblHabitaciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
//       }
//       
//       
//       
//       try{
//           
//            Connection con = Conexion.getConexion();
//            
//             ps = con.prepareStatement("SELECT id,capacidad FROM habitaciones");
//           
//          
//           rs = ps.executeQuery();
//           rsmd = rs.getMetaData();
//           columnas = rsmd.getColumnCount();
//           
//           while(rs.next()){
//            
//               Object[] fila = new Object[columnas];
//               for(int indice=0; indice<columnas; indice++){
//                   
//                   fila[indice] = rs.getObject(indice + 1);
//               }
//               modeloTabla.addRow(fila);
//           }
//           
//       } catch(SQLException e){
//            JOptionPane.showMessageDialog(null,e.toString());
//           
//       }
//       
//    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHabitaciones;
    private javax.swing.JTable tblResidentes;
    private javax.swing.JTextField txtDescripcion;
    private com.toedter.calendar.JDateChooser txtFecha_de_ingreso;
    private com.toedter.calendar.JDateChooser txtFecha_de_nacimiento;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
