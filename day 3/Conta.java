public class Conta {

    private String titular;
    private double saldo;

    // Construtor
    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar dinheiro
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado.");
        return true;
    }
}
