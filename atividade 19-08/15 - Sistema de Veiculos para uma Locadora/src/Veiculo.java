public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularLocacao(int dias) {
        return valorDiaria * dias;
    }
}
