/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeobj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ONUR
 */
public class SiparişVer extends javax.swing.JFrame {
    int say = 0;
    int say1 = 0;
    int say2 = 0;
    int say3 = 0;
    int say4 = 0;
    int say5 = 0;
    int say6 = 0;
    int say7 = 0;
    int say8 = 0;
    int say9 = 0;
    
    int fiyat=0;
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    DefaultTableModel model;
    Odaİşlemleri odaIşlemleri1 = new Odaİşlemleri();

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //To change body of generated methods, choose Tools | Templates.
    }

    
    public SiparişVer() {
        initComponents();
        model = (DefaultTableModel) siparisTablosu.getModel();
        String sorgu = "Select * From oda";
        odaGoruntule(sorgu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        hamburger_siparis = new javax.swing.JButton();
        kofte_siparis = new javax.swing.JButton();
        tavuk_siparis = new javax.swing.JButton();
        makarna_siparis = new javax.swing.JButton();
        pizza_siparis = new javax.swing.JButton();
        icetea_siparis = new javax.swing.JButton();
        ayran_siparis = new javax.swing.JButton();
        cola_siparis = new javax.swing.JButton();
        yedigun_siparis = new javax.swing.JButton();
        meyvesuyu_siparis = new javax.swing.JButton();
        hamburger_adeti = new javax.swing.JLabel();
        tavuk_adeti = new javax.swing.JLabel();
        makarna_adeti = new javax.swing.JLabel();
        kofte_adeti = new javax.swing.JLabel();
        pizza_adeti = new javax.swing.JLabel();
        ayran_adeti = new javax.swing.JLabel();
        cola_adeti = new javax.swing.JLabel();
        yedigun_adeti = new javax.swing.JLabel();
        meyvesuyu_adeti = new javax.swing.JLabel();
        icetea_adeti = new javax.swing.JLabel();
        siparis_iptal = new javax.swing.JButton();
        siparis_ver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        siparisTablosu = new javax.swing.JTable();
        yiyecek_yazisi = new javax.swing.JLabel();
        icecek_yazisi = new javax.swing.JLabel();
        tutar = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id_alani2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setForeground(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkGradientFocus(1400);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        hamburger_siparis.setText("Hamburger - 15TL");
        hamburger_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburger_siparisActionPerformed(evt);
            }
        });

        kofte_siparis.setText("Köfte Ekmek -15TL");
        kofte_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kofte_siparisActionPerformed(evt);
            }
        });

        tavuk_siparis.setText("Tavuk Döner - 10 TL");
        tavuk_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tavuk_siparisActionPerformed(evt);
            }
        });

        makarna_siparis.setText("Makarna - 8 TL");
        makarna_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makarna_siparisActionPerformed(evt);
            }
        });

        pizza_siparis.setText("Pizza - 15 TL");
        pizza_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_siparisActionPerformed(evt);
            }
        });

        icetea_siparis.setText("Ice Tea - 4 TL");
        icetea_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icetea_siparisActionPerformed(evt);
            }
        });

        ayran_siparis.setText("Ayran - 2 TL");
        ayran_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayran_siparisActionPerformed(evt);
            }
        });

        cola_siparis.setText("Cola - 4 TL");
        cola_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cola_siparisActionPerformed(evt);
            }
        });

        yedigun_siparis.setText("Yedigün - 4 TL");
        yedigun_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yedigun_siparisActionPerformed(evt);
            }
        });

        meyvesuyu_siparis.setText("Meyve Suyu - 3 TL");
        meyvesuyu_siparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meyvesuyu_siparisActionPerformed(evt);
            }
        });

        hamburger_adeti.setForeground(new java.awt.Color(0, 0, 0));
        hamburger_adeti.setText("0");

        tavuk_adeti.setForeground(new java.awt.Color(0, 0, 0));
        tavuk_adeti.setText("0");

        makarna_adeti.setForeground(new java.awt.Color(0, 0, 0));
        makarna_adeti.setText("0");

        kofte_adeti.setForeground(new java.awt.Color(0, 0, 0));
        kofte_adeti.setText("0");

        pizza_adeti.setForeground(new java.awt.Color(0, 0, 0));
        pizza_adeti.setText("0");

        ayran_adeti.setForeground(new java.awt.Color(0, 0, 0));
        ayran_adeti.setText("0");

        cola_adeti.setForeground(new java.awt.Color(0, 0, 0));
        cola_adeti.setText("0");

        yedigun_adeti.setForeground(new java.awt.Color(0, 0, 0));
        yedigun_adeti.setText("0");

        meyvesuyu_adeti.setForeground(new java.awt.Color(0, 0, 0));
        meyvesuyu_adeti.setText("0");

        icetea_adeti.setForeground(new java.awt.Color(0, 0, 0));
        icetea_adeti.setText("0");

        siparis_iptal.setText("KAPAT");
        siparis_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_iptalActionPerformed(evt);
            }
        });

        siparis_ver.setText("SEPETE EKLE");
        siparis_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_verActionPerformed(evt);
            }
        });

        siparisTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Oda Numarası", "Oda Tipi", "Müşteri Adı", "Müşteri Soyadı", "ucret"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        siparisTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siparisTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(siparisTablosu);
        if (siparisTablosu.getColumnModel().getColumnCount() > 0) {
            siparisTablosu.getColumnModel().getColumn(0).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(1).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(2).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(3).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(4).setResizable(false);
            siparisTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        yiyecek_yazisi.setForeground(new java.awt.Color(0, 0, 0));
        yiyecek_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yiyecek_yazisi.setText("YIYECEKLER");

        icecek_yazisi.setForeground(new java.awt.Color(0, 0, 0));
        icecek_yazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icecek_yazisi.setText("ICECEKLER");

        tutar.setForeground(new java.awt.Color(0, 0, 0));

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ara");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(id_alani2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yiyecek_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kofte_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tavuk_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hamburger_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(makarna_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pizza_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hamburger_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tavuk_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makarna_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kofte_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pizza_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yedigun_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meyvesuyu_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cola_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ayran_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icetea_siparis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icecek_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ayran_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icetea_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cola_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yedigun_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(siparis_ver)
                            .addComponent(siparis_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(meyvesuyu_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yiyecek_yazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icecek_yazisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(id_alani2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ayran_siparis)
                            .addComponent(ayran_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(cola_siparis)
                        .addGap(46, 46, 46)
                        .addComponent(yedigun_siparis)
                        .addGap(46, 46, 46)
                        .addComponent(meyvesuyu_siparis)
                        .addGap(46, 46, 46)
                        .addComponent(icetea_siparis))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(hamburger_siparis)
                        .addGap(46, 46, 46)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kofte_siparis)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(tavuk_siparis)
                                .addGap(46, 46, 46)
                                .addComponent(makarna_siparis)
                                .addGap(46, 46, 46)
                                .addComponent(pizza_siparis))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(cola_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(yedigun_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(siparis_ver)
                                .addGap(18, 18, 18)
                                .addComponent(siparis_iptal)
                                .addGap(4, 4, 4)))
                        .addComponent(tutar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meyvesuyu_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(icetea_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(hamburger_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(kofte_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(tavuk_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(makarna_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(pizza_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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

    private void hamburger_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburger_siparisActionPerformed
                                                                           // MÜŞTERİ HER BUTONA BASTIĞINDA İSTEDİĞİ SİPARİŞ ALINDI ADETİ EKRANA BASTIRILDI VE FİYATI GÜNCELLENDİ.
        say++;
        hamburger_adeti.setText(say + " Adet");
        fiyat+=15;
    }//GEN-LAST:event_hamburger_siparisActionPerformed

    private void kofte_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kofte_siparisActionPerformed
       say1++;
       kofte_adeti.setText(say1+" Adet");
       fiyat+=15;
    }//GEN-LAST:event_kofte_siparisActionPerformed

    private void tavuk_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tavuk_siparisActionPerformed
       say2++;
        tavuk_adeti.setText(say2 + " Adet");
        fiyat+=10;
    }//GEN-LAST:event_tavuk_siparisActionPerformed

    private void makarna_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makarna_siparisActionPerformed
        say3++;
        makarna_adeti.setText(say3 + " Adet");
        fiyat+=8;
    }//GEN-LAST:event_makarna_siparisActionPerformed

    private void pizza_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_siparisActionPerformed
      say4++;
        pizza_adeti.setText(say4 + " Adet");
        fiyat+=15;
    }//GEN-LAST:event_pizza_siparisActionPerformed

    private void ayran_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayran_siparisActionPerformed
      say5++;
        ayran_adeti.setText(say5 + " Adet");
        fiyat+=2;
    }//GEN-LAST:event_ayran_siparisActionPerformed

    private void cola_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cola_siparisActionPerformed
    say6++;
        cola_adeti.setText(say6 + " Adet");
        fiyat+=4;
    }//GEN-LAST:event_cola_siparisActionPerformed

    private void yedigun_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yedigun_siparisActionPerformed
        say7++;
        yedigun_adeti.setText(say7 + " Adet");
        fiyat+=4;
    }//GEN-LAST:event_yedigun_siparisActionPerformed

    private void meyvesuyu_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meyvesuyu_siparisActionPerformed
       say8++;
        meyvesuyu_adeti.setText(say8 + " Adet");
        fiyat+=3;
    }//GEN-LAST:event_meyvesuyu_siparisActionPerformed

    private void icetea_siparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icetea_siparisActionPerformed
        say9++;
        icetea_adeti.setText(say9 + " Adet");
        fiyat+=4;
    }//GEN-LAST:event_icetea_siparisActionPerformed

    private void siparis_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_iptalActionPerformed
        dispose();
    }//GEN-LAST:event_siparis_iptalActionPerformed
    
    
    
    
    private void siparis_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_verActionPerformed
       tutar.setText("Toplam Tutar: " + fiyat);                           // SİPARİŞ BİTTİKTEN SONRA BU BUTONLA MÜŞTERİNİN ÖDEMESİ GEREKEN TOPLAM ÜCRET VERİTABANINDA GÜNCELENDİ.
       int selectedRow = siparisTablosu.getSelectedRow();
       int id = (int) model.getValueAt(selectedRow, 0);
       int odaUcreti = (int) model.getValueAt(selectedRow, 5);
       fiyat += odaUcreti;
       
       odaIşlemleri1.ucretGuncelle(id,fiyat);
        
       
        
       
       
        
        
       
       
       
       
    }//GEN-LAST:event_siparis_verActionPerformed
    public void dinamikAra(String ara) {                                                // MÜŞTERİ KENDİ İSMİNİ DAHA KOLAY BULABİLSİN DİYE DİNAMİK ARAMA YAPTIRILDI
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        siparisTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
    
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();                                    // DİNAMİK ARAMA METODU ÇAĞIRILDI
        
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void siparisTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siparisTablosuMouseClicked
       
    }//GEN-LAST:event_siparisTablosuMouseClicked

    /**
     * @param args the command line arguments
     */
     public void odaGoruntule(String sorgu) { // BÜTÜN ODALAR TABLO HALİNDE EKRANA BASTIRILDI.
        model.setRowCount(0);
        
        ArrayList<Oda> odalar = new ArrayList<Oda>();
        
       odalar = odaIşlemleri1.odalariGetir(sorgu);
       
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
            java.util.logging.Logger.getLogger(SiparişVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparişVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparişVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparişVer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparişVer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JLabel ayran_adeti;
    private javax.swing.JButton ayran_siparis;
    private javax.swing.JLabel cola_adeti;
    private javax.swing.JButton cola_siparis;
    private javax.swing.JLabel hamburger_adeti;
    private javax.swing.JButton hamburger_siparis;
    private javax.swing.JLabel icecek_yazisi;
    private javax.swing.JLabel icetea_adeti;
    private javax.swing.JButton icetea_siparis;
    private javax.swing.JLabel id_alani2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel kofte_adeti;
    private javax.swing.JButton kofte_siparis;
    private javax.swing.JLabel makarna_adeti;
    private javax.swing.JButton makarna_siparis;
    private javax.swing.JLabel meyvesuyu_adeti;
    private javax.swing.JButton meyvesuyu_siparis;
    private javax.swing.JLabel pizza_adeti;
    private javax.swing.JButton pizza_siparis;
    private javax.swing.JTable siparisTablosu;
    private javax.swing.JButton siparis_iptal;
    private javax.swing.JButton siparis_ver;
    private javax.swing.JLabel tavuk_adeti;
    private javax.swing.JButton tavuk_siparis;
    private javax.swing.JLabel tutar;
    private javax.swing.JLabel yedigun_adeti;
    private javax.swing.JButton yedigun_siparis;
    private javax.swing.JLabel yiyecek_yazisi;
    // End of variables declaration//GEN-END:variables
}
