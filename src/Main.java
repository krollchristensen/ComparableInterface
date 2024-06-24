import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 899.99));
        products.add(new Product("Smartphone", 499.99));
        products.add(new Product("Tablet", 299.99));

        // Sorter listen af produkter ved brug af Collections.sort, som anvender compareTo metoden
        Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }
}