//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product cadernoBen10 = new Product("Caderno do Ben 10", 15.00);
        Product cadernoPucca = new Product("Caderno da Pucca", 15.00);
        Product mochilaHelloKitty = new Product("Mochila da Hello Kitty", 89.99);
        Product estojo = new Product("Estojo baratinho", 10.00);
        Product chocolate = new Product("Chocolate Trento", 4.00);
        Product caneta = new Product("Caneta Bic", 0.75);

        ShoppingCart paiDeMenino = new ShoppingCart(1);
        ShoppingCart paiDeMenina = new ShoppingCart(2);

        System.out.println("Olá, seja bem-vindo à Viera's House\n");

        //cliente 1
        paiDeMenino.addProduct(cadernoBen10);
        paiDeMenino.addProduct(estojo);
        paiDeMenino.addProduct(chocolate);
        paiDeMenino.addProduct(caneta);

        //o pai deseja checkar os itens
        System.out.println(paiDeMenino.getContents());

        System.out.println("* o menino fez birra e ficou sem chocolate *");
        System.out.println();
        paiDeMenino.removeProduct(chocolate);

        //o caixa de autoatendimento informa o valor da compra junto do ID do cliente

        int idPaideMenino = paiDeMenino.getCustomerID();
        double valorDaCompra = paiDeMenino.getTotalprice();
        System.out.println(paiDeMenino.getContents());
        System.out.printf("Cliente %d sua compra deu R$ %.2f\n", idPaideMenino, valorDaCompra);

        //o pai paga
        System.out.println("Tenha um bom dia!\n");

        System.out.println("Olá, seja bem-vindo à Viera's House\n");

        //cliente2
        paiDeMenina.addProduct(cadernoPucca);
        paiDeMenina.addProduct(mochilaHelloKitty);
        paiDeMenina.addProduct(estojo);

        // a logica de qtd n consta no UML

        paiDeMenina.addProduct(caneta);
        paiDeMenina.addProduct(caneta);

        //ao chegar no caixa o Pai de Menina checa seu carrinho de compra e deseja pagar

        System.out.println(paiDeMenina.getContents());
        System.out.printf("Olá cliente %d sua compra deu %.2f\n", paiDeMenina.getCustomerID(), paiDeMenina.getTotalprice());

        System.out.println("Tenha um bom dia!");


    }
}