/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nita
 */
public class LATIHAN2LANJUTAN extends javax.swing.JFrame {

    /**
     * Creates new form LATIHAN2LANJUTAN
     */
    public LATIHAN2LANJUTAN() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        sekolah = new javax.swing.JTextField();
        kelas = new javax.swing.JComboBox<>();
        alamat = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setText("SEKOLAH");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 180, 90, 40);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel2.setText("TABEL BIODATA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 10, 220, 40);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setText("NAMA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 80, 50, 40);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setText("KELAS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 110, 50, 40);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setText("ALAMAT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 140, 90, 40);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama);
        nama.setBounds(130, 80, 180, 30);
        jPanel1.add(sekolah);
        sekolah.setBounds(130, 190, 180, 30);

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7" }));
        kelas.setToolTipText("");
        jPanel1.add(kelas);
        kelas.setBounds(130, 120, 80, 20);
        jPanel1.add(alamat);
        alamat.setBounds(130, 150, 180, 30);

        keluar.setText("EXIT");
        jPanel1.add(keluar);
        keluar.setBounds(210, 250, 90, 23);

        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1);
        add1.setBounds(90, 250, 80, 23);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kelas", "Sekolah", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 380, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        String Nama = nama.getText();
        String Kelas = kelas.getSelectedItem().toString();
        String Alamat = alamat.getText();
        String Sekolah = sekolah.getText();
        
        //unutk combobox
        if(kelas.getSelectedItem()== "x RPL 1"){          
        }
        if(kelas.getSelectedItem()== "x RPL 2") {            
        }
        if(kelas.getSelectedItem()== "x RPL 3")
        
        if(kelas.getSelectedItem()== "x RPL 4") {
        }
        if(kelas.getSelectedItem()== "x RPL 5") {          
        }
        if(kelas.getSelectedItem()== "x RPL 6") {
        }
        if(kelas.getSelectedItem()== "x RPL 7") ;

        //untuk tabel
        DefaultTableModel model = (DefaultTableModel)tabel.getModel();
        model.addRow (new Object[]{nama.getText(),
            kelas.getSelectedItem(),alamat.getText(),
            sekolah.getText()});
        
            
    }//GEN-LAST:event_add1ActionPerformed

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
            java.util.logging.Logger.getLogger(LATIHAN2LANJUTAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LATIHAN2LANJUTAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LATIHAN2LANJUTAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LATIHAN2LANJUTAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LATIHAN2LANJUTAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField sekolah;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
