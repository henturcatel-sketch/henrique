public class Estagiario extends Funcionario {
    private int horasTrabalhadas;

    public Estagiario(String nome, double salarioBase, int horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabalhadas / 160;
    }
}