package introduction;
public class strings {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        // Eleman sayısını bulma
        System.out.println("Eleman sayısı : " + mesaj.length());
        // Belirli bir indexteki elemanı bulma
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        // Tüm elemanları yazdırma
        for (int i = 0; i < mesaj.length(); i++) {
            System.out.println(mesaj.charAt(i));
        }
        // Belirli bir koşula göre elemanları yazdırma
        for (int i = 0; i < mesaj.length(); i++) {
            if (mesaj.charAt(i) == 'u') {
                System.out.println("Aradığınız harf burada");
            } else {
                System.out.println("Lazım bir harf değil");
            }
        }
        // İki string ifadeyi birleştirme
        System.out.println(mesaj.concat(" Yaşasın"));
        // Dizinin hangi elemanla başladığını sorgulama. İşlemin çıktısı boolean formatında olur(true, false)
        System.out.println(mesaj.startsWith("B"));
        // Dizinin hangi elemanla bittiği sorgulama. İşlemin çıktısı boolean formatında olur(true, false)
        System.out.println(mesaj.endsWith("B"));
        // Belirli başlangıç ve bitiş noktalarına göre strign ifadeleri seçme
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        // Belirtilen karakterin kaçıncı indexte yer aldığını bulma
        System.out.println(mesaj.indexOf("B"));
        // Aramaya sondan başlayan yöntem
        System.out.println(mesaj.lastIndexOf("l"));
        // String dizide ifade değiştirme
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        // Metnin içerisinden parça almak
        System.out.println(mesaj.substring(5, 10));
        // Bir metni belirli bir karakter dizisine göre parçalamak (split)
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        // Büyük ve küçük harf dönüşümü
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        // Metnin başındaki veya sonundaki boşlujları kaldırma
        String text = "     Naber, nasılsın?    ";
        System.out.println(text.trim());
    }

}
