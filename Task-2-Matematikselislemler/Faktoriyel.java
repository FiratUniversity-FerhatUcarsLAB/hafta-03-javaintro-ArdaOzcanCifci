public class Faktoriyel {
    public static void main(String[] args){
        int sayi = 5;
        System.out.println(sayi + "! (Faktöriyel) Hesaplaması");
        System.out.println("===================================");
        
        // 5! = 5 * 4 * 3 * 2 * 1

        // Adım adım hesaplama
        
        // 1. Adım (Sayı 5)
        long sonuc = 5;
        System.out.println("Adım 1 (Sayı): " + sonuc);

        // 2. Adım (5 * 4)
        long oncekiSonuc1 = sonuc;
        sonuc = sonuc * 4;
        System.out.println("Adım 2 (" + oncekiSonuc1 + " * 4): " + sonuc);

        // 3. Adım (20 * 3)
        long oncekiSonuc2 = sonuc;
        sonuc = sonuc * 3;
        System.out.println("Adım 3 (" + oncekiSonuc2 + " * 3): " + sonuc);

        // 4. Adım (60 * 2)
        long oncekiSonuc3 = sonuc;
        sonuc = sonuc * 2;
        System.out.println("Adım 4 (" + oncekiSonuc3 + " * 2): " + sonuc);

        // 5. Adım (120 * 1)
        long oncekiSonuc4 = sonuc;
        sonuc = sonuc * 1;
        System.out.println("Adım 5 (" + oncekiSonuc4 + " * 1): " + sonuc);
        
        System.out.println("===================================");
        System.out.println("Sonuç: 5! = " + sonuc);
    }
}
