import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==== BANCO ====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do titular: ");
                    String nome = sc.nextLine();
                    banco.criarConta(nome);
                    break;

                case 2:
                    banco.mostrarSaldo();
                    break;

                case 3:
                    System.out.print("Valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    banco.depositar(deposito);
                    break;

                case 4:
                    System.out.print("Valor para saque: R$ ");
                    double saque = sc.nextDouble();
                    banco.sacar(saque);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
