public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}
