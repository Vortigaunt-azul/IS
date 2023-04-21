/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFRAME;

//import com.formdev.flatlaf.FlatLightLaf;
//import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
//import com.mycompany.views.*;

import TRANSICION.A_Inicio2;
import TRANSICION.B_Personal;
import TRANSICION.C_Almacen;
import TRANSICION.D_Usuarios;
import TRANSICION.F_Residentes_menu;
import TRANSICION.G_Medicina_menu;
import TRANSICION.Ñ_Reports;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
//import org.netbeans.lib.awtextra.AbsoluteConstraints;


public class Menu_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Menu_Usuario() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        
        //this.setResizable(false);
           //////ancho  ---  alto
//        setSize(1290, 790);
        
        
              //////ancho  ---  alto
        setSize(1700, 900);
        setLocation(100,90);
    }
    
    private void InitStyles() {
        mensaje.putClientProperty("FlatLaf.style", "font: 14 $light.font");
        mensaje.setForeground(Color.black);
        navText.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        navText.setForeground(Color.white);
        dateText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        dateText.setForeground(Color.white);
        appName.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        appName.setForeground(Color.white);
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent() {
      ShowJPanel(new A_Inicio2());
    }
    
//    public static void ShowJPanel(JPanel p) {
//        
//        
//        p.setSize(1490, 725);
//        p.setLocation(0,0);
//        
//        content.removeAll();
//        content.add(p, BorderLayout.CENTER);
//        content.revalidate();
//        content.repaint();
//    }
//
//    
    //--------------------------------------------------------
    
//            private void ShowJPanel(JPanel p){
//        //////ancho  ---  alto
//        p.setSize(1490, 725);
//        p.setLocation(0, 0);
//        content.removeAll();
//        
//        // Crear el JScrollPane
//        JScrollPane scrollPane = new JScrollPane(p);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//
//        // Agregar el panel contenedor al JScrollPane
//        scrollPane.setViewportView(p);
//
//        // Agregar el JScrollPane al panel principal
//       content.setLayout(new BorderLayout());
//       content.add(scrollPane, BorderLayout.CENTER);
//        
//       content.revalidate();
//        content.repaint();
//    }
//    
    
    
    
    
    
    //----------------------------------------------------   Nuevo panel con scrol
    
    
    
    private void ShowJPanel(JPanel p){
        
    int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    int height = screenWidth == 400 ? 300 : 100;
    
    p.setSize(1490, height);
    p.setLocation(0, 0);
    content.removeAll();
    
    // Crear el JScrollPane
    JScrollPane scrollPane = new JScrollPane(p);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

    // Agregar el panel contenedor al JScrollPane
    scrollPane.setViewportView(p);

    // Agregar el JScrollPane al panel principal
   content.setLayout(new BorderLayout());
   content.add(scrollPane, BorderLayout.CENTER);
    
   content.revalidate();
    content.repaint();
}

    
    
    
    
    
    //---------------------------------------------------
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_1 = new javax.swing.JPanel();
        btn_reports = new javax.swing.JButton();
        btn_2 = new javax.swing.JPanel();
        btn_lends = new javax.swing.JButton();
        btn_3 = new javax.swing.JPanel();
        btn_prin = new javax.swing.JButton();
        btn_4 = new javax.swing.JPanel();
        btn_returns = new javax.swing.JButton();
        btn_5 = new javax.swing.JPanel();
        btn_books = new javax.swing.JButton();
        btn_6 = new javax.swing.JPanel();
        btn_reports2 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 660));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1290, 790));

        menu.setBackground(new java.awt.Color(13, 71, 161));

        appName.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("CuidaMe");

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        btn_1.setBackground(new java.awt.Color(21, 101, 192));
        btn_1.setPreferredSize(new java.awt.Dimension(55, 22));

        btn_reports.setBackground(new java.awt.Color(21, 101, 192));
        btn_reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reports.setForeground(new java.awt.Color(255, 255, 255));
        btn_reports.setText("CERRAR CESION ");
        btn_reports.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_reports.setBorderPainted(false);
        btn_reports.setContentAreaFilled(false);
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.setFocusPainted(false);
        btn_reports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reports.setIconTextGap(13);
        btn_reports.setInheritsPopupMenu(true);
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_2.setBackground(new java.awt.Color(21, 101, 192));
        btn_2.setPreferredSize(new java.awt.Dimension(55, 22));
        btn_2.setLayout(new java.awt.BorderLayout());

        btn_lends.setBackground(new java.awt.Color(21, 101, 192));
        btn_lends.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_lends.setForeground(new java.awt.Color(255, 255, 255));
        btn_lends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/recidente x1.png"))); // NOI18N
        btn_lends.setText("Residentes");
        btn_lends.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_lends.setBorderPainted(false);
        btn_lends.setContentAreaFilled(false);
        btn_lends.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends.setFocusPainted(false);
        btn_lends.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lends.setIconTextGap(13);
        btn_lends.setInheritsPopupMenu(true);
        btn_lends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lendsActionPerformed(evt);
            }
        });
        btn_2.add(btn_lends, java.awt.BorderLayout.CENTER);

        btn_3.setBackground(new java.awt.Color(21, 101, 192));
        btn_3.setPreferredSize(new java.awt.Dimension(55, 22));
        btn_3.setLayout(new java.awt.BorderLayout());

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prin.setForeground(new java.awt.Color(255, 255, 255));
        btn_prin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/home-outline.png"))); // NOI18N
        btn_prin.setText("Principal");
        btn_prin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_prin.setBorderPainted(false);
        btn_prin.setContentAreaFilled(false);
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.setFocusPainted(false);
        btn_prin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prin.setIconTextGap(13);
        btn_prin.setInheritsPopupMenu(true);
        btn_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prinActionPerformed(evt);
            }
        });
        btn_prin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_prinKeyPressed(evt);
            }
        });
        btn_3.add(btn_prin, java.awt.BorderLayout.CENTER);

        btn_4.setBackground(new java.awt.Color(21, 101, 192));
        btn_4.setPreferredSize(new java.awt.Dimension(55, 22));
        btn_4.setLayout(new java.awt.BorderLayout());

        btn_returns.setBackground(new java.awt.Color(21, 101, 192));
        btn_returns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_returns.setForeground(new java.awt.Color(255, 255, 255));
        btn_returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/medicina.png"))); // NOI18N
        btn_returns.setText("Medicina");
        btn_returns.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_returns.setBorderPainted(false);
        btn_returns.setContentAreaFilled(false);
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setFocusPainted(false);
        btn_returns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_returns.setIconTextGap(13);
        btn_returns.setInheritsPopupMenu(true);
        btn_returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnsActionPerformed(evt);
            }
        });
        btn_4.add(btn_returns, java.awt.BorderLayout.CENTER);

        btn_5.setBackground(new java.awt.Color(21, 101, 192));
        btn_5.setPreferredSize(new java.awt.Dimension(55, 22));
        btn_5.setLayout(new java.awt.BorderLayout());

        btn_books.setBackground(new java.awt.Color(21, 101, 192));
        btn_books.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_books.setForeground(new java.awt.Color(255, 255, 255));
        btn_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/almacen .png"))); // NOI18N
        btn_books.setText("Almacen");
        btn_books.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_books.setBorderPainted(false);
        btn_books.setContentAreaFilled(false);
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setFocusPainted(false);
        btn_books.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_books.setIconTextGap(13);
        btn_books.setInheritsPopupMenu(true);
        btn_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booksActionPerformed(evt);
            }
        });
        btn_5.add(btn_books, java.awt.BorderLayout.CENTER);

        btn_6.setBackground(new java.awt.Color(21, 101, 192));
        btn_6.setPreferredSize(new java.awt.Dimension(55, 22));
        btn_6.setLayout(new java.awt.BorderLayout());

        btn_reports2.setBackground(new java.awt.Color(21, 101, 192));
        btn_reports2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reports2.setForeground(new java.awt.Color(255, 255, 255));
        btn_reports2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/file-chart.png"))); // NOI18N
        btn_reports2.setText("Reportes");
        btn_reports2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_reports2.setBorderPainted(false);
        btn_reports2.setContentAreaFilled(false);
        btn_reports2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports2.setFocusPainted(false);
        btn_reports2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reports2.setIconTextGap(13);
        btn_reports2.setInheritsPopupMenu(true);
        btn_reports2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reports2ActionPerformed(evt);
            }
        });
        btn_6.add(btn_reports2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        navText.setText("Administración");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());

        mensaje.setText("\"Un refugio de amor para quienes más lo necesitan.\"");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1197, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(7, 7, 7)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1441, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prinActionPerformed
         ShowJPanel(new A_Inicio2());
    }//GEN-LAST:event_btn_prinActionPerformed

    private void btn_lendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lendsActionPerformed
        
        
        ShowJPanel(new F_Residentes_menu());
    }//GEN-LAST:event_btn_lendsActionPerformed

    private void btn_returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnsActionPerformed
     
          ShowJPanel(new G_Medicina_menu());
    }//GEN-LAST:event_btn_returnsActionPerformed

    private void btn_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booksActionPerformed
    
        
        ShowJPanel(new C_Almacen());
    }//GEN-LAST:event_btn_booksActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
          
         new Login().setVisible(true);
        dispose();   
    }//GEN-LAST:event_btn_reportsActionPerformed

    private void btn_prinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_prinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_prinKeyPressed

    private void btn_reports2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reports2ActionPerformed
         
    
         ShowJPanel(new Ñ_Reports());
    }//GEN-LAST:event_btn_reports2ActionPerformed

   

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    //  FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    public javax.swing.JPanel btn_1;
    public javax.swing.JPanel btn_2;
    public javax.swing.JPanel btn_3;
    public javax.swing.JPanel btn_4;
    public javax.swing.JPanel btn_5;
    public javax.swing.JPanel btn_6;
    private javax.swing.JButton btn_books;
    private javax.swing.JButton btn_lends;
    private javax.swing.JButton btn_prin;
    private javax.swing.JButton btn_reports;
    private javax.swing.JButton btn_reports2;
    private javax.swing.JButton btn_returns;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    // End of variables declaration//GEN-END:variables
}
