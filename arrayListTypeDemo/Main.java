package arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String sehirler[] = { "Ankara", "İstanbul", "Yalova", "Bursa" };
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(sehirler));
        cities.add("Tekidağ");
        cities.remove("Bursa");
        
        for (Object city : cities) {
            System.out.println(city);
        }

    }
}
