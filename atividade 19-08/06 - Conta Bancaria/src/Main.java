public class Main {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(
                1001,
                "Carlos",
                1000.00
        );

        ContaPoupanca contaPoupanca = new ContaPoupanca(
                2001,
                "Ana",
                2000.00
        );

        System.out.println("Conta Corrente");
        contaCorrente.depositar(500);
        contaCorrente.sacar(1800);
        contaCorrente.consultarSaldo();

        System.out.println("-------------------------");

        System.out.println("Conta Poupança");
        contaPoupanca.depositar(500);
        contaPoupanca.sacar(1800);
        contaPoupanca.consultarSaldo();
    }
}