public class Cliente extends Pessoa {
    private double limiteCredito;

    public Cliente(String nome, int idade, double limiteCredito) {
        super(nome, idade);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Limite de crédito: R$ " + limiteCredito);
    }
}
