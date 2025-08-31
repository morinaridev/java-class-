package curso_java;

public class Carro {
    private String modelo;

    // Construtor que recebe o modelo do carro
    public Carro(String modelo) {
        this.modelo = modelo;
        System.out.println("Carro criado: " + modelo);
    }

    // Método acelerar
    public String acelerar() {
        String msg = modelo + " está acelerando!";
        System.out.println(msg);
        return msg;
    }

    // Getter e Setter (opcional)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
