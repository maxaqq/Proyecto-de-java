
package Interfaces;

import almacenproductos.CONECTAR;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class CONSULTAS_2 extends javax.swing.JFrame {

    CONECTAR cc = new CONECTAR();
    Connection cn = cc.conexion();
    public CONSULTAS_2() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarUsuarios("");
        JPanelUsuarios();
        
    }
    void SetColor_JPanelEntered(JPanel jpnl){
      jpnl.setBackground(new Color(85,65,118));
    }
    void SetColor_JPanelExited(JPanel jpnl){
        jpnl.setBackground(new Color(79,53,122));
    }
    void SetColor_JPanelPressed(JPanel jpnl){
        jpnl.setBackground(new Color(47,31,75));
    }
    
    void mostrarUsuarios(String valor){
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

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelConsultaTOTAL = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableTotalCelulares = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPaneConsultaAgregados = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAgregados = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanelConsultaPedidos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanelConsultaUsuarios = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(79, 53, 122));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphone5.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Movimientos realizados");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 50));

        jPanel8.setBackground(new java.awt.Color(79, 53, 122));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Consulta de Agregados");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 50));

        jPanel5.setBackground(new java.awt.Color(79, 53, 122));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user (2).png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Consulta de Usuarios");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 50));

        jPanel6.setBackground(new java.awt.Color(79, 53, 122));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphone3.png"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consulta de Pedidos");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        jLabel13.setFont(new java.awt.Font("Serto Urhoy", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consultas");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 40));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 3));
        jPanel9.getAccessibleContext().setAccessibleName("");

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 580));

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Serto Urhoy", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Almacel de Productos_______");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 78));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 680, 110));

        jPanelConsultaTOTAL.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConsultaTOTAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableTotalCelulares.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTableTotalCelulares);

        jPanelConsultaTOTAL.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 524, 293));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanelConsultaTOTAL.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 29));

        jLabel18.setBackground(new java.awt.Color(219, 120, 65));
        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Buscar");
        jLabel18.setOpaque(true);
        jPanelConsultaTOTAL.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 162, 40));

        jLabel19.setText("Ingrese  Modelo____________");
        jPanelConsultaTOTAL.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 20));

        jPanel3.add(jPanelConsultaTOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 680, 450));

        jPaneConsultaAgregados.setBackground(new java.awt.Color(255, 255, 255));
        jPaneConsultaAgregados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(jTableAgregados);

        jPaneConsultaAgregados.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 524, 293));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPaneConsultaAgregados.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 29));

        jLabel16.setBackground(new java.awt.Color(0, 153, 255));
        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar");
        jLabel16.setOpaque(true);
        jPaneConsultaAgregados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 162, 40));

        jLabel17.setText("Ingrese  Modelo____________");
        jPaneConsultaAgregados.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 20));

        jPanel3.add(jPaneConsultaAgregados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 680, 450));

        jPanelConsultaPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConsultaPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(jTablePedidos);

        jPanelConsultaPedidos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 524, 293));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanelConsultaPedidos.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 29));

        jLabel14.setBackground(new java.awt.Color(67, 176, 71));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Buscar");
        jLabel14.setOpaque(true);
        jPanelConsultaPedidos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 162, 40));

        jLabel15.setText("Ingrese  Modelo____________");
        jPanelConsultaPedidos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, 20));

        jPanel3.add(jPanelConsultaPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 680, 450));

        jPanelConsultaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConsultaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jPanelConsultaUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelConsultaUsuariosMouseDragged(evt);
            }
        });
        jPanelConsultaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelConsultaUsuariosMousePressed(evt);
            }
        });
        jPanelConsultaUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelConsultaUsuarios.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 270, 30));

        jLabel8.setBackground(new java.awt.Color(110, 89, 222));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });
        jPanelConsultaUsuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 190, 40));

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usted puede ingresar la fecha para que pueda buscar al usuario que desea encontrar");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelConsultaUsuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 440, 30));

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
        jTableUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jTableUsuarios);

        jPanelConsultaUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 660, 240));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel10);
        jLabel10.setBounds(10, 0, 16, 20);

        jPanelConsultaUsuarios.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 5, 30, 20));

        jPanel3.add(jPanelConsultaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 680, 450));

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-cross.png"))); // NOI18N
        jLabel20.setOpaque(true);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        SetColor_JPanelEntered(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        SetColor_JPanelExited(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        JPanelUsuarios();
        SetColor_JPanelEntered(jPanel5);
        /*MenuAdmin m = new MenuAdmin();
        m.setVisible(true);*/
        
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
      ConsultaPedidos();
        JpanelPedidos();
        SetColor_JPanelEntered(jPanel6);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        SetColor_JPanelEntered(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        SetColor_JPanelPressed(jPanel5);
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        SetColor_JPanelExited(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        SetColor_JPanelPressed(jPanel6);
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
       SetColor_JPanelEntered(jPanel4);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        SetColor_JPanelExited(jPanel4);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
       SetColor_JPanelPressed(jPanel4);
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
      ConsultaPedidosAgregados();
        JpanelTotal();
        SetColor_JPanelEntered(jPanel4);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased

    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        SetColor_BuscarPressed(jLabel8);

    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        SetColor_BuscarExited(jLabel8);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        SetColor_BuscarEntered(jLabel8);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        SetColor_BuscarEntered(jLabel8);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        CancelEntered(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        CancelExited(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        CancelPressed(jPanel7);
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
       this.dispose();
        CancelEntered(jPanel7);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanelConsultaUsuariosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaUsuariosMouseDragged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jPanelConsultaUsuariosMouseDragged

    private void jPanelConsultaUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaUsuariosMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanelConsultaUsuariosMousePressed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        ConsultaAgregados();
        JpanelAgregados();
        SetColor_JPanelEntered(jPanel8);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        SetColor_JPanelEntered(jPanel8);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        SetColor_JPanelExited(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        SetColor_JPanelPressed(jPanel8);
    }//GEN-LAST:event_jPanel8MousePressed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        // TODO add your handling code here:
        CloseEntered(jLabel20);
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        // TODO add your handling code here:
        CloseExited(jLabel20);
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
        // TODO add your handling code here:
        ClosePressed(jLabel20);
    }//GEN-LAST:event_jLabel20MousePressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        
      MenuAdmin M = new MenuAdmin();
      M.setVisible(true);
        CloseEntered(jLabel20);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked
   int xx;
   int yy;
    void CancelEntered(JPanel Jp){
       Jp.setBackground(Color.red);
  
   }
    void CancelExited(JPanel Jp){
       Jp.setBackground(Color.WHITE);
  
   }
     void CancelPressed(JPanel Jp){
       Jp.setBackground(new Color(147,28,28));
  
   }
   
   void CloseEntered(JLabel lbl){
      lbl.setBackground(new Color(255,51,51));
   }
   void CloseExited(JLabel lbl){
      lbl.setBackground(new Color(153,153,153));
   }
   void ClosePressed(JLabel lbl){
      lbl.setBackground(new Color(204,0,0));
   }
   void SetColor_BuscarEntered(JLabel lbl){
      lbl.setBackground(new Color(176,165,234));
   }
   void SetColor_BuscarPressed(JLabel lbl){
      lbl.setBackground(new Color(42,29,116));
   }
   void SetColor_BuscarExited(JLabel lbl){
      lbl.setBackground(new Color(110,89,222));
   }
   void JPanelUsuarios(){
   jPanelConsultaUsuarios.setVisible(true);
   jPanelConsultaPedidos.setVisible(false);
   jPanelConsultaTOTAL.setVisible(false);
   jPaneConsultaAgregados.setVisible(false);
   }
   void JpanelPedidos(){
     jPanelConsultaUsuarios.setVisible(false);
   jPanelConsultaPedidos.setVisible(true);
   jPanelConsultaTOTAL.setVisible(false);
   jPaneConsultaAgregados.setVisible(false);
   }
   void JpanelAgregados(){
     jPanelConsultaUsuarios.setVisible(false);
   jPanelConsultaPedidos.setVisible(false);
   jPanelConsultaTOTAL.setVisible(false);
   jPaneConsultaAgregados.setVisible(true);
   }
   void JpanelTotal(){
     jPanelConsultaUsuarios.setVisible(false);
   jPanelConsultaPedidos.setVisible(false);
   jPanelConsultaTOTAL.setVisible(true);
   jPaneConsultaAgregados.setVisible(false);
   }
   void ConsultaAgregados(){
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
  }
   void ConsultaPedidos (){
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
    
    }
   void ConsultaPedidosAgregados (){
    DefaultTableModel ModeloEMPRES = new DefaultTableModel();
    ModeloEMPRES.addColumn("Id");
    ModeloEMPRES.addColumn("Modelo");
    ModeloEMPRES.addColumn("Cantidad");
    ModeloEMPRES.addColumn("Empresas");
    
    
    jTableTotalCelulares.setModel(ModeloEMPRES);
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
            jTableTotalCelulares.setModel(ModeloEMPRES);
        } catch (Exception e) {
            System.out.println("Error en la conexion" + e);
        }
    
    }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneConsultaAgregados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelConsultaPedidos;
    private javax.swing.JPanel jPanelConsultaTOTAL;
    private javax.swing.JPanel jPanelConsultaUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAgregados;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTable jTableTotalCelulares;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
