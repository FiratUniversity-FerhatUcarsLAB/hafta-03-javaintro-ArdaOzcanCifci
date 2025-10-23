
public class SaatDonusturme {

    public static void main(String[] args) {
        
        // Çevrilecek toplam saniye
        int toplamSaniye = 3665;

        // 1 saat = 3600 saniye
        // Saat'i bulmak için 3600'e bölüyoruz
        int saat = toplamSaniye / 3600;

        // Saat'i bulduktan sonra kalan saniyeyi hesaplıyoruz (mod % operatörü)
        int kalanSaniye = toplamSaniye % 3600;

        // 1 dakika = 60 saniye
        // Kalan saniyeyi 60'a bölerek dakikayı buluyoruz
        int dakika = kalanSaniye / 60;

        // Dakikayı bulduktan sonra arta kalan son saniyeyi buluyoruz
        int saniye = kalanSaniye % 60; 

        System.out.println("Girilen Saniye: " + toplamSaniye);
        
        // Sonucu formatlı yazdırma
        // %d : normal tamsayı
        // %02d : tamsayıyı 2 basamaklı yaz, eğer 1 basamaklıysa başına '0' koy
        System.out.printf("Formatlı Sonuç: %d:%02d:%02d\n", saat, dakika, saniye);
    }
}
