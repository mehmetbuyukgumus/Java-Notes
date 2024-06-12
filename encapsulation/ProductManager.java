package encapsulation;

public class ProductManager {
    public void add(Product product){
        System.out.println("Ürün eklendi "+ product.name);
    }
    public void remove(Product product){
        System.out.println("Ürün çıkarıldı "+ product.name);
    }

    public void stockQuery(Product product){
        System.out.println("Mevcut Stok Adedi: "+ product.stock);
    }

}
