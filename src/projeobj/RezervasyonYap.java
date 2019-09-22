
package projeobj;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ONUR
 */
public class RezervasyonYap extends javax.swing.JFrame {
    
    
    
    
    
    Müşteriİşlemleri musteriİşlemleri = new Müşteriİşlemleri();
    Odaİşlemleri odaİşlemleri = new Odaİşlemleri();
    DefaultTableModel model;
    

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * Creates new form RezervasyonYap
     */
    public RezervasyonYap() {
        initComponents();
        model = (DefaultTableModel) oda_tablosu.getModel();
        oda_tablosu_alani.setVisible(false);
        musteri_kayit_alani.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        oda_tipi_alani = new javax.swing.JComboBox();
        odalari_getir = new javax.swing.JButton();
        oda_tablosu_alani = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oda_tablosu = new javax.swing.JTable();
        mesaj_yazisi = new javax.swing.JLabel();
        musteri_kayit_alani = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tc_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefon_alani = new javax.swing.JTextField();
        musteri_bilgisi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        yetiskin_sayisi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cocuk_sayisi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        gun_sayisi = new javax.swing.JTextField();
        fiyatGoster = new javax.swing.JLabel();
        kapat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(1200);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jPanel1.setOpaque(false);

        jLabel5.setText("Oda Tipi:");

        oda_tipi_alani.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ekonomik", "Normal", "Kral Dairesi" }));

        odalari_getir.setText("Uygun Odaları Göster");
        odalari_getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odalari_getirActionPerformed(evt);
            }
        });

        oda_tablosu_alani.setOpaque(false);

        oda_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Oda Numarası", "Oda Tipi", "Müşteri Adı", "Müşteri Soyadı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        oda_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oda_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(oda_tablosu);
        if (oda_tablosu.getColumnModel().getColumnCount() > 0) {
            oda_tablosu.getColumnModel().getColumn(0).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(1).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(2).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(3).setResizable(false);
            oda_tablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout oda_tablosu_alaniLayout = new javax.swing.GroupLayout(oda_tablosu_alani);
        oda_tablosu_alani.setLayout(oda_tablosu_alaniLayout);
        oda_tablosu_alaniLayout.setHorizontalGroup(
            oda_tablosu_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oda_tablosu_alaniLayout.createSequentialGroup()
                .addGroup(oda_tablosu_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oda_tablosu_alaniLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(oda_tablosu_alaniLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        oda_tablosu_alaniLayout.setVerticalGroup(
            oda_tablosu_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oda_tablosu_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(oda_tablosu_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(oda_tipi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(odalari_getir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oda_tipi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(odalari_getir)))
                .addGap(50, 50, 50)
                .addComponent(oda_tablosu_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        musteri_kayit_alani.setToolTipText("");
        musteri_kayit_alani.setOpaque(false);

        jLabel1.setText("Ad:");

        soyad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyad_alaniActionPerformed(evt);
            }
        });

        jLabel4.setText("Soyad:");

        jLabel2.setText("Tc:");

        jLabel3.setText("Telefon:");

        musteri_bilgisi.setText("Rezervasyon Yap");
        musteri_bilgisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_bilgisiActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Kalacak Kişi Sayısı");

        jLabel8.setText("Yetişkin:");

        jLabel9.setText("Çocuk(0-12)");

        jLabel10.setText("Kalınacak Gün Sayısı:");

        fiyatGoster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        kapat.setText("Kapat");
        kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapatActionPerformed(evt);
            }
        });

        jLabel11.setText("%50 Indirim");

        javax.swing.GroupLayout musteri_kayit_alaniLayout = new javax.swing.GroupLayout(musteri_kayit_alani);
        musteri_kayit_alani.setLayout(musteri_kayit_alaniLayout);
        musteri_kayit_alaniLayout.setHorizontalGroup(
            musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musteri_kayit_alaniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gun_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                        .addComponent(fiyatGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kapat)
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yetiskin_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cocuk_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tc_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefon_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(musteri_bilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        musteri_kayit_alaniLayout.setVerticalGroup(
            musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tc_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefon_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yetiskin_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cocuk_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gun_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(musteri_bilgisi)
                .addGroup(musteri_kayit_alaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(musteri_kayit_alaniLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fiyatGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, musteri_kayit_alaniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(kapat)
                        .addGap(67, 67, 67))))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteri_kayit_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteri_kayit_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void musteri_bilgisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_bilgisiActionPerformed
        String ad = ad_alani.getText();                             // KULLANICIDAN ALINAN BİLGİLER DEĞİŞKENLERE ATANDI.
        String soyad = soyad_alani.getText();
        String tc = tc_alani.getText();
        String telefon = telefon_alani.getText();
        int yetiskin = Integer.parseInt(yetiskin_sayisi.getText());
        int cocuk = Integer.parseInt(cocuk_sayisi.getText());
        int gun = Integer.parseInt(gun_sayisi.getText());
        int odaUcreti = 0;
        int ucret;
        String oda_tipi =oda_tipi_alani.getSelectedItem().toString(); // KULLANICIDAN BİR TERCİH İSTENDİ VE O TERCİHE GÖRE UCRETLENDİRİLME YAPILDI.
        if(oda_tipi.equals("Ekonomik")) {
            odaUcreti = 100;
        }
        else if (oda_tipi.equals("Normal")) {
            odaUcreti = 200;
        }
        
        else if (oda_tipi.equals("Kral Dairesi")){
            odaUcreti = 300;
        }
        
        if (cocuk == 0) {
            ucret = odaUcreti*gun*yetiskin;
        }
        else {
            ucret = (odaUcreti*gun*yetiskin) + ((odaUcreti*gun*cocuk)*50/100);
        }        
        
        
        musteriİşlemleri.musteriEkle(ad, soyad, tc, telefon); // REZERVASYON YAPILIP VERİTABANINA AKTARILMASI İÇİN MUSTERİ İSLEMLERİ CLASSINDAN BİR NESNE OLUŞTURULUP EKLE METODU ÇAĞIRILDI.
        
        int selectedRow = oda_tablosu.getSelectedRow();
        
        if(selectedRow == -1) {
            if(model.getRowCount()==0) {
                mesaj_yazisi.setText("Şuanda uygun oda bulunmamaktadır..");
            
            
            }
            else {
                mesaj_yazisi.setText("Lütfen kalmak istediğiniz odayı seçiniz..");
                
            }
        
        
        }
        else{
            int id = (int) model.getValueAt(selectedRow, 0);
            odaİşlemleri.odaGuncelle(id,ad,soyad,ucret);
            
            
        }
        
        fiyatGoster.setText("Rezervasyonunuz Yapılmıştır. Toplam Fiyat: "+ucret);
        
        
        
         
    }//GEN-LAST:event_musteri_bilgisiActionPerformed

    private void soyad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyad_alaniActionPerformed

    private void odalari_getirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odalari_getirActionPerformed
        
        mesaj_yazisi.setText("LUTFEN KALMAK ISTEDIGINIZ ODAYI SECINIZ"); // MÜŞTERİ TERCİHİNE GÖRE BOŞ OLAN ODALAR EKRANA YAZDIRILDI.
        String oda_tipi =oda_tipi_alani.getSelectedItem().toString();
        String sorgu = null;
        if(oda_tipi.equals("Ekonomik")) {
        sorgu = "Select * From oda where oda.odaTipi = 'Ekonomik' && oda.musteriAdi = '' ";
       
        
        }
        else if(oda_tipi.equals("Normal")) {
         sorgu = "Select * From oda where oda.odaTipi = 'Normal' && oda.musteriAdi='' " ;
         
        
        }
        else if(oda_tipi.equals("Kral Dairesi")){
         sorgu = "Select * From oda where oda.odaTipi = 'Kral Dairesi' && oda.musteriAdi=''" ;
         
        
        }
        
        else {
            
            System.out.println("Bu tipte boş odamız kalmamıştır.");
            sorgu = "Select * From oda";
        
        
        
        }
        
        odaGoruntule(sorgu);
        oda_tablosu_alani.setVisible(true);
        
        
    }//GEN-LAST:event_odalari_getirActionPerformed

    private void oda_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oda_tablosuMouseClicked
     
        musteri_kayit_alani.setVisible(true);                     // TABLODAN BİR ODA SEÇİLİP REZERVASYON İÇİN BİLGİ İŞLEMLERİNE GEÇİLDİ.
        int selectedrow = oda_tablosu.getSelectedRow();
        ad_alani.setText(model.getValueAt(selectedrow, 3).toString());
        soyad_alani.setText(model.getValueAt(selectedrow, 4).toString());
     
     
    }//GEN-LAST:event_oda_tablosuMouseClicked

    private void kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapatActionPerformed
        dispose();
    }//GEN-LAST:event_kapatActionPerformed

    /**
     * @param args the command line arguments
     */
    public void odaGoruntule(String sorgu) { // ODALAR EKRANA TABLO HALİNDE BASTIRILDI.
        model.setRowCount(0);
        
        ArrayList<Oda> odalar = new ArrayList<Oda>(); 
        
       odalar = odaİşlemleri.odalariGetir(sorgu);
       
       if(odalar !=null) {
           
           for(Oda oda : odalar) {
           
               Object[] eklenecek = {oda.getId(),oda.getOdaNumarasi(),oda.getOdaTipi(),oda.getMusteriAdi(),oda.getMusteriSoyadi()};
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
            java.util.logging.Logger.getLogger(RezervasyonYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezervasyonYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezervasyonYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezervasyonYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezervasyonYap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField cocuk_sayisi;
    private javax.swing.JLabel fiyatGoster;
    private javax.swing.JTextField gun_sayisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton kapat;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton musteri_bilgisi;
    private javax.swing.JPanel musteri_kayit_alani;
    private javax.swing.JTable oda_tablosu;
    private javax.swing.JPanel oda_tablosu_alani;
    private javax.swing.JComboBox oda_tipi_alani;
    private javax.swing.JButton odalari_getir;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JTextField tc_alani;
    private javax.swing.JTextField telefon_alani;
    private javax.swing.JTextField yetiskin_sayisi;
    // End of variables declaration//GEN-END:variables
}
