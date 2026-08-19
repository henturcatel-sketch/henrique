public class Moto extends Veiculo {

    public Moto(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return (valorDiaria * dias) * 0.90;
    }
}
