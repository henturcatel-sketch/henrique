public class Tecnico extends Funcionario {

    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.05;
    }
}