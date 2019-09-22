
package projeobj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projeobj.Veritabani.db;
import static projeobj.Veritabani.host;
import static projeobj.Veritabani.kullanici_adi;
import static projeobj.Veritabani.parola;
import static projeobj.Veritabani.port;

/**
 *
 * @author ONUR
 */
public class Müşteriİşlemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Müşteri> musterileriGetir() { // HER BİR MÜŞTERİ VERİ TABANINDAN ALINIP ARAYLİSTE DOLDURULDU.
        
        ArrayList<Müşteri> cikti = new ArrayList<Müşteri>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * From tablo";
        
        ResultSet rs = statement.executeQuery(sorgu);
        
        while(rs.next()) {
            int id = rs.getInt("id");
            String ad = rs.getString("adi");
            String soyad = rs.getString("Soyadi");
            String tc = rs.getString("tc");
            String telefon = rs.getString("telefon");
            
            cikti.add(new Müşteri(id, ad, soyad, tc, telefon));

        }
        
        return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(Müşteriİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
        
        
        
    }
    
    
    
   
    
    
    public void musteriEkle(String ad, String soyad, String tc, String telefon) { // VERİTABANIYLA BAĞLANTI KURULUP ALINAN BİLGİLERİ VERİTABANINA AKTARARAK REZERVASYON İŞLEMİ GERÇEKLEŞTİRİLDİ.
        
        String sorgu = "Insert INTO tablo (adi,soyadi,tc,telefon) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tc);
            preparedStatement.setString(4, telefon);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Müşteriİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    
     public Müşteriİşlemleri () { // VERİ TABANI BAĞLANTISI SAĞLANDI VE BAĞLANTI KONTROL EDİLDİ.
    
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.db+ "?useUnicode=true&characterEncoding=utf8";
        
        
            try { 
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver bulunamadı..");
            }
            
        
        try {
            con = (Connection) DriverManager.getConnection(url, Veritabani.kullanici_adi, Veritabani.parola);
            System.out.println("Bağlantı başarılı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
            
            
            
    }
    
}
