public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double capacidadeCarga;

    public Veiculo(String placa, String modelo, double capacidadeCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public double calcularFrete(double distancia) {
        return 0;
    }
}