public class UcgenAlanHesap {
    public static void main(String[] args) {
        //üçgenin kenar uzunlukları
        double kenar1 = 3;
        double kenar2 = 4;
        double kenar3 = 5;
        double s = (kenar1 + kenar2 + kenar3) / 2; //çevresinin yarısı
        double alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3)); //Alan hesaplama
        System.out.println(" Alan : " + alan ); //Yazdırma
    }
}
