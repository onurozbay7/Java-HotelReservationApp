
package projeobj;

/**
 *
 * @author ONUR
 */
public class Oda { // ODA BİLGİLERİ İÇİN NESNE OLUŞTURULDU GEREKLİ YAPICI METODLAR VE GETTER-SETTER'LAR OLUŞTURULDU.
    private int id;
    private int odaNumarasi;
    private String odaTipi;
    private String musteriAdi;
    private String musteriSoyadi;
    private int ucret;
    

    public Oda(int id ,String odaTipi, int odaNumarasi, String musteriAdi, String musteriSoyadi, int ucret) {
        this.odaTipi = odaTipi;
        this.id = id;
        this.odaNumarasi = odaNumarasi;
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.ucret = ucret;
        
    }


    public String getOdaTipi() {
        return odaTipi;
    }

    public void setOdaTipi(String odaTipi) {
        this.odaTipi = odaTipi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public void setOdaNumarasi(int odaNumarasi) {
        this.odaNumarasi = odaNumarasi;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }
    
    
    
}
