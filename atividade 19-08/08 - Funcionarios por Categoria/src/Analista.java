public class Analista extends Funcionario {
    private String area;

    public Analista(String nome, double salarioBase, String area) {
        super(nome, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 800;
    }
}