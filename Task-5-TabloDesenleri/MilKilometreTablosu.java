
public class MilKilometreTablosu {
    public static void main(String[] args) {
        
        // 1 milin kilometre karşılığı
        final double MIL_TO_KM_KATSAYISI = 1.60934;
        
        double kilometre;

        System.out.println("Sabit Mil Değerlerini Kilometreye Çevirme:");
        System.out.println("==========================================");

        // 1 Mil için hesaplama
        kilometre = 1 * MIL_TO_KM_KATSAYISI;
        System.out.println("1 mil = " + kilometre + " kilometre");

        // 5 Mil için hesaplama
        kilometre = 5 * MIL_TO_KM_KATSAYISI;
        System.out.println("5 mil = " + kilometre + " kilometre");
        
        // 10 Mil için hesaplama
        kilometre = 10 * MIL_TO_KM_KATSAYISI;
        System.out.println("10 mil = " + kilometre + " kilometre");
        
        // 20 Mil için hesaplama
        kilometre = 20 * MIL_TO_KM_KATSAYISI;
        System.out.println("20 mil = " + kilometre + " kilometre");
        
        // 50 Mil için hesaplama
        kilometre = 50 * MIL_TO_KM_KATSAYISI;
        System.out.println("50 mil = " + kilometre + " kilometre");
        
        System.out.println("==========================================");
    }
}
