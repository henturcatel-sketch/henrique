public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
}