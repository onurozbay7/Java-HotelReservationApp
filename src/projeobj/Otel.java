
package projeobj;

/**
 *
 * @author ONUR
 */
public class Otel {                  // OTEL BİLGİLERİ İÇİN NESNE OLUŞTURULDU GEREKLİ YAPICI METODLAR VE GETTER-SETTER'LAR OLUŞTURULDU.
    
    private String otelAdresi;
    private String otelSahibi;
    private String otelBilgileri;

    public Otel(String otelAdresi, String otelSahibi, String otelBilgileri) {
        this.otelAdresi = otelAdresi;
        this.otelSahibi = otelSahibi;
        this.otelBilgileri = otelBilgileri;
    }

    public String getOtelAdresi() {
        return otelAdresi;
    }

    public void setOtelAdresi(String otelAdresi) {
        this.otelAdresi = otelAdresi;
    }

    public String getOtelSahibi() {
        return otelSahibi;
    }

    public void setOtelSahibi(String otelSahibi) {
        this.otelSahibi = otelSahibi;
    }

    public String getOtelBilgileri() {
        return otelBilgileri;
    }

    public void setOtelBilgileri(String otelBilgileri) {
        this.otelBilgileri = otelBilgileri;
    }
    
    
    
}
