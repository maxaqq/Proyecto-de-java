/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import almacenproductos.CONECTAR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lauren
 */
public class PedidosCelulares extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCelulares
     */
    public PedidosCelulares() {
        initComponents();
        this.setLocationRelativeTo(null);
        id();
         Limpiar();
       
        MostrarMODELOS();
        MostrarEMPRESA();
        
    }
    CONECTAR cc = new CONECTAR();
    Connection cn =cc.conexion();
    void MostrarMODELOS (){
    DefaultTableModel ModeloCell = new DefaultTableModel();
    ModeloCell.addColumn("Id");
    ModeloCell.addColumn("Modelos");
    ModeloCell.addColumn("Cantidad");
    
    jTableModelos.setModel(ModeloCell);
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
            jTableModelos.setModel(ModeloCell);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
    void MostrarEMPRESA (){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTableEmpresas.setModel(ModeloEMPRES);
    String sql ="SELECT Id,Empresa FROM CelularesRegistrados";
    String []Dato = new String[2];
        try {
            Statement stmt =cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
              Dato[0]  =rs.getString(1);
              Dato[1] = rs.getString(2);
              
              ModeloEMPRES.addRow(Dato);
            }
            jTableEmpresas.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
    void Limpiar(){
      jTextModelo.setText("");
      jTextEmpresa.setText("");
      jTextCantidad.setText("");
        id();
    
    }
    public void AgregarRegistroCompleto(){
     if(jTextModelo.getText().equals("") || jTextCantidad.getText().equals("") || jTextEmpresa.getText().equals(""))
         {javax.swing.JOptionPane.showMessageDialog(this,"Complete todos los espacios","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);}
         else{
               int Rpt =JOptionPane.showConfirmDialog(null, "Esta seguro de Registrar el pedido?","Confirmacion",JOptionPane.YES_NO_OPTION);
               if(Rpt == JOptionPane.YES_OPTION){
             
                 try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO CelularesRegistrados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
                        pst.setString(1, jTextId.getText());
                        pst.setString(2, jTextModelo.getText());
                        pst.setString(3, jTextCantidad.getText());
                        pst.setString(4, jTextEmpresa.getText());

                        pst.executeUpdate();
        
                        JOptionPane.showMessageDialog(null, "Se registro Exitosamente!");
                     }   catch (Exception e) {
                        System.out.println("Error al Registrar" + e);
                         }      
                 System.out.println("Se agrego el pedido Exitosamente!");
                 
              }else{System.out.println("Accion cancelada");}
             
             }  
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextEmpresa = new javax.swing.JTextField();
        jTextModelo = new javax.swing.JTextField();
        jTextCantidad = new javax.swing.JTextField();
        jTextId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextId2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelAgregarPedido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        jLabelActualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 39, 39));
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

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ingrese Empresa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 123, 29));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarMenu.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar3.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 20));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Ingrese Modelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 123, 29));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Ingrese cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 123, 29));

        jTextEmpresa.setBackground(new java.awt.Color(51, 51, 51));
        jTextEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jTextEmpresa.setBorder(null);
        jPanel1.add(jTextEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 30));

        jTextModelo.setBackground(new java.awt.Color(51, 51, 51));
        jTextModelo.setForeground(new java.awt.Color(255, 255, 255));
        jTextModelo.setBorder(null);
        jPanel1.add(jTextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        jTextCantidad.setBackground(new java.awt.Color(51, 51, 51));
        jTextCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jTextCantidad.setBorder(null);
        jTextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jTextId.setBackground(new java.awt.Color(5, 10, 10));
        jTextId.setForeground(new java.awt.Color(255, 255, 255));
        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 50, 30));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Id ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 84, 60, 20));

        jTextId2.setEditable(false);
        jTextId2.setBackground(new java.awt.Color(5, 10, 10));
        jTextId2.setForeground(new java.awt.Color(255, 255, 255));
        jTextId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextId2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 50, 30));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Id tabla");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 30));

        jLabelAgregarPedido.setBackground(new java.awt.Color(11, 181, 217));
        jLabelAgregarPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarPedido.setText("Agregar Pedido");
        jLabelAgregarPedido.setOpaque(true);
        jLabelAgregarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarPedidoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 220, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 640, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 180));

        jPanel2.setBackground(new java.awt.Color(33, 39, 39));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableEmpresas.setAutoCreateRowSorter(true);
        jTableEmpresas.setBackground(new java.awt.Color(51, 51, 51));
        jTableEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        jTableEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpresas.setGridColor(new java.awt.Color(0, 0, 0));
        jTableEmpresas.setOpaque(false);
        jTableEmpresas.setSelectionBackground(new java.awt.Color(11, 181, 217));
        jTableEmpresas.setShowHorizontalLines(false);
        jTableEmpresas.setShowVerticalLines(false);
        jTableEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 290, 180));

        jTableModelos.setBackground(new java.awt.Color(51, 51, 51));
        jTableModelos.setForeground(new java.awt.Color(255, 255, 255));
        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableModelos.setGridColor(new java.awt.Color(102, 255, 51));
        jTableModelos.setOpaque(false);
        jTableModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableModelos);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 180));

        jLabelActualizar.setBackground(new java.awt.Color(11, 181, 217));
        jLabelActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizar.setText("Actualizar");
        jLabelActualizar.setOpaque(true);
        jLabelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 260, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 670, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        IngresarPrograma I = new IngresarPrograma();
        I.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
         
        this.setLocation(x-xMouse, y-yMouse);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    void RegistrarCantCELULARES(){
        
    if(jTextModelo.getText().equals("") || jTextCantidad.getText().equals("") || jTextEmpresa.getText().equals(""))
         {System.out.println("Ingrese Todos los campos");}
         else{ 
               
                        try {
                                PreparedStatement pst = cn.prepareStatement("INSERT INTO CantidadCelulares(Id,Modelo,Cantidad) VALUES (?,?,?)");
                                pst.setString(1, jTextId.getText());
                                pst.setString(2, jTextModelo.getText());
                                pst.setString(3, jTextCantidad.getText());


                                pst.executeUpdate();

                    } catch (Exception e) {
                            System.out.println("Error al Registrar Celulares" + e);
                    }
                }    
    }
    void id(){
     String sql = "SELECT Id FROM CelularesRegistrados";
     int dato[] = new int [1];
     int Mayor =0;
      try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
           dato[0] = rs.getInt(1);
           if(dato[0]>Mayor){
               Mayor = dato[0];
             }
          }
          int ID1 = Mayor+1;
          String ID2 = ID1+"";//hey convertido el int en String
          jTextId.setText(ID2);
      } catch (Exception e) {
          System.out.println("Error" +e);
      }
      
  }
    private void jTextCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadKeyTyped
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '));
        else{JOptionPane.showMessageDialog(null, "Ingrese solo numeros");}
    }//GEN-LAST:event_jTextCantidadKeyTyped

    private void jTableEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpresasMouseClicked
       jTextEmpresa.setText(String.valueOf(jTableEmpresas.getValueAt(jTableEmpresas.getSelectedRow(), 1)));
    }//GEN-LAST:event_jTableEmpresasMouseClicked

    private void jTableModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelosMouseClicked
        jTextId2.setText(String.valueOf(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 0)));
        jTextModelo.setText(String.valueOf(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 1)));
       jTextCantidad.setText(String.valueOf(jTableModelos.getValueAt(jTableModelos.getSelectedRow(), 2)));
    }//GEN-LAST:event_jTableModelosMouseClicked

    private void jLabelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarMouseClicked
        Limpiar();
       
        MostrarMODELOS();
        MostrarEMPRESA();
    }//GEN-LAST:event_jLabelActualizarMouseClicked

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jTextId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextId2ActionPerformed

    private void jLabelAgregarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarPedidoMouseClicked
      
        AgregarPedido();
        AgregarRegistroCompleto();
         
        AgregarPedidosCelulares();
        
        Limpiar();
        
    }//GEN-LAST:event_jLabelAgregarPedidoMouseClicked
   int xMouse;
   int yMouse;
    void AgregarPedido(){
   
         
    
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE CantidadCelulares SET Modelo='"+jTextModelo.getText()+"',Cantidad=Cantidad -'"+jTextCantidad.getText()+"' WHERE Id='"+jTextId2.getText()+"'");
        pst.executeUpdate();
        MostrarMODELOS();
       
    }catch( Exception e ) { 
                System.out.println("Error al modificar" + e);
                     
                  } 
    
    }
    void AgregarPedidosCelulares (){
   
   String sql ="INSERT INTO Celulares_Pedidos(Modelo,Cantidad,Empresa) VALUES (?,?,?)";
    
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            
            
            pst.setString(1, jTextModelo.getText());
            pst.setString(2, jTextCantidad.getText());
            pst.setString(3, jTextEmpresa.getText());
            pst.executeUpdate();
              
            System.out.println("Se agrego Exitosamente el pedido");
           
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
  }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelAgregarPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextEmpresa;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextId2;
    private javax.swing.JTextField jTextModelo;
    // End of variables declaration//GEN-END:variables
}
