public class GerenteProjeto extends Funcionario {
    private String projeto;
    private int quantidadeEquipe;

    public GerenteProjeto(String nome, int idade, String email, String projeto, int quantidadeEquipe) {
        super(nome, idade, email);
        this.projeto = projeto;
        this.quantidadeEquipe = quantidadeEquipe;
    }

    public void gerenciarProjeto() {
        System.out.println(nome + " está gerenciando o projeto " + projeto + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Projeto: " + projeto);
        System.out.println("Quantidade da equipe: " + quantidadeEquipe);
    }
}