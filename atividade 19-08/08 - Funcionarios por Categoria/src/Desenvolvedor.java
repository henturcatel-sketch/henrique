public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salarioBase, String linguagem) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 1000;
    }
}