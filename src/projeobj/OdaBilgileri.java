
package projeobj;

import java.util.ArrayList;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ONUR
 */
public class OdaBilgileri extends javax.swing.JFrame {
    
     DefaultTableModel model;
    Odaİşlemleri odaIşlemleri = new Odaİşlemleri();

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form OdaBilgileri
     */
    public OdaBilgileri() {
        initComponents();
        model = (DefaultTableModel) oda_tablosu.getModel();
        String sorgu = "Select * From oda";
        odaGoruntule(sorgu);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        cikis_yap = new javax.swing.JButton();
        cikis_yap_yazisi = new javax.swing.JLabel();
        kapat_butonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        oda_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        cikis_yap.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cikis_yap.setText("ÇIKIŞ YAP");
        cikis_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_yapActionPerformed(evt);
            }
        });

        kapat_butonu.setText("Kapat");
        kapat_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapat_butonuActionPerformed(evt);
            }
        });

        oda_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Oda Numarası", "Oda Tipi", "Müşteri Adı", "Müşteri Soyadı", "Ücret"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(oda_tablosu);
        if (oda_tablosu.getColumnModel().getColumnCount() > 0) {
            oda_tablosu.getColumnModel().getColumn(0).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(1).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(2).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(3).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(4).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ODA BİLGİLERİ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cikis_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cikis_yap_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kapat_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cikis_yap, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(cikis_yap_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kapat_butonu)
                        .addGap(11, 11, 11)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikis_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_yapActionPerformed

        String ad = "";                        // TABLODAN MÜŞTERİ SEÇİLİP ÇIKIŞ YAPTIRILDI VE ODANIN BOŞ OLDUĞU GÜNCELLENİP VERİTABANINA AKTARILDI.
        String soyad = "";
        int ucret = 0;
        int selectedRow = oda_tablosu.getSelectedRow();
        int id = (int) model.getValueAt(selectedRow, 0);
        int sonUcret = (int) model.getValueAt(selectedRow, 5);
        
        if(sonUcret==0){
            cikis_yap_yazisi.setText("ODADA ŞUANDA KİMSE KALMAMAKTADIR");
        }
        else{
            odaIşlemleri.odaGuncelle(id,ad,soyad,ucret);
        cikis_yap_yazisi.setText("Çıkış Yapıldı. Toplam Ödemeniz Gereken Ücret: " + sonUcret);
            
        }

        
    }//GEN-LAST:event_cikis_yapActionPerformed

    private void kapat_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapat_butonuActionPerformed
        dispose();
    }//GEN-LAST:event_kapat_butonuActionPerformed

    /**
     * @param args the command line arguments
     */
    public void odaGoruntule(String sorgu) { // DAHA ÖNCE VERİTABANINDAN ÇEKİLİP ARRAYLİSTE DOLDURULAN ODA BİLGİLERİ TABLOYA AKTARILDI.
        model.setRowCount(0);
        
        ArrayList<Oda> odalar = new ArrayList<Oda>();
        
       odalar = odaIşlemleri.odalariGetir(sorgu);
       
       if(odalar !=null) {
           
           for(Oda oda : odalar) {
           
               Object[] eklenecek = {oda.getId(),oda.getOdaNumarasi(),oda.getOdaTipi(),oda.getMusteriAdi(),oda.getMusteriSoyadi(),oda.getUcret()};
               model.addRow(eklenecek);
           
           }
           
           

       }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(OdaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdaBilgileri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdaBilgileri().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis_yap;
    private javax.swing.JLabel cikis_yap_yazisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton kapat_butonu;
    private javax.swing.JTable oda_tablosu;
    // End of variables declaration//GEN-END:variables
}
