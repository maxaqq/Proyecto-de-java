/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



/**
 *
 * @author ELAR
 */
public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
     void EnteredPanel(JPanel p){
      p.setBackground(new Color(14,127,18));
    }
    void ExitedPanel(JPanel p){
      p.setBackground(new Color(53,69,114));
    }
     void PressedPanel(JPanel p){
      p.setBackground(new Color(7,85,10));
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel13MouseDragged(evt);
            }
        });
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel13MousePressed(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 18, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(53, 69, 114));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/management (1).png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mantenimiento");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 90));

        jPanel6.setBackground(new java.awt.Color(53, 69, 114));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphone.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrar celulares");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 180, 90));

        jPanel7.setBackground(new java.awt.Color(53, 69, 114));
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
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphone (Pedido).png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pedidos de celulares");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 90));

        jPanel8.setBackground(new java.awt.Color(53, 69, 114));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/repair-tools.png"))); // NOI18N
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 70, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Herramientas");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 30));

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 90));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 180, 90));

        jPanel9.setBackground(new java.awt.Color(53, 69, 114));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analytics.png"))); // NOI18N
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 70));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estadisticas");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 90));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 90));

        jPanel10.setBackground(new java.awt.Color(53, 69, 114));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/smartphone (2).png"))); // NOI18N
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 66));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Consultas");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 30));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 180, 90));

        jPanel11.setBackground(new java.awt.Color(53, 69, 114));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ayuda");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help computer icon.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 70));

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 90));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, 90));

        jPanel12.setBackground(new java.awt.Color(53, 69, 114));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Voucher");
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/voucher.png"))); // NOI18N
        jPanel12.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 60));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 180, 90));

        jPanel13.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 880, 310));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/change Smartphones.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 130, 120));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Phones inquiries(124pixeles).png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 120));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Almacen de Remates");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 450, 110));

        jPanel13.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 880, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarMenu.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, 20));

        jPanel13.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 880, 30));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       
        IngresarPrograma I = new IngresarPrograma();
        I.setVisible(true);
        
        this.dispose();
       
        
                
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
       
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        
    }//GEN-LAST:event_jPanel4MousePressed

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
       ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel21.setIcon(A);
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel21.setIcon(c);
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        ImageIcon b = new ImageIcon(getClass().getResource("/imagenes/verdeC.png"));
        jLabel21.setIcon(b);
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel21.setIcon(c);
        
         ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel21.setIcon(A);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
         ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel22.setIcon(A);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
         ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel22.setIcon(c);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
         ImageIcon b = new ImageIcon(getClass().getResource("/imagenes/verdeC.png"));
        jLabel22.setIcon(b);
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       
        ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel22.setIcon(c);
        
         ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel22.setIcon(A);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel24.setIcon(A);
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
         ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel24.setIcon(c);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
         ImageIcon b = new ImageIcon(getClass().getResource("/imagenes/verdeC.png"));
        jLabel24.setIcon(b);
    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
         ImageIcon c = new ImageIcon(getClass().getResource("/imagenes/Azul2.png"));
        jLabel24.setIcon(c);
        
         ImageIcon A = new ImageIcon(getClass().getResource("/imagenes/verde1.png"));
        jLabel24.setIcon(A);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jPanel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
         
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel13MouseDragged

    private void jPanel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel13MousePressed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        EnteredPanel(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        ExitedPanel(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        PressedPanel(jPanel5);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        EnteredPanel(jPanel5);
        Mantenimiento3 M3 = new Mantenimiento3();
        M3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        EnteredPanel(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        ExitedPanel(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        PressedPanel(jPanel6);
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        EnteredPanel(jPanel6);
        RegistrarCelulares RU = new RegistrarCelulares();
        RU.setVisible(true);
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        EnteredPanel(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        ExitedPanel(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        PressedPanel(jPanel7);
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        EnteredPanel(jPanel7);
        PedidosCelulares PC = new PedidosCelulares();
        PC.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        EnteredPanel(jPanel10);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        ExitedPanel(jPanel10);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
        PressedPanel(jPanel10);
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        EnteredPanel(jPanel10);
        CONSULTAS_2 C = new CONSULTAS_2();
        C.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        // TODO add your handling code here:
        EnteredPanel(jPanel12);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited

        ExitedPanel(jPanel12);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        // TODO add your handling code here:
        PressedPanel(jPanel12);
    }//GEN-LAST:event_jPanel12MousePressed

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        EnteredPanel(jPanel12);
        Comprobantes com = new Comprobantes();
        com.setVisible(true);
        
        
    }//GEN-LAST:event_jPanel12MouseClicked
int xMouse;
int yMouse;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
