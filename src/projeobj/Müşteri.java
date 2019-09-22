
package projeobj;

/**
 *
 * @author ONUR
 */
public class Müşteri {                  // MÜŞTERİ İŞLEMLERİ VE MÜŞTERİ BİLGİLERİ İÇİN NESNE OLUŞTURULDU GEREKLİ YAPICI METODLAR VE GETTER-SETTER'LAR OLUŞTURULDU.
    
    
    private int id;
    private String musteriAdi;
    private String musteriSoyadi;
    private String musteriTc;
    private String musteriTelefon;

    public Müşteri(int id, String musteriAdi, String musteriSoyadi, String musteriTc, String musteriTelefon) {
        this.id = id;
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriTc = musteriTc;
        this.musteriTelefon = musteriTelefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMusteriTc() {
        return musteriTc;
    }

    public void setMusteriTc(String musteriTc) {
        this.musteriTc = musteriTc;
    }

    public String getMusteriTelefon() {
        return musteriTelefon;
    }

    public void setMusteriTelefon(String musteriTelefon) {
        this.musteriTelefon = musteriTelefon;
    }
    
    
    
}
