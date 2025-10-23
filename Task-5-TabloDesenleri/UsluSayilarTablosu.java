
public class UsluSayilarTablosu {
    public static void main(String[] args) {
        
        // Başlıklar
        // Sütunları manuel boşluklarla ayırıyoruz
        System.out.println("a   a^2   a^3");
        System.out.println("-----------------");

        // Satırları döngü olmadan, tek tek manuel yazıyoruz
        
        // a = 1
        int a1 = 1;
        // Boşlukları " " + ile ekleyerek birleştiriyoruz
        System.out.println(a1 + "   " + (a1 * a1) + "     " + (a1 * a1 * a1));

        // a = 2
        int a2 = 2;
        System.out.println(a2 + "   " + (a2 * a2) + "     " + (a2 * a2 * a2));
        
        // a = 3
        int a3 = 3;
        // Sayılar 2 basamaklı olmaya başladıkça hizalama kayar
        System.out.println(a3 + "   " + (a3 * a3) + "    " + (a3 * a3 * a3));
        
        // a = 4
        int a4 = 4;
        System.out.println(a4 + "   " + (a4 * a4) + "    " + (a4 * a4 * a4));
        
        // a = 5
        int a5 = 5;
        System.out.println(a5 + "   " + (a5 * a5) + "   " + (a5 * a5 * a5));
    }
}
