public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double limite = 500;

        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Limite de saque excedido.");
        }
    }
}
