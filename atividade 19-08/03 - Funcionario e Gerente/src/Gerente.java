public class Gerente extends Funcionario {

    private int funcionariosSupervisionados;
    private double percentualBonus;

    public Gerente(String nome, double salario, String setor, int funcionariosSupervisionados, double percentualBonus) {
        super(nome, salario, setor);
        this.funcionariosSupervisionados = funcionariosSupervisionados;
        this.percentualBonus = percentualBonus;
    }

    public double calcularSalarioFinal() {
        return salario + (salario * percentualBonus / 100);
    }

    public void apresentarGerente() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Setor: " + setor);
        System.out.println("Funcionários supervisionados: " + funcionariosSupervisionados);
        System.out.println("Percentual de bônus: " + percentualBonus + "%");
        System.out.println("Salário final: R$ " + calcularSalarioFinal());
    }
}