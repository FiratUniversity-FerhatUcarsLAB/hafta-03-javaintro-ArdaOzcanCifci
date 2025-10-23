
public class ParaBozma {

    public static void main(String[] args) {
        
        // Başlangıç tutarı
        int tutar = 278;
        int adet; // Banknot adedini tutmak için

        System.out.print(tutar + " TL = ");

        // 100 TL'lik banknot hesabı
        adet = tutar / 100; // 278 / 100 = 2
        tutar = tutar % 100; // 278 % 100 = 78 (kalan)
        System.out.print(adet + "x100");

        // 50 TL'lik banknot hesabı
        adet = tutar / 50; // 78 / 50 = 1
        tutar = tutar % 50; // 78 % 50 = 28 (kalan)
        System.out.print(", " + adet + "x50");

        // 20 TL'lik banknot hesabı
        adet = tutar / 20; // 28 / 20 = 1
        tutar = tutar % 20; // 28 % 20 = 8 (kalan)
        System.out.print(", " + adet + "x20");

        // 5 TL'lik banknot hesabı
        adet = tutar / 5; // 8 / 5 = 1
        tutar = tutar % 5; // 8 % 5 = 3 (kalan)
        System.out.print(", " + adet + "x5");

        // 2 TL'lik para hesabı (Resimdeki mantığa göre)
        adet = tutar / 2; // 3 / 2 = 1
        tutar = tutar % 2; // 3 % 2 = 1 (kalan)
        System.out.print(", " + adet + "x2");
        
        // 1 TL'lik para hesabı
        adet = tutar / 1; // 1 / 1 = 1
        // Son satır olduğu için println kullanıyoruz
        System.out.println(", " + adet + "x1");
    }
}