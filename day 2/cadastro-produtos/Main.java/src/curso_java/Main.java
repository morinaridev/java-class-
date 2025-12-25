package curso_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaVendas maquina = new MaquinaVendas();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==== Máquina de Vendas ====");
            System.out.println("1 - Ver produtos");
            System.out.println("2 - Inserir dinheiro");
            System.out.println("3 - Comprar produto");
            System.out.println("4 - Devolver troco");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    maquina.exibirProdutos();
                    break;
                case 2:
                    System.out.print("Digite o valor a inserir: R$ ");
                    double valor = sc.nextDouble();
                    maquina.inserirDinheiro(valor);
                    break;
                case 3:
                    maquina.exibirProdutos();
                    System.out.print("Digite o código do produto: ");
                    int codigo = sc.nextInt();
                    maquina.comprarProduto(codigo);
                    break;
                case 4:
                    maquina.devolverTroco();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
