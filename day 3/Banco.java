public class Banco {

    private Conta conta;

    // Criar conta
    public void criarConta(String nomeTitular) {
        if (conta == null) {
            conta = new Conta(nomeTitular);
            System.out.println("Conta criada para " + nomeTitular);
        } else {
            System.out.println("Já existe uma conta criada.");
        }
    }

    public void mostrarSaldo() {
        if (conta != null) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Nenhuma conta criada.");
        }
    }

    public void depositar(double valor) {
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Crie uma conta primeiro.");
        }
    }

    public void sacar(double valor) {
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Crie uma conta primeiro.");
        }
    }

    public boolean temConta() {
        return conta != null;
    }
}
