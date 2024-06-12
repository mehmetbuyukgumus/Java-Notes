package encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();
        product.name = "Laptop";
        product.description = "Macbook";
        product.id = 12;
        product.stock = 25;
        System.out.println(product.name);
        productManager.add(product);
        productManager.remove(product);
        productManager.stockQuery(product);
    }
}
