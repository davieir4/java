import java.util.ArrayList;

public class ShoppingCart {
    private final int customerID;
    private final ArrayList<Product> productList;

    // Um atributo final de uma classe pode ter seu valor atribuído uma única vez, seja na própria declaração ou no construtor.
   // cada usuário só pode ter um id e uma lista, então faz sentido ser final

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

        //StringBuilder não cria uma copia pra cada append, então é melhor nesse caso

        for (Product product : this.productList) {

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
