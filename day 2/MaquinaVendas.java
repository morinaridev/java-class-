package curso_java;

import java.util.ArrayList;
import java.util.List;

public class  MaquinaVendas {
    private List<Produto> produtos;
    private double saldo;

    public MaquinaVendas() {
        produtos = new ArrayList<>();
        saldo = 0.0;

        // Produtos iniciais
        produtos.add(new Produto("Coca-Cola", 5.0, 3));
        produtos.add(new Produto("Água", 2.0, 5));
        produtos.add(new Produto("Chocolate", 4.0, 2));
    }

    public void exibirProdutos() {
        System.out.println("\n--- Produtos disponíveis ---");
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println(i + " - " + p.getNome() + " | R$ " + p.getPreco() + " | Estoque: " + p.getQuantidade());
        }
        System.out.println("-----------------------------");
    }

    public void inserirDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você inseriu R$ " + valor + ". Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void comprarProduto(int codigo) {
        if (codigo < 0 || codigo >= produtos.size()) {
            System.out.println("Código inválido.");
            return;
        }

        Produto p = produtos.get(codigo);

        if (p.getQuantidade() <= 0) {
            System.out.println("Produto esgotado!");
            return;
        }

        if (saldo >= p.getPreco()) {
            saldo -= p.getPreco();
            p.reduzirQuantidade();
            System.out.println("Você comprou: " + p.getNome());
            System.out.println("Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente. Insira mais dinheiro.");
        }
    }

    public void devolverTroco() {
        if (saldo > 0) {
            System.out.println("Seu troco é R$ " + saldo);
            saldo = 0;
        } else {
            System.out.println("Não há troco para devolver.");
        }
    }
}
