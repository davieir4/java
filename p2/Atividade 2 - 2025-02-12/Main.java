public class Main {
    public static void main(String[] args){

        Product celular = new Product("A15 - 256gb", "Samsung", 1099.00);
        TV smartTV = new TV("Smart TV", "Samsung", 32, 1168.99);
        Stove fogao = new Stove("Fogão Bali", "Esmaltec", 4, 599.00);
        Refrigerator geladeira = new Refrigerator("Geladeira Frost Free", "Eletrolux", 590, 7199.00);


        ShoppingCart engagedCostumer = new ShoppingCart(42); // noivo verificando os eletrodomésticos
        ShoppingCart singleCostumer = new ShoppingCart(43); // cliente atrás de um celular pra mãe

        engagedCostumer.addProduct(smartTV);
        engagedCostumer.addProduct(fogao);
        engagedCostumer.addProduct(geladeira);

        System.out.println("----------- CLIENTE 1 - NF -------------\n");

        double total = engagedCostumer.getTotalprice();
        int engagedID = engagedCostumer.getCustomerID();

        System.out.printf("CostumerID: %d\n", engagedID);
        System.out.println(engagedCostumer.getContents());
        System.out.printf("TOTAL: %.2f", total);

        System.out.println("\n");

        singleCostumer.addProduct(celular);

        System.out.println("----------- CLIENTE 2 - NF -------------\n");

        double total2 = singleCostumer.getTotalprice();
        int singleID = singleCostumer.getCustomerID();

        System.out.printf("CostumerID: %d\n", singleID);
        System.out.println(singleCostumer.getContents());
        System.out.printf("TOTAL: %.2f", total2);

        System.out.println();





    }
}
