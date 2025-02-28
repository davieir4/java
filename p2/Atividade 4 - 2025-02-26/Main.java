package Atividade4;
import java.util.Scanner;


public class Main {
    public static void main(String[] Args){

      Scanner sc = new Scanner(System.in);

      Account holder1 = new Account(1001, "Teste da Silva", 0.00, 100.00);

      String nome = holder1.getHolder();

      System.out.printf("Olá %s", nome);
      System.out.println("Digite a operação que deseja realizar:\n" +
              "1- Consultar Saldo\n" + "2- Saque\n" + "3- Depósito\n" + "4- Número da Conta");

      /*
      try{
        while(1){

        }
      }catch;

       */
  }


}
