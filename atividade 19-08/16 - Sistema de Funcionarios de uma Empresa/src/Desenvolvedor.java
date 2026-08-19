public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private int projetos;

    public Desenvolvedor(String nome, int idade, String email, String linguagem, int projetos) {
        super(nome, idade, email);
        this.linguagem = linguagem;
        this.projetos = projetos;
    }

    public void programar() {
        System.out.println(nome + " está programando em " + linguagem + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Projetos: " + projetos);
    }
}