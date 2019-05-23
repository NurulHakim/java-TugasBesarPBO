/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Virda
 */
public class EditDaftarJualan extends javax.swing.JFrame {
    
    String Menu;
    int stok,harga;
    /**
     * Creates new form EditDaftarJualan
     */
    public EditDaftarJualan() {
        initComponents();
        tampil();
    }
    private void kosong(){
        jtmenu.setText(null);
        jtstok.setText(null);
        jtharga.setText(null);  
        
    }
    
    
    public void tampil(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Menu");
        model.addColumn("Stok");
        model.addColumn("Harga");
        jTable1.setModel(model);
        
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try {
            koneksi kon = new koneksi();
            kon.getData();
            
            Statement stat = (Statement) kon.getData().createStatement();
            String sql = "Select * from barang";
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()){
                Object[] obj = new Object[3];
                    obj[0] = rs.getString("Nama_menu");
                    obj[1] = rs.getString("Stok");
                    obj[2] = rs.getString("Harga");
                    
                    model.addRow(obj);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbcancel = new javax.swing.JButton();
        jbdel = new javax.swing.JButton();
        jbdone = new javax.swing.JButton();
        jbinsert = new javax.swing.JButton();
        jtharga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbupdate = new javax.swing.JButton();
        jtmenu = new javax.swing.JTextField();
        jtstok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbcancel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/tombol2.jpg"))); // NOI18N
        jbcancel.setText("Cancel");
        jbcancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbcancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 140, 30));

        jbdel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbdel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/tombol2.jpg"))); // NOI18N
        jbdel.setText("- Delete");
        jbdel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbdel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jbdel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdelActionPerformed(evt);
            }
        });
        getContentPane().add(jbdel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 110, 30));

        jbdone.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbdone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/tombol2.jpg"))); // NOI18N
        jbdone.setText("Done");
        jbdone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbdone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdoneActionPerformed(evt);
            }
        });
        getContentPane().add(jbdone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 140, 30));

        jbinsert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbinsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/tombol2.jpg"))); // NOI18N
        jbinsert.setText("+ Tambah Menu");
        jbinsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jbinsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jbinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 110, 30));

        jtharga.setBackground(new java.awt.Color(102, 255, 255));
        jtharga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 200, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/* Edit Menu */");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Harga");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 90, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nama menu ");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 90, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Stok");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 90, 30));

        jbupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/tombol2.jpg"))); // NOI18N
        jbupdate.setText("Edit Menu");
        jbupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jbupdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jbupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, 30));

        jtmenu.setBackground(new java.awt.Color(102, 255, 255));
        jtmenu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jtmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 200, 30));

        jtstok.setBackground(new java.awt.Color(102, 255, 255));
        jtstok.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 200, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Menu", "Stok", "Harga"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorRemoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 590, 80));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GambarPenjual/mmLc2Qs.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, 576));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdelActionPerformed
         
         try {
             koneksi kon = new koneksi();
             kon.getData();
             
            String sql ="delete from barang where Nama_menu ='"+jtmenu.getText()+"'";
            PreparedStatement p = (PreparedStatement) kon.getData().prepareStatement(sql);
            p.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         
         tampil();
         kosong();
    }//GEN-LAST:event_jbdelActionPerformed

    private void jbcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelActionPerformed
         int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda yakin ingin membatalkan nya ?", "Cancel",JOptionPane.YES_NO_OPTION);
         if (selectedOption == JOptionPane.YES_OPTION) {
            dispose();
            Penjual x = new Penjual();
             x.setVisible(true);
         }else{
             EditDaftarJualan X = new EditDaftarJualan();
             X.setVisible(true);

         }
         
         
    }//GEN-LAST:event_jbcancelActionPerformed

    private void jbdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdoneActionPerformed
       
    }//GEN-LAST:event_jbdoneActionPerformed

    private void jbinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinsertActionPerformed
        // Insert (tambah menu)
        try {
            koneksi kon = new koneksi();
            
            String sql = "INSERT INTO barang VALUES ('"+jtmenu.getText()+"','"
                                                    +jtstok.getText()+"','"
                                                    +jtharga.getText()+"')";
            
            PreparedStatement pst=(PreparedStatement) kon.getData().prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil();
        kosong();
    }//GEN-LAST:event_jbinsertActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorRemoved

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        
        String menu =jTable1.getValueAt(baris, 0).toString();
        jtmenu.setText(menu);
        String Stok = jTable1.getValueAt(baris,1).toString();
        jtstok.setText(Stok);
        String Harga = jTable1.getValueAt(baris,2).toString();
        jtharga.setText(Harga);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbupdateActionPerformed
        //Edit atau Update data
        try {
            koneksi kon = new koneksi();
            kon.getData();
            
            String sql ="UPDATE barang SET Stok = '"+jtstok.getText()+
                        "', Harga = '"+jtharga.getText()+
                        "' WHERE Nama_menu = '"+jtmenu.getText()+"'";
            PreparedStatement pst=kon.getData().prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        
        tampil();
        kosong();
    }//GEN-LAST:event_jbupdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDaftarJualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDaftarJualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDaftarJualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDaftarJualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDaftarJualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbcancel;
    private javax.swing.JButton jbdel;
    private javax.swing.JButton jbdone;
    private javax.swing.JButton jbinsert;
    private javax.swing.JButton jbupdate;
    private javax.swing.JTextField jtharga;
    private javax.swing.JTextField jtmenu;
    private javax.swing.JTextField jtstok;
    // End of variables declaration//GEN-END:variables

}
