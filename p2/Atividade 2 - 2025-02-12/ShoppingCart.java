import java.util.ArrayList;

public class ShoppingCart {
    private final int customerID;
    private final ArrayList<Product> productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList<Product>();
    }
    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void removeProduct(Product product){
        this.productList.remove(product);
    }
    public String getContents(){
        StringBuilder contents = new StringBuilder();

        for (Product product : this.productList) {

            contents.append(product.getName());
            contents.append(" - ");
            contents.append(product.getBrand());
            contents.append(": R$ ");
            contents.append(product.getPrice());
            contents.append("\n");

        }

        return contents.toString();
    }
    public int getCustomerID(){
        return this.customerID;
    }

    public double getTotalprice(){
        double totalPrice = 0;
        for (Product product : this.productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
