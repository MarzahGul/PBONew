/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agul270423.view;

/**
 *
 * @author USER
 */
public class FormPengembalian  extends javax.swing.JInternalFrame {
    public FormPengembalian() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTglPinjam = new javax.swing.JTextField();
        cboKodeBuku = new javax.swing.JComboBox();
        cboKodeAnggota = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtTglKembali1 = new javax.swing.JTextField();
        txtTglDikembalikan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTerlambat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setText("Kode Anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 14);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 80, 14);

        jLabel4.setText("Tgl Pinjam");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 80, 14);

        jLabel3.setText("Tgl diKembalikan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 130, 90, 14);

        txtTglPinjam.setText("jTextField1");
        getContentPane().add(txtTglPinjam);
        txtTglPinjam.setBounds(100, 70, 59, 20);

        cboKodeBuku.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKodeBuku);
        cboKodeBuku.setBounds(100, 40, 280, 20);

        cboKodeAnggota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKodeAnggota);
        cboKodeAnggota.setBounds(100, 10, 280, 20);

        jLabel5.setText("Tgl Kembali");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 80, 14);

        txtTglKembali1.setText("jTextField2");
        getContentPane().add(txtTglKembali1);
        txtTglKembali1.setBounds(100, 100, 59, 20);

        txtTglDikembalikan.setText("jTextField1");
        getContentPane().add(txtTglDikembalikan);
        txtTglDikembalikan.setBounds(100, 130, 59, 20);

        jLabel6.setText("Terlambat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 90, 14);

        txtTerlambat.setText("jTextField2");
        getContentPane().add(txtTerlambat);
        txtTerlambat.setBounds(100, 160, 59, 20);

        jLabel7.setText("Denda");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 50, 14);

        txtDenda.setText("jTextField3");
        getContentPane().add(txtDenda);
        txtDenda.setBounds(100, 190, 59, 20);

        jButton1.setText("Cari");
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 70, 51, 23);

        jButton2.setText("Proses");
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 130, 65, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboKodeAnggota;
    private javax.swing.JComboBox cboKodeBuku;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtTerlambat;
    private javax.swing.JTextField txtTglDikembalikan;
    private javax.swing.JTextField txtTglKembali1;
    private javax.swing.JTextField txtTglPinjam;
}
