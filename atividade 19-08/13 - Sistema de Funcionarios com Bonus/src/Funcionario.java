public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularBonus() {
        return 0;
    }

    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("Salário final: R$ " + calcularSalarioFinal());
    }
}