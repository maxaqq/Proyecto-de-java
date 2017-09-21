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
public class RegistrarCelulares extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarCelulares
     */
    public RegistrarCelulares() {
        initComponents();
        this.setLocationRelativeTo(null);
        id();
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
    void AgregarREGISTRO(){
     if(jTextModelo.getText().equals("") || jTextCantidad.getText().equals("") || jTextEmpresa.getText().equals(""))
         {javax.swing.JOptionPane.showMessageDialog(this,"Complete todos los espacios","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);}
         else{
            try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO CelularesRegistrados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
        pst.setString(1, jTextId.getText());
        pst.setString(2, jTextModelo.getText());
        pst.setString(3, jTextCantidad.getText());
        pst.setString(4, jTextEmpresa.getText());
        
        pst.executeUpdate();
        
                JOptionPane.showMessageDialog(null, "Se registro Exitosamente!");
        } catch (Exception e) {
                System.out.println("Error al Registrar" + e);
        }
         }

    }
   /* void AgregarREGISTRO2(){
     if(jTextModelo.getText().equals("") || jTextCantidad.getText().equals("") || jTextEmpresa.getText().equals(""))
         {javax.swing.JOptionPane.showMessageDialog(this,"Complete todos los espacios","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);}
         else{
            try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO CelularesRegistrados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
        pst.setString(1, jTextId.getText());
        pst.setString(2, jTextModelo.getText());
        pst.setString(3, jTextCantidad.getText());
        pst.setString(4, jTextEmpresa.getText());
        
        pst.executeUpdate();
        ModeloLG();
                JOptionPane.showMessageDialog(null, "Se registro Exitosamente!");
        } catch (Exception e) {
                System.out.println("Error al Registrar" + e);
        }
         }

    }*/
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
        jLabelRegistrar = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextId2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelAgregar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelConsultarMod = new javax.swing.JLabel();
        jLabelConEmpresas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpresas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableModelos = new javax.swing.JTable();
        jLabelActualizar = new javax.swing.JLabel();

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

        jLabel4.setText("Ingrese Empresa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 123, 29));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarMenu.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarMenu.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 20));

        jLabel5.setText("Ingrese Modelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 123, 29));

        jLabel6.setText("Ingrese cantidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 123, 29));
        jPanel1.add(jTextEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 320, 30));
        jPanel1.add(jTextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        jTextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        jLabelRegistrar.setBackground(new java.awt.Color(11, 181, 217));
        jLabelRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistrar.setText("Registrar");
        jLabelRegistrar.setOpaque(true);
        jLabelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 120, 50));

        jTextId.setBackground(new java.awt.Color(204, 204, 204));
        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        jPanel1.add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 50, 30));

        jLabel1.setText("Id ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 84, 60, 20));

        jTextId2.setEditable(false);
        jTextId2.setBackground(new java.awt.Color(204, 204, 204));
        jTextId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextId2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 50, 30));

        jLabel2.setText("Id tabla");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 30));

        jLabelAgregar.setBackground(new java.awt.Color(11, 181, 217));
        jLabelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregar.setText("Agregar");
        jLabelAgregar.setOpaque(true);
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelConsultarMod.setBackground(new java.awt.Color(11, 181, 217));
        jLabelConsultarMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsultarMod.setText("Consultar Modelos");
        jLabelConsultarMod.setOpaque(true);
        jLabelConsultarMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConsultarModMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelConsultarMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 50));

        jLabelConEmpresas.setBackground(new java.awt.Color(11, 181, 217));
        jLabelConEmpresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConEmpresas.setText("Consultar Empresas");
        jLabelConEmpresas.setOpaque(true);
        jLabelConEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConEmpresasMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelConEmpresas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 180, 50));

        jTableEmpresas.setAutoCreateRowSorter(true);
        jTableEmpresas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        jTableEmpresas.setGridColor(new java.awt.Color(255, 255, 255));
        jTableEmpresas.setOpaque(false);
        jTableEmpresas.setSelectionBackground(new java.awt.Color(11, 181, 217));
        jTableEmpresas.setShowHorizontalLines(false);
        jTableEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpresasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpresas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 290, 180));

        jTableModelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
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
        jPanel2.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 670, 280));

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
         else{ String empresa = "Almacen de Remates S.A.";
            try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO CantidadCelulares(Modelo,Cantidad,Empresa) VALUES (?,?,?)");
        //pst.setString(1, jTextId.getText());
        pst.setString(1, jTextModelo.getText());
        pst.setString(2, jTextCantidad.getText());
        pst.setString(3, empresa);
        
        
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
    void ModeloLG(){
        String slq = "SELECT  Modelo FROM CantidadCelulares";
        String LG[]= new String [1];
        int A = 0,B = 0;
        try {
            Statement st =cn.createStatement();
           ResultSet rs = st.executeQuery(slq);
           while(rs.next()){
             LG[0] =rs.getString(1);
             if(LG[0].equals(jTextModelo.getText()))
             {javax.swing.JOptionPane.showMessageDialog(this, "No puede volver a registrar el mismo Modelo"
                     ,"AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
             }else {A++;}
             B++;   
           }
           if(A==B){
              AgregarREGISTRO();
              RegistrarCantCELULARES();
              Limpiar();}
        } catch (SQLException e) {
            System.out.println("Error en MODELO LG!" + e);
        }
    }
     void AgregarCelulares (){
   
   String sql ="INSERT INTO Celulares_Agregados(Modelo,Cantidad,Empresa) VALUES (?,?,?)";
    
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            
            
            pst.setString(1, jTextModelo.getText());
            pst.setString(2, jTextCantidad.getText());
            pst.setString(3, jTextEmpresa.getText());
            pst.executeUpdate();
              
            
           
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
  }
     
    private void jLabelRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarMouseClicked
      
       ModeloLG();
        
    }//GEN-LAST:event_jLabelRegistrarMouseClicked

    private void jLabelConsultarModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConsultarModMouseClicked
       MostrarMODELOS();
       
       
    }//GEN-LAST:event_jLabelConsultarModMouseClicked

    private void jLabelConEmpresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConEmpresasMouseClicked
        MostrarEMPRESA();
    }//GEN-LAST:event_jLabelConEmpresasMouseClicked

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

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
       AgregarCelulares();
        AGREGAR();
        AgregarREGISTRO();
         
       
         Limpiar();
        
    }//GEN-LAST:event_jLabelAgregarMouseClicked
   int xMouse;
   int yMouse;
    void AGREGAR(){
   
         
    
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE CantidadCelulares SET Modelo='"+jTextModelo.getText()+"',Cantidad=Cantidad +'"+jTextCantidad.getText()+"' WHERE Id='"+jTextId2.getText()+"'");
        pst.executeUpdate();
        MostrarMODELOS();
       
    }catch( Exception e ) { 
                System.out.println("Error al modificar" + e);
                     
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
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelConEmpresas;
    private javax.swing.JLabel jLabelConsultarMod;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableEmpresas;
    private javax.swing.JTable jTableModelos;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextEmpresa;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextId2;
    private javax.swing.JTextField jTextModelo;
    // End of variables declaration//GEN-END:variables
}
