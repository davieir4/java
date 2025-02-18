import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contribuintes;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de contribuintes: ");
        contribuintes = sc.nextInt();
        sc.nextLine();
        double arrecadacaoTotal = 0;
        for(int i = 0; i < contribuintes; i++){
            System.out.println("PF ou PJ? (pf/pj)");
            String opcao = sc.nextLine();

            if(opcao.equals("pf") || opcao.equals("PF")){
                System.out.println("Digite o nome, renda anual e gastos com saude respectivamente");
                PessoaFisica pf = new PessoaFisica(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
                double taxPf = pf.getTax();
                System.out.printf("seu imposto a pagar é: %.2f\n", taxPf);
                System.out.println();
                arrecadacaoTotal+=taxPf;
            }
            else if(opcao.equals("pj") || opcao.equals("PJ")){
                System.out.println("Digite o nome, renda anual e numero de funcionarios respectivamente");
                PessoaJuridica pj = new PessoaJuridica(sc.nextLine(), sc.nextDouble(), sc.nextInt());
                sc.nextLine();

                double taxPj = pj.getTax();
                System.out.printf("seu imposto a pagar imposto é: %.2f\n", taxPj);
                System.out.println();
                arrecadacaoTotal+=taxPj;
            }
            else{
                System.out.println("entrada inválida");
            }
        }
        System.out.printf("Total Arrecadado: %.2f\n", arrecadacaoTotal);

        sc.close();

        }
}
