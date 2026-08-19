public class Funcionario {

    protected String nome;
    protected double salario;
    protected String setor;

    public Funcionario(String nome, double salario, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Setor: " + setor);
    }
}