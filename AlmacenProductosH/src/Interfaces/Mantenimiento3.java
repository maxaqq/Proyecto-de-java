/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import almacenproductos.CONECTAR;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class Mantenimiento3 extends javax.swing.JFrame {

    /**
     * Creates new form Home15
     */
    public Mantenimiento3() {
        initComponents();
        Actualizar();
        id();
        idI();
        idITotal();
        this.setLocationRelativeTo(null);
        idCantidadCell();
        
        UsuariosClicked();
    }
     CONECTAR cc= new CONECTAR();
    Connection cn= cc.conexion();
   
  void mostrardatos(String valor){
    DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("APELLIDO");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("USUARIO");
    modelo.addColumn("PASSWORD");
    modelo.addColumn("PAIS");
    modelo.addColumn("EMPRESA");
    modelo.addColumn("TIPO");
    modelo.addColumn("Email");
    jTableRUsuarios.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM RegistroUsuarios";
    }
    else{
        sql="SELECT * FROM RegistroUsuarios WHERE id='"+valor+"'";
    }
 
    String []datos = new String [10];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                
                
                
                
                modelo.addRow(datos);
            }
            jTableRUsuarios.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Mantenimiento3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
  void Actualizar(){
   DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("CODIGO");
    modelo.addColumn("NOMBRE");
    modelo.addColumn("APELLIDO");
    modelo.addColumn("TELEFONO");
    modelo.addColumn("USUARIO");
    modelo.addColumn("PASSWORD");
    modelo.addColumn("PAIS");
    modelo.addColumn("EMPRESA");
    modelo.addColumn("TIPO");
    modelo.addColumn("Email");
    jTableRUsuarios.setModel(modelo);
      String sql = "Select * from registroUsuarios";
  String []datos = new String [10];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                
                
                
                
                modelo.addRow(datos);
            }
            jTableRUsuarios.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Mantenimiento3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  
  
  }
  void id(){
     String sql = "SELECT Id FROM registroUsuarios";
     int dato[] = new int [1];
     int Mayor =Integer.MIN_VALUE;
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
          jTextID.setText(ID2);
      } catch (Exception e) {
          System.out.println("Error" +e);
      }
      
  }
  
  void idP(){
     String sql = "SELECT Id FROM Celulares_Pedidos";
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
          jTextIdP.setText(ID2);
          JTextIdP_static.setText(ID2);
      } catch (Exception e) {
          System.out.println("Error" +e);
      }
      
  }
  void idPTotal(){
     String sql = "SELECT Id FROM CelularesRegistrados";
     int A;
     int Mayor =0;
      try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
           A = rs.getInt(1);
             
           if(A>Mayor){
               Mayor = A;
             }
          }
          int ID1 = Mayor+1;
          String ID2 = ID1+"";//hey convertido el int en String
          jTextIdPTotal.setText(ID2);
      } catch (SQLException e) {
          System.out.println("Error Al Extraer Id de db CelularesRegistrados" +e);
      }
      
  }
  void LimpiarPedido(){
     jTextModeloP.setText("");
     jTextCantidadP.setText("");
     jTextEmpresaP.setText("");
      idP();
  }
  void AgregarRegistroTPedido(){
     if(jTextIdPTotal.getText().equals("") || jTextModeloP.getText().equals("") || jTextCantidadP.getText().equals("") || jTextEmpresaP.getText().equals(""))
         {javax.swing.JOptionPane.showMessageDialog(this,"        Complete todos los espacios","               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);}
         else{
               int Rpt =JOptionPane.showConfirmDialog(null, "Esta seguro de Registrar el pedido?","Confirmacion",JOptionPane.YES_NO_OPTION);
               if(Rpt == JOptionPane.YES_OPTION){
             
                 try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO CelularesRegistrados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
                        pst.setString(1, jTextIdPTotal.getText());
                        pst.setString(2, jTextModeloP.getText());
                        pst.setString(3, jTextCantidadP.getText());
                        pst.setString(4, jTextEmpresaP.getText());

                        pst.executeUpdate();
                      System.out.println("Se agrego el pedido Exitosamente! db CelularesRegistrados");
                       /* JOptionPane.showMessageDialog(null, "Se registro Exitosamente!");*/
                     }   catch (SQLException e) {
                        System.out.println("Error al Registrar" + e);
                         }      
                 
                 AgregarPedidosCelulares();
              }else{System.out.println("Accion cancelada");}
             
             
     }  
    }
  void AgregarPedidosCelulares (){
   if(jTextIdP.getText().equals("") || jTextModeloP.getText().equals("") || jTextCantidadP.getText().equals("") || jTextEmpresaP.getText().equals(""))
   {
     //javax.swing.JOptionPane.showMessageDialog(this,"Complete todos los espacios","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   String sql ="INSERT INTO Celulares_Pedidos(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)";
    
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            
            pst.setString(1, JTextIdP_static.getText());
            pst.setString(2, jTextModeloP.getText());
            pst.setString(3, jTextCantidadP.getText());
            pst.setString(4, jTextEmpresaP.getText());
            pst.executeUpdate();
              
            System.out.println("Se agrego Exitosamente el pedido en db Celulares_Pedidos");
           
        } catch (Exception e) {
            System.out.println("No se puedo Agregar en db CelularesPedidos" + e);
        }
      }
  }  
  void MostrarPedidos (){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTablePedidos.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM Celulares_pedidos";
    String []Dato = new String[4];
        try {
            Statement stmt =cn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next() ){
              Dato[0] = rs.getString(1);
              Dato[1] = rs.getString(2);
              Dato[2] = rs.getString(3);
              Dato[3] = rs.getString(4);
              
              ModeloEMPRES.addRow(Dato);
            }
            jTablePedidos.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
  void ModicarPedido(){
   if(jTextModeloP.getText().equals("") || jTextCantidadP.getText().equals("")){
       System.out.println("Ingrese Todos los Campos(db CantidadCelulares)");
   }else{
        int B = 0;
        int C = 0;
       try {
          
           Statement st = cn.createStatement();
           ResultSet rs = st.executeQuery("SELECT Cantidad FROM Celulares_Pedidos WHERE Id='"+jTextIdP.getText()+"'");
           B = Integer.parseInt(rs.getString(3));
          
       } catch (NumberFormatException | SQLException e) {
           System.out.println("Error al Extraer Cantidad( db Celulares_Pedidos)" + e);
       }
        System.out.println("B = " + B);
         int A = Integer.parseInt(jTextCantidadP.getText());
    if(A>B){ C = A-B;
    }else if (A==B){ C = 0;} else {C=B-A;}
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE CantidadCelulares SET Modelo='"+jTextModeloP.getText()+"',Cantidad=Cantidad -'"+C+"' WHERE Id='"+jTextIdP.getText()+"'");
        pst.executeUpdate();
       AgregarPedidosCelulares();
       
    }catch( Exception e ) { 
                System.out.println("No se puedo Modificar en db CantidadCelulares" + e);
                  } 
        
    
   }
  
  }
  void ModificarPedido2(){
     if(jTextModeloP.getText().equals("") || jTextCantidadP.getText().equals("")){
       System.out.println("Ingrese Todos los Campos(db CantidadCelulares)");}
     else{
         try {
             PreparedStatement pst = cn.prepareStatement("UPDATE Celulares_Pedidos SET Modelo='"+jTextModeloP.getText()+"',Cantidad='"+jTextCantidadP.getText()+"',Empresa='"+jTextEmpresaP.getText()+"' WHERE Id='"+jTextIdP.getText()+"'");
            pst.executeUpdate();
             System.out.println("Se Modifico con Exito db Celulares_Pedidos  " );
         
         } catch (SQLException e) {
              System.out.println("No se Pudo Modificar db Celulares_Pedidos  " + e);
         
         }
    //ModificarPedidoTOTAL();
     }
  }
  void ModificarPedidoTOTAL(){
  if(jTextModeloP.getText().equals("") || jTextCantidadP.getText().equals("")){
       System.out.println("Ingrese Todos los Campos(db CantidadCelulares)");}
     else{
         try {
             PreparedStatement pst = cn.prepareStatement("UPDATE CelularesRegistrados SET Modelo='"+jTextModeloP.getText()+"',Cantidad='"+jTextCantidadP.getText()+"',Empresa='"+jTextEmpresaP.getText()+"' WHERE Id='"+jTextIdP.getText()+"'");
            pst.executeUpdate();
             System.out.println("Se Modifico con Exito db CelularesRegistrados  " );
         } catch (SQLException e) {
              System.out.println("No se Pudo Modificar db CelularesRegistrados  " + e);
         }
     }
  }
  void ActualizarPedido(){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTablePedidos.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM Celulares_pedidos";
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
            jTablePedidos.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
        LimpiarPedido();
  }
  void EliminarPedido(){
     if (jTextModeloP.getText().equals("") || (jTextCantidadP.getText().equals("")) || (jTextEmpresaP.getText().equals("")) /*|| (jTextFechaP.getText().equals(""))*/){
   javax.swing.JOptionPane.showMessageDialog(this, "       Selecione una fila \n","                               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   int fila = jTablePedidos.getSelectedRow();     
  String cod="";
    cod=jTablePedidos.getValueAt(fila, 0).toString();
         System.out.println("cod " + cod);
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE  FROM Celulares_Pedidos  WHERE  Id='"+cod+"'");
        pst.executeUpdate();
       MostrarPedidos();
       LimpiarPedido();
        
       } catch (SQLException e) { System.out.println("No se pudo Eliminar en db Celulares_Pedidos" + e);
          }
   }
  }
  void EliminarTotalP(){
     if (jTextModeloP.getText().equals("") || (jTextCantidadP.getText().equals("")) || (jTextEmpresaP.getText().equals("")) /*|| (jTextFechaP.getText().equals(""))*/){
          System.out.println("Ingrese Todos los Campos");
         //javax.swing.JOptionPane.showMessageDialog(this, "       Selecione una fila \n","                               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
         try {
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery("SELECT Modelo FROM CelularesRegistrados");
             while(rs.next()){
             String Comparacion = rs.getString(1);
             if(Comparacion.equals(jTextModeloP.getText()))
                {
                    System.out.println("IGUALLLLL!!!!");
                    try {
                        //ResultSet RS = st.executeQuery("")
                    } catch (Exception e) {
                    }
                }
             }
             int fila = jTablePedidos.getSelectedRow();     
             String cod="";
             cod=jTablePedidos.getValueAt(fila, 0).toString();

            try {
                PreparedStatement pst = cn.prepareStatement("DELETE  FROM CelularesRegistrados  WHERE  Id='"+cod+"'");
                pst.executeUpdate();
                System.out.println("Se elimino con Exito de db CelularesRegistrados");

               } catch (SQLException e) { System.out.println("No se pudo Eliminar de la db CelularesRegistrados" + e);
                  }
         } catch (SQLException e) {
             System.out.println("ERROR DE COMPARACION" + e);
         }
             
   }
  }
  void LlenarCamposPedido(){
     jTextIdP.setText(String.valueOf(jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 0)));
     jTextModeloP.setText(String.valueOf(jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 1)));
     jTextCantidadP.setText(String.valueOf(jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 2)));
     jTextEmpresaP.setText(String.valueOf(jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(),3)));
  }
  
  
  
  void idI(){
    String sql = "SELECT Id FROM Celulares_Agregados";
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
          jTextIdI.setText(ID2);
          JTextIdI_Static.setText(ID2);
      } catch (SQLException e) {
          System.out.println("Error" +e);
      }
      
  }
  void idITotal(){
     String sql = "SELECT Id FROM CelularesRegistrados";
     int A;
     int Mayor =0;
      try {
          Statement st = cn.createStatement();
          ResultSet rs = st.executeQuery(sql);
          while(rs.next()){
           A = rs.getInt(1);
             
           if(A>Mayor){
               Mayor = A;
             }
          }
          int ID1 = Mayor+1;
          String ID2 = ID1+"";//hey convertido el int en String
          jTextIdITotal.setText(ID2);
      } catch (SQLException e) {
          System.out.println("Error Al Extraer Id de db CelularesRegistrados" +e);
      }
  }
  void AgregarCelularesAgregados(){
        if(jTextIdI.getText().equals("") || jTextModeloI.getText().equals("") || jTextCantidadI.getText().equals("") || jTextEmpresaI.getText().equals(""))
   {
     //javax.swing.JOptionPane.showMessageDialog(this,"Complete todos los espacios","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   String sql ="INSERT INTO Celulares_Agregados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)";
    
        try {
            PreparedStatement pst =cn.prepareStatement(sql);
            
            pst.setString(1, JTextIdI_Static.getText());
            pst.setString(2, jTextModeloI.getText());
            pst.setString(3, jTextCantidadI.getText());
            pst.setString(4, jTextEmpresaI.getText());
            pst.executeUpdate();
              
            System.out.println("Se agrego Exitosamente el pedido en db Celulares_Agregados");
           
        } catch (SQLException e) {
            System.out.println("No se puedo Agregar en db Celulares_Agregados" + e);
        }
      }
  }
  void AgregarRegistroTAgregado(){
       if(jTextIdITotal.getText().equals("") || jTextModeloI.getText().equals("") || jTextCantidadI.getText().equals("") || jTextEmpresaI.getText().equals(""))
         {javax.swing.JOptionPane.showMessageDialog(this,"        Complete todos los espacios","               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);}
         else{
               int Rpt =JOptionPane.showConfirmDialog(null, "Esta seguro de Registrar el pedido?","Confirmacion",JOptionPane.YES_NO_OPTION);
               if(Rpt == JOptionPane.YES_OPTION){
             
                 try {
                        PreparedStatement pst = cn.prepareStatement("INSERT INTO CelularesRegistrados(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
                        pst.setString(1, jTextIdITotal.getText());
                        pst.setString(2, jTextModeloI.getText());
                        pst.setString(3, jTextCantidadI.getText());
                        pst.setString(4, jTextEmpresaI.getText());

                        pst.executeUpdate();
                      System.out.println("Se agrego el pedido Exitosamente! db CelularesRegistrados");
                       /* JOptionPane.showMessageDialog(null, "Se registro Exitosamente!");*/
                     }   catch (SQLException e) {
                        System.out.println("Error al Registrar" + e);
                         }      
                 
                   AgregarCelularesAgregados();
                   ActualizarAgregados();
              }else{System.out.println("Accion cancelada");}
             
             
     }  
  }
  void MostrarAgregados (){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTableAgregados.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM Celulares_Agregados";
    String []Dato = new String[4];
        try {
            Statement stmt =cn.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next() ){
              Dato[0] = rs.getString(1);
              Dato[1] = rs.getString(2);
              Dato[2] = rs.getString(3);
              Dato[3] = rs.getString(4);
              
              ModeloEMPRES.addRow(Dato);
            }
            jTableAgregados.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
  void ActualizarAgregados(){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTableAgregados.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM Celulares_Agregados";
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
            jTableAgregados.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
        LimpiarAgregados();
  }
  void LimpiarAgregados(){
      jTextModeloI.setText("");
     jTextCantidadI.setText("");
     jTextEmpresaI.setText("");
      idI();
  }
  void ModificarAgregado(){
      
     if(jTextModeloI.getText().equals("") || jTextCantidadI.getText().equals("") || jTextEmpresaI.getText().equals("")){
       javax.swing.JOptionPane.showMessageDialog(this, "       Seleccione una fila","               AVISO",JOptionPane.INFORMATION_MESSAGE);
         System.out.println("Seleccione una fila");}
     else{
         
         try {
             PreparedStatement pst = cn.prepareStatement("UPDATE Celulares_Agregados SET Modelo='"+jTextModeloI.getText()+"',Cantidad='"+jTextCantidadI.getText()+"',Empresa='"+jTextEmpresaI.getText()+"' WHERE Id='"+jTextIdI.getText()+"'");
            pst.executeUpdate();
             System.out.println("Se Modifico con Exito db Celulares_Agregados  " );
         ActualizarAgregados();
         } catch (SQLException e) {
              System.out.println("No se Pudo Modificar db Celulares_Agregados  " + e);
         
         }
    
     }
  }
  void LlenarCamposAgregados(){
     jTextIdI.setText(String.valueOf(jTableAgregados.getValueAt(jTableAgregados.getSelectedRow(), 0)));
     jTextModeloI.setText(String.valueOf(jTableAgregados.getValueAt(jTableAgregados.getSelectedRow(), 1)));
     jTextCantidadI.setText(String.valueOf(jTableAgregados.getValueAt(jTableAgregados.getSelectedRow(), 2)));
     jTextEmpresaI.setText(String.valueOf(jTableAgregados.getValueAt(jTableAgregados.getSelectedRow(),3)));
  }
  void EliminarAgregados(){
     if (jTextModeloI.getText().equals("") || (jTextCantidadI.getText().equals("")) || (jTextEmpresaI.getText().equals("")) /*|| (jTextFechaP.getText().equals(""))*/){
   javax.swing.JOptionPane.showMessageDialog(this, "       Selecione una fila \n","                               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   int fila = jTableAgregados.getSelectedRow();     
  String cod="";
    cod=jTableAgregados.getValueAt(fila, 0).toString();
         System.out.println("cod " + cod);
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE  FROM Celulares_Agregados  WHERE  Id='"+cod+"'");
        pst.executeUpdate();
       MostrarPedidos();
       LimpiarPedido();
        ActualizarAgregados();
       } catch (SQLException e) { System.out.println("No se pudo Eliminar en db Celulares_Agregados" + e);
          }
   }
  }
  
  
  void idCantidadCell(){
  String sql = "SELECT Id FROM CantidadCelulares";
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
          jTextIdR.setText(ID2);
          jTextIdR_Static.setText(ID2);
      } catch (Exception e) {
          System.out.println("Error" +e);
      }
  }
  void MostrarCantidadCelulares(){
      DefaultTableModel ModeloCell = new DefaultTableModel();
    ModeloCell.addColumn("Id");
    ModeloCell.addColumn("Modelos");
    ModeloCell.addColumn("Cantidad");
    ModeloCell.addColumn("Empresa");
    
    jTableModelosRegistrados.setModel(ModeloCell);
    String sql ="SELECT * FROM CantidadCelulares";
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
            jTableModelosRegistrados.setModel(ModeloCell);
        } catch (SQLException e) {
            System.out.println("Error en la conexion" + e);
        }
    
   
  }
  void AgregarCantidadCelulares(){
    if(jTextModeloR.getText().equals("") || jTextCantidadR.getText().equals("") || jTextEmpresaR.getText().equals(""))
        
    {System.out.println("Ingrese Todos los campos");}
         else{  int Rpt =JOptionPane.showConfirmDialog(null, "Esta seguro de Registrar este Modelo?","                          Confirmacion",JOptionPane.YES_NO_OPTION);
               if(Rpt == JOptionPane.YES_OPTION){
        String empresa = "Almacen de Remates S.A.";
         
            try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO CantidadCelulares(Id,Modelo,Cantidad,Empresa) VALUES (?,?,?,?)");
        pst.setString(1, jTextIdR_Static.getText());
        pst.setString(2, jTextModeloR.getText());
        pst.setString(3, jTextCantidadR.getText());
        pst.setString(4, empresa);
        
        
        pst.executeUpdate();
        idCantidadCell();
                
        } catch (Exception e) {
                System.out.println("Error al Registrar Celulares" + e);
        }
            ActualizarModelos();
               }else {System.out.println("La accion fue cancelada");}
    }    
  }
  void ModificarModelos(){
  if(jTextModeloR.getText().equals("") || jTextCantidadR.getText().equals("") || jTextEmpresaR.getText().equals("")){
       System.out.println("Ingrese Todos los Campos()");}
     else{
      
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE CantidadCelulares SET Modelo='"+jTextModeloR.getText()+"',Cantidad='"+jTextCantidadR.getText()+"' WHERE Id='"+jTextIdR.getText()+"'");
        pst.executeUpdate();
        
       
    }catch( Exception e ) { 
                System.out.println("Error al modificar" + e);
                     
                  } 
  }
  }
  void ActualizarModelos(){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTableModelosRegistrados.setModel(ModeloEMPRES);
    String sql ="SELECT * FROM CantidadCelulares";
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
            jTableModelosRegistrados.setModel(ModeloEMPRES);
        } catch (SQLException e) {
            System.out.println("Error en la conexion" + e);
        }
        limpiarModelos();
  }
  void limpiarModelos(){
      jTextModeloR.setText("");
     jTextCantidadR.setText("");
     jTextEmpresaR.setText("Almacen de Remates S.A.");
      idI();
 
 }
  void EliminarModelos() {
     if (jTextModeloR.getText().equals("") || (jTextCantidadR.getText().equals("")) || (jTextEmpresaR.getText().equals("")) /*|| (jTextFechaP.getText().equals(""))*/){
   javax.swing.JOptionPane.showMessageDialog(this, "       Selecione una fila \n","                               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   
        
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE  FROM CantidadCelulares  WHERE  Id='"+jTextIdR.getText()+"'");
        pst.executeUpdate();
       MostrarCantidadCelulares();
       
        ActualizarModelos();
        idCantidadCell();
       } catch (SQLException e) { System.out.println("No se pudo Eliminar en db CantidadCelulares" + e);
          }
   }
  }
  void LlenarCamposModelos(){
      jTextIdR.setText(String.valueOf(jTableModelosRegistrados.getValueAt(jTableModelosRegistrados.getSelectedRow(), 0)));
     jTextModeloR.setText(String.valueOf(jTableModelosRegistrados.getValueAt(jTableModelosRegistrados.getSelectedRow(), 1)));
     jTextCantidadR.setText(String.valueOf(jTableModelosRegistrados.getValueAt(jTableModelosRegistrados.getSelectedRow(), 2)));
     jTextEmpresaR.setText(String.valueOf(jTableModelosRegistrados.getValueAt(jTableModelosRegistrados.getSelectedRow(),3)));
  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanelControlTCelulares = new javax.swing.JPanel();
        jTextFechaR = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableModelosRegistrados = new javax.swing.JTable();
        jTextModeloR = new javax.swing.JTextField();
        jTextCantidadR = new javax.swing.JTextField();
        jTextEmpresaR = new javax.swing.JTextField();
        jTextIdR = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabelEliminarR = new javax.swing.JLabel();
        jLabelAgregarR = new javax.swing.JLabel();
        jLabelActualizarR = new javax.swing.JLabel();
        jLabelModificarR = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextIdR_Static = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanelPedidosCelulares = new javax.swing.JPanel();
        jTextFechaP = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jTextModeloP = new javax.swing.JTextField();
        jTextCantidadP = new javax.swing.JTextField();
        jTextEmpresaP = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabelEliminarP = new javax.swing.JLabel();
        jLabelAgregarP = new javax.swing.JLabel();
        jLabelActualizarP = new javax.swing.JLabel();
        jLabelModificarP = new javax.swing.JLabel();
        jTextIdP = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextIdPTotal = new javax.swing.JTextField();
        JTextIdP_static = new javax.swing.JTextField();
        jPanelIngresoCelulares = new javax.swing.JPanel();
        jTextFechaI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgregados = new javax.swing.JTable();
        jTextModeloI = new javax.swing.JTextField();
        jTextCantidadI = new javax.swing.JTextField();
        jTextEmpresaI = new javax.swing.JTextField();
        jTextIdI = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabelEliminarI = new javax.swing.JLabel();
        jLabelAgregarI = new javax.swing.JLabel();
        jLabelActualizarI = new javax.swing.JLabel();
        jLabelModificarI = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        JTextIdI_Static = new javax.swing.JTextField();
        jTextIdITotal = new javax.swing.JTextField();
        JPanelUsuarios = new javax.swing.JPanel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextTelef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRUsuarios = new javax.swing.JTable();
        jPasswordField = new javax.swing.JPasswordField();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabelAgregar = new javax.swing.JLabel();
        jLabelMoficar = new javax.swing.JLabel();
        jLabelEliminar = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabelActualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(1, 198, 83));
        header.setPreferredSize(new java.awt.Dimension(838, 200));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 150, 62));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        jPanel3.setBackground(new java.awt.Color(0, 150, 62));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingreso Celares");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphoneMANTENIMIENTO.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 70));

        header.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 200, 100));

        jPanel1.setBackground(new java.awt.Color(0, 150, 62));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin-with-cogwheels.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 70));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mantenimiento Users");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, 20));

        header.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 100));

        jPanel4.setBackground(new java.awt.Color(0, 150, 62));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphonePEDDIDDO.png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 70));

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Pedido Celares");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 20));

        header.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 200, 100));

        jPanel5.setBackground(new java.awt.Color(0, 150, 62));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modelos Registrados");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphoneVentas2.png"))); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 130, 70));

        header.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 200, 100));

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Mantenimiento");
        header.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 340, 50));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 842, 190));

        jPanelControlTCelulares.setBackground(new java.awt.Color(255, 255, 255));
        jPanelControlTCelulares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelControlTCelulares.add(jTextFechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        jTableModelosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableModelosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModelosRegistradosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableModelosRegistrados);

        jPanelControlTCelulares.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 20, 500, 270));

        jTextModeloR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextModeloRActionPerformed(evt);
            }
        });
        jPanelControlTCelulares.add(jTextModeloR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 30));

        jTextCantidadR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadRKeyTyped(evt);
            }
        });
        jPanelControlTCelulares.add(jTextCantidadR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jTextEmpresaR.setEditable(false);
        jTextEmpresaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmpresaRActionPerformed(evt);
            }
        });
        jPanelControlTCelulares.add(jTextEmpresaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 30));

        jTextIdR.setEditable(false);
        jTextIdR.setBackground(new java.awt.Color(204, 204, 204));
        jTextIdR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdRActionPerformed(evt);
            }
        });
        jPanelControlTCelulares.add(jTextIdR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        jLabel43.setText("Fecha");
        jPanelControlTCelulares.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel44.setText("Modelo");
        jPanelControlTCelulares.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel45.setText("Cantidad");
        jPanelControlTCelulares.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 20));

        jLabel46.setText("Empresa");
        jPanelControlTCelulares.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 20));

        jLabelEliminarR.setBackground(new java.awt.Color(248, 137, 40));
        jLabelEliminarR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelEliminarR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminarR.setText("Eliminar");
        jLabelEliminarR.setOpaque(true);
        jLabelEliminarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarRMouseClicked(evt);
            }
        });
        jPanelControlTCelulares.add(jLabelEliminarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 160, 40));

        jLabelAgregarR.setBackground(new java.awt.Color(248, 137, 40));
        jLabelAgregarR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelAgregarR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarR.setText("Agregar");
        jLabelAgregarR.setOpaque(true);
        jLabelAgregarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarRMouseClicked(evt);
            }
        });
        jPanelControlTCelulares.add(jLabelAgregarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 40));

        jLabelActualizarR.setBackground(new java.awt.Color(248, 137, 40));
        jLabelActualizarR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelActualizarR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizarR.setText("Actualizar");
        jLabelActualizarR.setOpaque(true);
        jLabelActualizarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarRMouseClicked(evt);
            }
        });
        jPanelControlTCelulares.add(jLabelActualizarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 160, 40));

        jLabelModificarR.setBackground(new java.awt.Color(248, 137, 40));
        jLabelModificarR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelModificarR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificarR.setText("Modificar");
        jLabelModificarR.setOpaque(true);
        jLabelModificarR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarRMouseClicked(evt);
            }
        });
        jPanelControlTCelulares.add(jLabelModificarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 40));

        jLabel51.setText("Id");
        jPanelControlTCelulares.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 244, -1, 20));

        jTextIdR_Static.setEditable(false);
        jPanelControlTCelulares.add(jTextIdR_Static, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 40, 30));

        jLabel4.setText("Id static");
        jPanelControlTCelulares.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 244, -1, 20));

        getContentPane().add(jPanelControlTCelulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 840, 390));

        jPanelPedidosCelulares.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPedidosCelulares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelPedidosCelulares.add(jTextFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePedidos);

        jPanelPedidosCelulares.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 20, 500, 270));

        jTextModeloP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextModeloPActionPerformed(evt);
            }
        });
        jPanelPedidosCelulares.add(jTextModeloP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 30));

        jTextCantidadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadPKeyTyped(evt);
            }
        });
        jPanelPedidosCelulares.add(jTextCantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jTextEmpresaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmpresaPActionPerformed(evt);
            }
        });
        jPanelPedidosCelulares.add(jTextEmpresaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 30));

        jLabel33.setText("Fecha");
        jPanelPedidosCelulares.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel34.setText("Modelo");
        jPanelPedidosCelulares.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel35.setText("Cantidad");
        jPanelPedidosCelulares.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 20));

        jLabel36.setText("Empresa");
        jPanelPedidosCelulares.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 20));

        jLabelEliminarP.setBackground(new java.awt.Color(14, 173, 93));
        jLabelEliminarP.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelEliminarP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminarP.setText("Eliminar");
        jLabelEliminarP.setOpaque(true);
        jLabelEliminarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarPMouseClicked(evt);
            }
        });
        jPanelPedidosCelulares.add(jLabelEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 160, 40));

        jLabelAgregarP.setBackground(new java.awt.Color(14, 173, 93));
        jLabelAgregarP.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelAgregarP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarP.setText("Agregar");
        jLabelAgregarP.setOpaque(true);
        jLabelAgregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarPMouseClicked(evt);
            }
        });
        jPanelPedidosCelulares.add(jLabelAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 40));

        jLabelActualizarP.setBackground(new java.awt.Color(14, 173, 93));
        jLabelActualizarP.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelActualizarP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizarP.setText("Actualizar");
        jLabelActualizarP.setOpaque(true);
        jLabelActualizarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarPMouseClicked(evt);
            }
        });
        jPanelPedidosCelulares.add(jLabelActualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 160, 40));

        jLabelModificarP.setBackground(new java.awt.Color(14, 173, 93));
        jLabelModificarP.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelModificarP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificarP.setText("Modificar");
        jLabelModificarP.setOpaque(true);
        jLabelModificarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarPMouseClicked(evt);
            }
        });
        jPanelPedidosCelulares.add(jLabelModificarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 40));

        jTextIdP.setEditable(false);
        jTextIdP.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPedidosCelulares.add(jTextIdP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        jLabel41.setText("Id");
        jPanelPedidosCelulares.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 244, -1, 20));

        jTextIdPTotal.setForeground(new java.awt.Color(255, 255, 255));
        jTextIdPTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdPTotalActionPerformed(evt);
            }
        });
        jPanelPedidosCelulares.add(jTextIdPTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 270, 10, 30));
        jPanelPedidosCelulares.add(JTextIdP_static, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 0, 30));

        getContentPane().add(jPanelPedidosCelulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 840, 390));

        jPanelIngresoCelulares.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIngresoCelulares.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelIngresoCelulares.add(jTextFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 30));

        jTableAgregados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAgregados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgregadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgregados);

        jPanelIngresoCelulares.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 20, 500, 270));

        jTextModeloI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextModeloIActionPerformed(evt);
            }
        });
        jPanelIngresoCelulares.add(jTextModeloI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 30));

        jTextCantidadI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCantidadIKeyTyped(evt);
            }
        });
        jPanelIngresoCelulares.add(jTextCantidadI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 30));

        jTextEmpresaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmpresaIActionPerformed(evt);
            }
        });
        jPanelIngresoCelulares.add(jTextEmpresaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 30));

        jTextIdI.setEditable(false);
        jTextIdI.setBackground(new java.awt.Color(204, 204, 204));
        jPanelIngresoCelulares.add(jTextIdI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        jLabel24.setText("Fecha");
        jPanelIngresoCelulares.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel25.setText("Modelo");
        jPanelIngresoCelulares.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel26.setText("Cantidad");
        jPanelIngresoCelulares.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 20));

        jLabel27.setText("Empresa");
        jPanelIngresoCelulares.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 20));

        jLabelEliminarI.setBackground(new java.awt.Color(199, 118, 229));
        jLabelEliminarI.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelEliminarI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminarI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminarI.setText("Eliminar");
        jLabelEliminarI.setOpaque(true);
        jLabelEliminarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarIMouseClicked(evt);
            }
        });
        jPanelIngresoCelulares.add(jLabelEliminarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 160, 40));

        jLabelAgregarI.setBackground(new java.awt.Color(199, 118, 229));
        jLabelAgregarI.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelAgregarI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarI.setText("Agregar");
        jLabelAgregarI.setOpaque(true);
        jLabelAgregarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarIMouseClicked(evt);
            }
        });
        jPanelIngresoCelulares.add(jLabelAgregarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 40));

        jLabelActualizarI.setBackground(new java.awt.Color(199, 118, 229));
        jLabelActualizarI.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelActualizarI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizarI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizarI.setText("Actualizar");
        jLabelActualizarI.setOpaque(true);
        jLabelActualizarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarIMouseClicked(evt);
            }
        });
        jPanelIngresoCelulares.add(jLabelActualizarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 160, 40));

        jLabelModificarI.setBackground(new java.awt.Color(199, 118, 229));
        jLabelModificarI.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelModificarI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificarI.setText("Modificar");
        jLabelModificarI.setOpaque(true);
        jLabelModificarI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarIMouseClicked(evt);
            }
        });
        jPanelIngresoCelulares.add(jLabelModificarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 160, 40));

        jLabel28.setText("Id");
        jPanelIngresoCelulares.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 244, -1, 20));

        JTextIdI_Static.setForeground(new java.awt.Color(255, 255, 255));
        jPanelIngresoCelulares.add(JTextIdI_Static, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 10, 30));

        jTextIdITotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanelIngresoCelulares.add(jTextIdITotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 10, 30));

        getContentPane().add(jPanelIngresoCelulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 840, 390));

        JPanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        JPanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPanelUsuarios.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 30));

        jLabel2.setText("Nombre");
        JPanelUsuarios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));
        JPanelUsuarios.add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

        jLabel6.setText("Apellido");
        JPanelUsuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));
        JPanelUsuarios.add(jTextTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 30));

        jLabel7.setText("Telefono");
        JPanelUsuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 20));

        jLabel8.setText("Password");
        JPanelUsuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 90, -1));

        jTextUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        JPanelUsuarios.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 170, 30));

        jLabel9.setText("usuario");
        JPanelUsuarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, -1));

        jTextPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPaisActionPerformed(evt);
            }
        });
        JPanelUsuarios.add(jTextPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 190, 30));

        jLabel10.setText("Pais");
        JPanelUsuarios.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 90, -1));
        JPanelUsuarios.add(jTextEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 410, 30));

        jLabel11.setText("Empresa");
        JPanelUsuarios.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, -1));

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        JPanelUsuarios.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 210, 30));

        jLabel12.setText("Email");
        JPanelUsuarios.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 90, -1));

        jLabel13.setText("Tipo");
        JPanelUsuarios.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jTableRUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableRUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableRUsuarios.setEditingColumn(0);
        jTableRUsuarios.setEditingRow(0);
        jTableRUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jTableRUsuarios.setSelectionBackground(new java.awt.Color(1, 198, 83));
        jTableRUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableRUsuarios);

        JPanelUsuarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 640, 190));

        jPasswordField.setText("jPasswordField1");
        JPanelUsuarios.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 30));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador", " " }));
        JPanelUsuarios.add(jComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 160, 30));

        jLabelAgregar.setBackground(new java.awt.Color(0, 204, 204));
        jLabelAgregar.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregar.setText("Registrar");
        jLabelAgregar.setOpaque(true);
        jLabelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAgregarMouseExited(evt);
            }
        });
        JPanelUsuarios.add(jLabelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, 40));

        jLabelMoficar.setBackground(new java.awt.Color(0, 204, 204));
        jLabelMoficar.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelMoficar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMoficar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMoficar.setText("Modificar");
        jLabelMoficar.setOpaque(true);
        jLabelMoficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMoficarMouseClicked(evt);
            }
        });
        JPanelUsuarios.add(jLabelMoficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 200, 40));

        jLabelEliminar.setBackground(new java.awt.Color(0, 204, 204));
        jLabelEliminar.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminar.setText("Eliminar");
        jLabelEliminar.setOpaque(true);
        jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEliminarMouseClicked(evt);
            }
        });
        JPanelUsuarios.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 190, 40));

        jTextID.setEditable(false);
        jTextID.setBackground(new java.awt.Color(153, 153, 153));
        JPanelUsuarios.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 70, 30));

        jLabel14.setText("ID");
        JPanelUsuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabelActualizar.setBackground(new java.awt.Color(0, 204, 204));
        jLabelActualizar.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        jLabelActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizar.setText("Actualizar");
        jLabelActualizar.setOpaque(true);
        jLabelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarMouseClicked(evt);
            }
        });
        JPanelUsuarios.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 200, 40));

        getContentPane().add(JPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 842, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx;
    int xy;
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
       
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
       MenuAdmin M = new MenuAdmin();
       M.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPaisActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jLabelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseClicked
       if (jTextNombre.getText().equals("") || (jTextApellido.getText().equals("")) || (jTextTelef.getText().equals("")) || (jTextUsuario.getText().equals(""))
           || (jPasswordField.getText().equals("")) || (jComboTipo.getSelectedItem().equals(null)) || (jTextPais.getText().equals("")) || (jTextEmpresa.getText().equals("")) || 
               (jTextEmail.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            jTextNombre.requestFocus();
        }else{
        
        try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO RegistroUsuarios(Id,Nombre,Apellido,Telefono,Usuario,Pass,Pais,Empresa,Email,Tipo) VALUES (?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, jTextID.getText());
        pst.setString(2, jTextNombre.getText());
        pst.setString(3, jTextApellido.getText());
        pst.setString(4, jTextTelef.getText());
        pst.setString(5, jTextUsuario.getText());
        pst.setString(6, jPasswordField.getText());
        pst.setString(7, jTextPais.getText());
        pst.setString(8, jTextEmpresa.getText());
        pst.setString(9,jTextEmail.getText());
        pst.setString(10, jComboTipo.getSelectedItem().toString());
              
      
        pst.executeUpdate();
        mostrardatos("");
        JOptionPane.showMessageDialog(null, "Se Registro Exitosamente!");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "No se puede volver a registrar con el mismo Id \n"
                   + "               Solicite el boton Actualizar");
         System.out.println("no se pudo agregar" + e);
         
        }
       }
    }//GEN-LAST:event_jLabelAgregarMouseClicked

    private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
         
   if (jTextNombre.getText().equals("") || (jTextApellido.getText().equals("")) || (jTextTelef.getText().equals("")) || (jTextUsuario.getText().equals(""))
           || (jPasswordField.getText().equals("")) || (jComboTipo.getSelectedItem().equals(null)) || (jTextPais.getText().equals("")) || (jTextEmpresa.getText().equals("")) || 
               (jTextEmail.getText().equals(""))){
   javax.swing.JOptionPane.showMessageDialog(this, "       Selecione una fila \n","                               AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }else{
   int fila = jTableRUsuarios.getSelectedRow();     
  String cod="";
    cod=jTableRUsuarios.getValueAt(fila, 0).toString();
    
    try {
        PreparedStatement pst = cn.prepareStatement("DELETE  FROM RegistroUsuarios  WHERE  Id='"+cod+"'");
        pst.executeUpdate();
        mostrardatos("");
        Limpiar();
       } catch (SQLException e) { System.out.println("Error ");
          }
   }
    }//GEN-LAST:event_jLabelEliminarMouseClicked

    private void jLabelMoficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMoficarMouseClicked
       if (jTextNombre.getText().equals("") || jTextUsuario.getText().equals("")) {
         
         javax.swing.JOptionPane.showMessageDialog(this,"1-. Consulte el nombre del cliente\n 2-. Actualice el dato deseado en el campo correspondiente","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
     }else{
        try {
        PreparedStatement pst = cn.prepareStatement("UPDATE RegistroUsuarios SET Nombre='"+jTextNombre.getText()+"',Apellido='"+jTextApellido.getText()+"',Telefono='"+jTextTelef.getText()+"',Usuario='"+jTextUsuario.getText()+"',Pass='"+jPasswordField.getText()+"',Pais='"+jTextPais.getText()+"',Empresa='"+jTextEmpresa.getText()+"',Email='"+jTextEmail.getText()+"' ,Tipo='"+jComboTipo.getSelectedItem()+"' WHERE id='"+jTextID.getText()+"'");
        pst.executeUpdate();
        mostrardatos("");
    }catch( SQLException e ) { 
                       System.out.println("no se puedo establecer una conexion con base de datos" + e);
                      e.printStackTrace(); 
                  } 
    }//GEN-LAST:event_jLabelMoficarMouseClicked
    }
    private void jLabelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarMouseClicked
       Actualizar();
       Limpiar();
        id();
    }//GEN-LAST:event_jLabelActualizarMouseClicked

    private void jTableRUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRUsuariosMouseClicked
        jTextID.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(), 0)));
        jTextNombre.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(), 1)));
        jTextApellido.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(), 2)));
        jTextTelef.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),3)));
        jTextUsuario.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),4)));
        jPasswordField.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),5)));
        jTextPais.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),6)));
        jTextEmpresa.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),7)));
        jTextEmail.setText(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),9)));
        jComboTipo.setSelectedItem(String.valueOf(jTableRUsuarios.getValueAt(jTableRUsuarios.getSelectedRow(),8)));
        
    }//GEN-LAST:event_jTableRUsuariosMouseClicked

    private void jLabelAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseEntered
       
    }//GEN-LAST:event_jLabelAgregarMouseEntered

    private void jLabelAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabelAgregarMouseExited

    private void jTextModeloIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextModeloIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextModeloIActionPerformed

    private void jTextEmpresaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmpresaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmpresaIActionPerformed

    private void jTextModeloPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextModeloPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextModeloPActionPerformed

    private void jTextEmpresaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmpresaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmpresaPActionPerformed

    private void jTextModeloRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextModeloRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextModeloRActionPerformed

    private void jTextEmpresaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmpresaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmpresaRActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        JPanelEntered(jPanel1);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        JPanelExited(jPanel1);
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        JPanelPressed(jPanel1);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        UsuariosClicked();
        JPanelEntered(jPanel1);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        JPanelEntered(jPanel3);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        JPanelExited(jPanel3);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        JPanelPressed(jPanel3);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        IngresoCelulares();
        MostrarAgregados();
        JPanelEntered(jPanel3);
        
    }//GEN-LAST:event_jPanel3MouseClicked
 
    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        JPanelEntered(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        JPanelExited(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        JPanelPressed(jPanel4);
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
       PedidoCelulares();
        JPanelEntered(jPanel4);
        MostrarPedidos();
        idP();
        System.out.println("" + g);
        idPTotal();
       
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        JPanelEntered(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        JPanelExited(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        JPanelPressed(jPanel5);
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        TotalPEDIDOS_Ingresos();
        MostrarCantidadCelulares();
        ActualizarModelos();
        JPanelEntered(jPanel5);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabelAgregarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarRMouseClicked
         AgregarCantidadCelulares();
    }//GEN-LAST:event_jLabelAgregarRMouseClicked

    private void jLabelAgregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarPMouseClicked
        // TODO add your handling code here:
       
        AgregarRegistroTPedido();
    }//GEN-LAST:event_jLabelAgregarPMouseClicked

    private void jLabelModificarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarRMouseClicked
        // TODO add your handling code here:
      ModificarModelos();
    }//GEN-LAST:event_jLabelModificarRMouseClicked

    private void jLabelActualizarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarRMouseClicked
        // TODO add your handling code here:
        ActualizarModelos();
    }//GEN-LAST:event_jLabelActualizarRMouseClicked

    private void jLabelEliminarRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarRMouseClicked
        // TODO add your handling code here:
        EliminarModelos();
    }//GEN-LAST:event_jLabelEliminarRMouseClicked

    private void jLabelModificarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarPMouseClicked
        // TODO add your handling code here:
       
        ModificarPedido2();
    }//GEN-LAST:event_jLabelModificarPMouseClicked

    private void jLabelActualizarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarPMouseClicked
        // TODO add your handling code here:
        ActualizarPedido();
        idPTotal();
    }//GEN-LAST:event_jLabelActualizarPMouseClicked

    private void jLabelEliminarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarPMouseClicked
        // TODO add your handling code here:
       
        EliminarTotalP();
        EliminarPedido();
    }//GEN-LAST:event_jLabelEliminarPMouseClicked

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        // TODO add your handling code here:
        LlenarCamposPedido();
    }//GEN-LAST:event_jTablePedidosMouseClicked
  public void jTablePedidosMouseClicked2(java.awt.event.MouseEvent evt) {                                           
       int Cant =Integer.parseInt(String.valueOf(jTablePedidos.getValueAt(jTablePedidos.getSelectedRow(), 2)));
      System.out.println("la cantidad es :" + Cant);
    }   
 
    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
        g = evt.paramString();
        
    }//GEN-LAST:event_headerMouseClicked

    private void jTextIdPTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdPTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdPTotalActionPerformed

    private void jTextCantidadPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadPKeyTyped
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '));
        else{JOptionPane.showMessageDialog(null, "Ingrese solo numeros");}
    }//GEN-LAST:event_jTextCantidadPKeyTyped

    private void jLabelAgregarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarIMouseClicked
        // TODO add your handling code here:
        AgregarRegistroTAgregado();
    }//GEN-LAST:event_jLabelAgregarIMouseClicked

    private void jLabelModificarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarIMouseClicked
        // TODO add your handling code here:
        ModificarAgregado();
    }//GEN-LAST:event_jLabelModificarIMouseClicked

    private void jLabelActualizarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarIMouseClicked
        // TODO add your handling code here:
        ActualizarAgregados();
    }//GEN-LAST:event_jLabelActualizarIMouseClicked

    private void jLabelEliminarIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarIMouseClicked
       EliminarAgregados();
        
    }//GEN-LAST:event_jLabelEliminarIMouseClicked

    private void jTableAgregadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgregadosMouseClicked
        // TODO add your handling code here:
        LlenarCamposAgregados();
    }//GEN-LAST:event_jTableAgregadosMouseClicked

    private void jTableModelosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModelosRegistradosMouseClicked
        LlenarCamposModelos();
    }//GEN-LAST:event_jTableModelosRegistradosMouseClicked

    private void jTextCantidadRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadRKeyTyped
 char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '));
        else{JOptionPane.showMessageDialog(null, "Ingrese solo numeros");}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadRKeyTyped

    private void jTextCantidadIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadIKeyTyped
 char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '));
        else{JOptionPane.showMessageDialog(null, "Ingrese solo numeros");}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadIKeyTyped

    private void jTextIdRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdRActionPerformed
    String g;
    void Limpiar(){
      jTextID.setText("");
      jTextNombre.setText("");
      jTextApellido.setText("");
      jTextTelef.setText("");
      jTextUsuario.setText("");
      jPasswordField.setText("");
      jTextPais.setText("");
      jTextEmpresa.setText("");
      jTextEmail.setText("");
      jComboTipo.setSelectedItem("");
    }
   /* void bloquear()
    {
        jButton1.setVisible(false);
        jButton2.setVisible(false);}
    void desbloquear(){
    jButton1.setVisible(true);
        jButton2.setVisible(true);
    }*/
    // ------------sw{}itch between colors for Active/Inactive color
    public void JPanelEntered(JPanel panel)
    {
        panel.setBackground(new Color(244,123,56));
    }
    public void JPanelExited(JPanel panel)
    {
      panel.setBackground(new Color(0,150,62));
    }
    
    public void JPanelPressed(JPanel panel)
    {
        panel.setBackground(new Color(236,90,10));
    }
      public void setCOLOR(JLabel lbl){
      lbl.setBackground(new Color(0,150,62));
      }
      
     void UsuariosClicked(){
        JPanelUsuarios.setVisible(true);
       jPanelIngresoCelulares.setVisible(false);
       jPanelPedidosCelulares.setVisible(false);
       jPanelControlTCelulares.setVisible(false);
     }
    void IngresoCelulares(){
        JPanelUsuarios.setVisible(false);
       jPanelIngresoCelulares.setVisible(true);
       jPanelPedidosCelulares.setVisible(false);
       jPanelControlTCelulares.setVisible(false);
       
    }
    void PedidoCelulares(){
        JPanelUsuarios.setVisible(false);
       jPanelIngresoCelulares.setVisible(false);
       jPanelPedidosCelulares.setVisible(true);
       jPanelControlTCelulares.setVisible(false);
    }
    void TotalPEDIDOS_Ingresos(){
      jPanelControlTCelulares.setVisible(true);
        JPanelUsuarios.setVisible(false);
       jPanelIngresoCelulares.setVisible(false);
       jPanelPedidosCelulares.setVisible(false);
       
    }
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelUsuarios;
    private javax.swing.JTextField JTextIdI_Static;
    private javax.swing.JTextField JTextIdP_static;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelActualizarI;
    private javax.swing.JLabel jLabelActualizarP;
    private javax.swing.JLabel jLabelActualizarR;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelAgregarI;
    private javax.swing.JLabel jLabelAgregarP;
    private javax.swing.JLabel jLabelAgregarR;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEliminarI;
    private javax.swing.JLabel jLabelEliminarP;
    private javax.swing.JLabel jLabelEliminarR;
    private javax.swing.JLabel jLabelModificarI;
    private javax.swing.JLabel jLabelModificarP;
    private javax.swing.JLabel jLabelModificarR;
    private javax.swing.JLabel jLabelMoficar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelControlTCelulares;
    private javax.swing.JPanel jPanelIngresoCelulares;
    private javax.swing.JPanel jPanelPedidosCelulares;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAgregados;
    private javax.swing.JTable jTableModelosRegistrados;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableRUsuarios;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCantidadI;
    private javax.swing.JTextField jTextCantidadP;
    private javax.swing.JTextField jTextCantidadR;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEmpresa;
    private javax.swing.JTextField jTextEmpresaI;
    private javax.swing.JTextField jTextEmpresaP;
    private javax.swing.JTextField jTextEmpresaR;
    private javax.swing.JTextField jTextFechaI;
    private javax.swing.JTextField jTextFechaP;
    private javax.swing.JTextField jTextFechaR;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextIdI;
    private javax.swing.JTextField jTextIdITotal;
    private javax.swing.JTextField jTextIdP;
    private javax.swing.JTextField jTextIdPTotal;
    private javax.swing.JTextField jTextIdR;
    private javax.swing.JTextField jTextIdR_Static;
    private javax.swing.JTextField jTextModeloI;
    private javax.swing.JTextField jTextModeloP;
    private javax.swing.JTextField jTextModeloR;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPais;
    private javax.swing.JTextField jTextTelef;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
