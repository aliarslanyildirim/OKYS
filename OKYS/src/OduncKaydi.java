public class OduncKaydi {
    public Kullanici kullanici;
    public KitapKopyası kitapKopyasi;

    public OduncKaydi(Kullanici kullanici, KitapKopyası kitapKopyası) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyası;
    }

    public static void main(String[] args) {
        Kitap k1 = new Kitap("Veri Yapilari", "123456");
        KitapKopyası kopya1 = new KitapKopyası("KOPYA-01", k1);
        Kullanici u1 = new Kullanici("Ahmet", "M01");
        
        OduncKaydi odunc = new OduncKaydi(u1, kopya1);

        System.out.println(odunc.kullanici.ad + " adlı kullanıcı, " + odunc.kitapKopyasi.kitap.kitapAdi + " kitabını ödünç aldı.");
    }
}
    

