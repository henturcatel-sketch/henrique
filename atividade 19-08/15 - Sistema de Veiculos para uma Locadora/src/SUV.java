public class SUV extends Veiculo {

    public SUV(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return (valorDiaria * dias) + (100 * dias);
    }
}