package arrayListDemo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Arraylist ile bir liste dizi oluşturmak!!
        // < > arasına dizinin tipini vermek gerekiyor
        ArrayList<Object> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add("Ankara");
        // .get metodu ile ilgili indexteki elemana erişebiliriz
        System.out.println(numbers.get(2));
        // .set metodu ile de ilgili indexteki elemanı değiştirebiliriz.
        numbers.set(2, "Yalova");
        // .remove ile ilgili dndexteki elamanı silebiliriz
        numbers.remove(0);

        }
}