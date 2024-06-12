package packagesDemo;
import java.util.Scanner;
import packagesDemo.Matematik.Sum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sum dortIslem = new Sum();
        System.out.println("Adınızı Giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Merhaba "+name);
        int sonuc = dortIslem.topla(2, 3);
        System.out.println(sonuc);
        scanner.close();
    }
}
