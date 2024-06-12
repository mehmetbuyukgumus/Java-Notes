package methods;

public class methods2 {
    public static void main(String[] args) {
        int islemSonucu = topla(12, 23);
        System.out.println("İşeminizin sonucu: " + islemSonucu);
        int yeniIslemSonucu = multiMultiply(1,2,3,4,5,6,7,8,9);
        System.out.println("Yeni işeminizin sonucu: " + yeniIslemSonucu);
    }

    public static int topla(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public static int multiMultiply(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

}
