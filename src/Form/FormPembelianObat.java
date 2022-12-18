/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import koneksi.Rumahsakit;

/**
 *
 * @author Acer
 */
public class FormPembelianObat extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormPembelianObat
     */
    public FormPembelianObat() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtKdPembeli = new javax.swing.JTextField();
        TxtTgl = new com.toedter.calendar.JDateChooser();
        TxtKdObat = new javax.swing.JTextField();
        TxtKetObat = new javax.swing.JTextField();
        TxtNamaObat = new javax.swing.JTextField();
        TxtJBeli = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        TxtTotalHarga = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        BtnSave = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtKdPasien = new javax.swing.JTextField();
        TxtNamaPasien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtKdDokter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtNamaDokter = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblObat = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PEMBELIAN OBAT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Kode Pembelian");

        jLabel3.setText("Tanggal Pembelian");

        jLabel4.setText("Kode Obat");

        jLabel5.setText("Ket. Obat");

        jLabel8.setText("Nama Obat");

        jLabel11.setText("Jumlah Beli");

        jLabel12.setText("Harga");

        jLabel13.setText("Total Harga");

        TxtKdObat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKdObatCaretUpdate(evt);
            }
        });

        TxtNamaObat.setEditable(false);

        TxtJBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtJBeliKeyReleased(evt);
            }
        });

        TxtHarga.setEditable(false);

        TxtTotalHarga.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(TxtJBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(52, 52, 52)
                                .addComponent(TxtTotalHarga))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtKetObat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtKdObat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(TxtKdPembeli, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNamaObat, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtKdPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TxtKdObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TxtKetObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtNamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtJBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        BtnCancel.setText("Cancel");

        BtnDelete.setText("Delete");

        BtnClose.setText("Close");

        jLabel6.setText("Kode Pasien");

        TxtKdPasien.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKdPasienCaretUpdate(evt);
            }
        });

        TxtNamaPasien.setEditable(false);
        TxtNamaPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaPasienActionPerformed(evt);
            }
        });

        jLabel10.setText("Nama Pasien");

        jLabel7.setText("Kode Dokter");

        TxtKdDokter.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtKdDokterCaretUpdate(evt);
            }
        });

        jLabel9.setText("Nama Dokter");

        TxtNamaDokter.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(TxtKdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(31, 31, 31)
                                    .addComponent(TxtNamaDokter)
                                    .addGap(36, 36, 36))
                                .addComponent(jLabel10)
                                .addComponent(jLabel7)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtnDelete)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtnClose)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(TxtKdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtKdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtKdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSave)
                    .addComponent(BtnCancel)
                    .addComponent(BtnDelete)
                    .addComponent(BtnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TblObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pembelian", "Tanggal Pembelian", "Nama Obat", "Keterangan", "Nama Dokter", "Nama Pasien", "Jumlah Beli", "Total"
            }
        ));
        jScrollPane2.setViewportView(TblObat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNamaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaPasienActionPerformed

    private void TxtKdDokterCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKdDokterCaretUpdate
        // TODO add your handling code here:
        try {
            Connection c=Rumahsakit.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from form_dokter where kode_dokter ='" + this.TxtKdDokter.getText()+"'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()){
                this.TxtNamaDokter.setText(r.getString("nama_dokter"));                
        }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi kesalahan"+e);
        }
    }//GEN-LAST:event_TxtKdDokterCaretUpdate

    private void TxtKdObatCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKdObatCaretUpdate
        // TODO add your handling code here:
        try {
            Connection c=Rumahsakit.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from obat where kode_obat ='" + this.TxtKdObat.getText()+"'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()){
                this.TxtNamaObat.setText(r.getString("nama_obat"));  
                this.TxtKetObat.setText(r.getString("ket")); 
                this.TxtHarga.setText(r.getString("harga"));
        }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi kesalahan"+e);
        }
    }//GEN-LAST:event_TxtKdObatCaretUpdate

    private void TxtKdPasienCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtKdPasienCaretUpdate
        // TODO add your handling code here:
         try {
            Connection c=Rumahsakit.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select * from form_pasien where kode_pasien ='" + this.TxtKdPasien.getText()+"'";
            ResultSet r=s.executeQuery(sql);
            while (r.next()){
                this.TxtNamaPasien.setText(r.getString("nama_pasien"));  
        }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("Terjadi kesalahan"+e);
        }
    }//GEN-LAST:event_TxtKdPasienCaretUpdate

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        // TODO add your handling code here:
        int saham1=0;
	java.util.Date tgl_pembelain=(java.util.Date) this.TxtTgl.getDate();
	String id=this.TxtKdPembeli.getText();
        String nama_obat=this.TxtNamaObat.getText();
        String ket_obat=this.TxtKetObat.getText();
        String nama_pasien=this.TxtNamaPasien.getText();
        String nama_dokter=this.TxtNamaDokter.getText();
        String qty=this.TxtJBeli.getText();
        String harga=this.TxtHarga.getText();
        String total=this.TxtTotalHarga.getText();
        
        if(TxtKdObat.getText().isEmpty())
	JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Obat Tidak Boleh Kosong");
        
        	if(TxtKdPembeli.getText().isEmpty()){
	JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Pembelian Tidak Boleh Kosong");
	}
	else{
	if (TxtKdPasien.getText().isEmpty())
	{
		JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Pasien Tidak Boleh Kosong");
	}
	else{
	if (TxtKdDokter.getText().isEmpty())
	{
	JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Kode Dokter Tidak Boleh Kosong");
	}
	else{
	if (TxtHarga.getText().isEmpty())
	{
	JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Harga Tidak Boleh Kosong");
	}



	else{
       try {
			Connection c=Rumahsakit.getkoneksi();
			String sql ="Insert into transaksi values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement p=(PreparedStatement) c.prepareStatement(sql);
			p.setString(1, id);
			p.setDate(2, new java.sql.Date(tgl_pembelain.getTime()));
			p.setString(3, nama_pasien);
			p.setString(4, nama_dokter);
			p.setString(5, nama_obat);
			p.setString(6, ket_obat);
                        p.setString(7, harga);
                        p.setString(8, qty);
                        p.setString(9, total);
			p.executeUpdate();
			p.close();
			JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
	}catch(SQLException e) {
		System.out.println(e);
        }finally{
}}}} try {
            Connection c=Rumahsakit.getkoneksi();
            Statement s= c.createStatement();
            String sql="select * from transaksi";
            ResultSet r=s.executeQuery(sql);
            TblObat.setModel(DbUtils.resultSetToTableModel(r));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);}
                }
        
	
	
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtJBeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtJBeliKeyReleased
        // TODO add your handling code here:
        int total;
        int jumlah =  Integer.parseInt(TxtJBeli.getText());
        int harga =  Integer.parseInt(TxtHarga.getText());
        total = jumlah * harga;
        
            TxtTotalHarga.setText(String.valueOf(total));
    }//GEN-LAST:event_TxtJBeliKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSave;
    private javax.swing.JTable TblObat;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtJBeli;
    private javax.swing.JTextField TxtKdDokter;
    private javax.swing.JTextField TxtKdObat;
    private javax.swing.JTextField TxtKdPasien;
    private javax.swing.JTextField TxtKdPembeli;
    private javax.swing.JTextField TxtKetObat;
    private javax.swing.JTextField TxtNamaDokter;
    private javax.swing.JTextField TxtNamaObat;
    private javax.swing.JTextField TxtNamaPasien;
    private com.toedter.calendar.JDateChooser TxtTgl;
    private javax.swing.JTextField TxtTotalHarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}