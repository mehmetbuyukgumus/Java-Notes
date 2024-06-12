package introduction;
public class arrays_recap_demo {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        
        for (double list: myList){
            total = total + list;
            System.out.println(list);
            }
        System.out.println("Toplam : " + total);
            
 
        // Another way to make loop in list

        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]);
        }

         for (double list : myList){
            if (list < 2){
                System.out.println(list);
            }
            else {
                System.out.println("Bu değer 2'den küçük değil");
            }
         }
    }
}
