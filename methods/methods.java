package methods;

public class methods {
    public static void main(String[] args) {
        isimYazdirma("Mehmet");
        sayiYazdırma(12);
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak = 6;
        boolean isThere = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                isThere = true;
                break;
            }
        }
        if (isThere) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }

    }

    public static void isimYazdirma(String args) {
        System.out.println("Adınız : " + args);
    }

    public static void sayiYazdırma(int sayi) {
        System.out.println("İstediğiniz sayı : " + sayi);
    }

}
