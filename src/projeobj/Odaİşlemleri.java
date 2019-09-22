
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

/**
 *
 * @author ONUR
 */
public class Odaİşlemleri { //
    
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    

    
    
    public void ucretGuncelle(int id,int ucret) { // PROGRAMDA YAPILAN UCRET HESAPLARI VERİTABANINA AKTARILDI.
        String sorgu = "Update oda set ucret = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
           
            preparedStatement.setInt(1, ucret);
            preparedStatement.setInt(2, id);
            
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Odaİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    public void odaGuncelle(int id, String musteriAdi, String musteriSoyadi,int ucret) {  // REZERVASYON YAPILDIKTAN SONRA ODANIN DURUMU GÜNCELLENEREK VERİTABANINA AKTARILDI.
        String sorgu = "Update oda set musteriAdi = ? , musteriSoyadi = ?, ucret = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, musteriAdi);
            preparedStatement.setString(2, musteriSoyadi);
            preparedStatement.setInt(3, ucret);
            preparedStatement.setInt(4, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Odaİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    public ArrayList<Oda> odalariGetir(String sorgu) { // ODALARIN ANLIK DURUMUNU GÖRMEK İÇİN ODA BİLGİLERİ VERİTABANINDAN ÇEKİLİP ARRAYLİSTE AKTARILDI.
        
        
        
        ArrayList<Oda> cikti = new ArrayList<Oda>();
        
        try {
            statement = con.createStatement();
        
        
        ResultSet rs = statement.executeQuery(sorgu);
        
        while(rs.next()) {
            int id = rs.getInt("id");
            int odaNumarasi = rs.getInt("odaNumarasi");
            String odaTipi = rs.getString("odaTipi");
            String musteriAdi = rs.getString("musteriAdi");
            String musteriSoyadi = rs.getString("musteriSoyadi");
            int ucret = rs.getInt("ucret");
            
            cikti.add(new Oda(id, odaTipi, odaNumarasi, musteriAdi, musteriSoyadi,ucret));

        }
        
        return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(Müşteriİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
        
        
        
    }
    
    
    
    
    public Odaİşlemleri () {                    // VERİ TABANI BAĞLANTISI SAĞLANDI VE BAĞLANTI KONTROL EDİLDİ.
    
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
