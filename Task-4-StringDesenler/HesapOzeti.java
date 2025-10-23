
public class HesapOzeti {
    public static void main(String[] args) {
        
        System.out.println("===================================");
        System.out.println("       ALIŞVERİŞ LİSTESİ");
        System.out.println("===================================");

        // Başlıklar (aralara boşluk veya virgül koyarak)
        System.out.println("Ürün, Miktar, Fiyat (TL)");
        System.out.println("-----------------------------------");

        // Liste Öğeleri
        // Tüm bilgileri + operatörü ile birleştiriyoruz
        System.out.println("Süt, 1 Litre, 32.50");
        System.out.println("Ekmek, 2 Adet, 15.00");
        System.out.println("Yumurta, 15'li, 75.90");
        System.out.println("Elma, 1 Kg, 28.75");
        System.out.println("Peynir, 500 gr, 110.00");
        
        System.out.println("===================================");

        // Toplam Fiyat
        double toplam = 32.50 + 15.00 + 75.90 + 28.75 + 110.00;
        System.out.println("TOPLAM: " + toplam + " TL");
        System.out.println("===================================");
    }
}
