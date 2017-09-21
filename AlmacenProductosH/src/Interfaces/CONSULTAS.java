/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import almacenproductos.CONECTAR;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lauren
 */
public class CONSULTAS extends javax.swing.JFrame {

    /**
     * Creates new form CONSULTAS
     */
    public CONSULTAS() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatos("");
        MostrarEMPRESA();
        MostrarMODELOS();
    }
    CONECTAR cc = new CONECTAR();
    Connection cn = cc.conexion();
    void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("APELLIDO");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("USUARIO");
    modelo.addColumn("EMPRESA");
    modelo.addColumn("PAIS");
    modelo.addColumn("Email");
    modelo.addColumn("TIPO");
    jTableUsuarios.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM RegistroUsuarios";
    }
    else{
        sql="SELECT * FROM RegistroUsuarios WHERE id='"+valor+"'";
    }
 
    String []datos = new String [9];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(8);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(10);
                datos[8]=rs.getString(9);
                //datos[9]=rs.getString(10);
                
                modelo.addRow(datos);
            }
            jTableUsuarios.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Mantenimiento3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    void MostrarEMPRESA (){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTablePedidosRealizadados.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM CelularesRegistrados";
    String []Dato = new String[4];
        try {
            Statement stmt =cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
              Dato[0] = rs.getString(1);
              Dato[1] = rs.getString(2);
              Dato[2] = rs.getString(3);
              Dato[3] = rs.getString(4);
              
              ModeloEMPRES.addRow(Dato);
            }
            jTablePedidosRealizadados.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
    void MostrarMODELOS (){
    DefaultTableModel ModeloCell = new DefaultTableModel();
    ModeloCell.addColumn("Id");
    ModeloCell.addColumn("Modelos");
    ModeloCell.addColumn("Cantidad");
    
    jTableCantidadCelulares.setModel(ModeloCell);
    String sql ="SELECT Id,Modelo,Cantidad FROM CantidadCelulares";
    String []Dato = new String[3];
        try {
            Statement stmt =cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
              Dato[0]  =rs.getString(1);
              Dato[1] = rs.getString(2);
              Dato[2] = rs.getString(3);
              
              ModeloCell.addRow(Dato);
            }
            jTableCantidadCelulares.setModel(ModeloCell);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidosRealizadados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCantidadCelulares = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableUsuarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 920, 190));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 280, 30));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 100, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuarios Registrados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarMenu.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePedidosRealizadados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePedidosRealizadados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 440, 200));

        jTableCantidadCelulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableCantidadCelulares);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, 200));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 200, 30));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 200, 30));

        jButton2.setText("Buscar");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 40));

        jButton3.setText("Buscar");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 40));

        jLabel1.setText("Pedidos Realizados");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 110, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad Celulares y Modelos");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 960, 310));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 960, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
         
        this.setLocation(x-xMouse, y-yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
         xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
     int xMouse;
     int yMouse;
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCantidadCelulares;
    private javax.swing.JTable jTablePedidosRealizadados;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
