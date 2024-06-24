public class Product implements Comparable<Product> {
    private String name; // Navn på produktet
    private double price; // Pris på produktet

    // Konstruktør til at initialisere produktets navn og pris
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Implementer compareTo metoden fra Comparable interfacet
    @Override
    public int compareTo(Product other) {
        // Brug Double.compare til at sammenligne priserne
        return Double.compare(this.price, other.price);
    }

    // Override toString metoden til at returnere produktets navn og pris som en streng
    @Override
    public String toString() {
        return name + ": $" + price;
    }
}