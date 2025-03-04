import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        Account holder1 = new Account(1001, "Teste da Silva", 0.00, 100.00);

        System.out.printf("Olá %s\n", holder1.getHolder());

        int opcao = 0;

        while (opcao != -1) {
            System.out.println("\nDigite a operação que deseja realizar:\n" +
                    "1- Consultar Saldo\n" + "2- Saque\n" + "3- Depósito\n" + "4- Número da Conta\n" + "Digite -1 para encerrar o programa\n");

            // Validação de entrada
            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número:");
                sc.next(); // descarta entrada inválida
            }
            opcao = sc.nextInt();
            sc.nextLine(); // limpeza do buffer

            try {
                double saldo = holder1.getBalance();
                switch (opcao) {
                    case 1:
                        System.out.printf("Seu saldo é R$ %.2f\n", saldo);
                        break;

                    case 2:
                        System.out.print("Digite o valor que deseja sacar: ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Entrada inválida! Digite um número:");
                            sc.next();
                        }
                        double saque = sc.nextDouble();
                        double limiteDeSaque = holder1.getWithdrawLimit();
                        sc.nextLine(); // limpeza de buffer

                        if (saque > saldo) {
                            throw new IllegalArgumentException(String.format("Seu saldo é insuficiente, seu saldo é: R$ %.2f\n", saldo));
                        } else if (saque > limiteDeSaque) {
                            throw new IllegalArgumentException(String.format("Sua solicitação de saque excede o seu limite de operação, seu limite é: R$ %.2f\n", limiteDeSaque));
                        } else {
                            holder1.withdraw(saque);
                            System.out.println("Saque realizado com sucesso!");
                        }
                        break;

                    case 3:
                        System.out.println("Digite o valor de depósito:");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Entrada inválida! Digite um número:");
                            sc.next();
                        }
                        double deposito = sc.nextDouble();
                        sc.nextLine();
                        holder1.deposit(deposito);
                        System.out.println("Depósito realizado com sucesso!");
                        break;

                    case 4:
                        System.out.printf("O número da sua conta é: %d\n", holder1.getNumber());
                        break;

                    case -1:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        throw new IllegalArgumentException("Opção inválida, tente novamente\n");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine(); // limpeza do buffer para evitar loop infinito
            }
        }
        sc.close();
    }
}
