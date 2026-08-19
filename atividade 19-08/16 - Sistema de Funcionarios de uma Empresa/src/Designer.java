public class Designer extends Funcionario {
    private String ferramenta;
    private String especialidade;

    public Designer(String nome, int idade, String email, String ferramenta, String especialidade) {
        super(nome, idade, email);
        this.ferramenta = ferramenta;
        this.especialidade = especialidade;
    }

    public void criarDesign() {
        System.out.println(nome + " está criando um design usando " + ferramenta + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Ferramenta: " + ferramenta);
        System.out.println("Especialidade: " + especialidade);
    }
}