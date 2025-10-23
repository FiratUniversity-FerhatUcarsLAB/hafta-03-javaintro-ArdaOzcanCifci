
public class VucutKitleIndeksi {

    public static void main(String[] args) {
        
        // Değerleri giriyoruz
        double kilo = 85.0;
        double boyCm = 180.0;
        
        // 1. Adım: Boyu santimetreden metreye çevir (180 cm -> 1.8 m)
        // (100.0'a bölerek ondalıklı sonuç alırız)
        double boyMetre = boyCm / 100.0;
        
        // 2. Adım: VKİ formülünü uygula
        // Kilo / (Boy * Boy)
        // Math.pow(boyMetre, 2) de kullanılabilirdi
        double vki = kilo / (boyMetre * boyMetre); 
        
        // Sonuçları ekrana yazdır
        System.out.println("Boyunuz: " + boyCm + " cm");
        System.out.println("Kilonuz: " + kilo + " kg");
        System.out.println("-------------------------------");
        
        // printf ile sonucu 2 ondalık basamakla sınırlayarak yazdıralım
        System.out.printf("Vücut Kitle İndeksiniz (VKİ): %.2f\n", vki);
    }
}
