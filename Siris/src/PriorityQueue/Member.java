/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

import Heaps.Heap;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 62852
 */
public class Member extends javax.swing.JFrame {
    
    int x=0,nomer=1;
    /**
     * Creates new form Member
     */
    Statement stm;
    public Member() throws SQLException {
        koneksi con = new koneksi();
        stm = (Statement) con.getConnection().createStatement();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtUmur = new javax.swing.JTextField();
        txtTelpon = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        cbJk = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMember = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Input Data Member");

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alamat");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIK");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Umur");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No. Telefon");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jenis Kelamin");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtUmur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUmurActionPerformed(evt);
            }
        });

        txtTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelponActionPerformed(evt);
            }
        });

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        cbJk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan", "Lainnya" }));

        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama", "Umur", "Jenis Kelamin", "No.Telepon", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelMember);
        if (tabelMember.getColumnModel().getColumnCount() > 0) {
            tabelMember.getColumnModel().getColumn(0).setResizable(false);
            tabelMember.getColumnModel().getColumn(1).setResizable(false);
            tabelMember.getColumnModel().getColumn(2).setResizable(false);
            tabelMember.getColumnModel().getColumn(3).setResizable(false);
            tabelMember.getColumnModel().getColumn(4).setResizable(false);
            tabelMember.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");

        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data Baru ");

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNama)
                    .addComponent(txtUmur, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txtTelpon, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(cbJk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNik))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(455, 455, 455)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbJk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(329, 329, 329))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtUmurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUmurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUmurActionPerformed

    private void txtTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelponActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Heaps.Heap heaps = new Heaps.Heap(1);
        add(heaps);
        tampil(heaps);
        resetInputan();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    public void add(Heap heaps){
        int nik = Integer.parseInt(txtNik.getText());
        String nama = txtNama.getText();
        int umur = Integer.parseInt(txtUmur.getText());
        String jk = (String) cbJk.getSelectedItem();
        String telpon = txtTelpon.getText();
        String alamat = txtAlamat.getText();
        heaps.insert(nik,nama,umur,jk,telpon,alamat);
        heaps.displayHeapDua();
        
        String query = "INSERT INTO data_pasien VALUES ("+nik+",'"+nama+"',"+umur+",'"+jk+"',"+"'"+telpon+"',"+"'"+alamat+"')";
        JOptionPane.showMessageDialog(null,"Input Data Berhasil");
        try {
            stm.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    public void tampil(Heap heaps){
        tabelMember.setValueAt(nomer++, x, 0);
        tabelMember.setValueAt(heaps.getData().getNama(), x, 1);
        tabelMember.setValueAt(heaps.getData().getUmur(), x, 2);
        tabelMember.setValueAt(heaps.getData().getJk(), x, 3);
        tabelMember.setValueAt(heaps.getData().getTelpon(), x,4);
        tabelMember.setValueAt(heaps.getData().getAlamat(), x, 5);
        x++;
    }
    
    public void resetInputan(){
        txtNama.setText("");
        txtUmur.setText("");
        cbJk.setSelectedIndex(0);
        txtTelpon.setText("");
        txtAlamat.setText("");
    }
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Member().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMember;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTelpon;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
