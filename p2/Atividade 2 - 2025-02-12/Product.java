public class Product {
    protected String name; //protected -> classes herdeiras podem editar
    protected String brand;
    protected double price;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {

        return brand;
    }
    public double getPrice() {

        return price;
    }
    public String getName() {

        return name;
    }
}
