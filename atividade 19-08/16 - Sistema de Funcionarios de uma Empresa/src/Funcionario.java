public class Funcionario {
    protected String nome;
    protected int idade;
    protected String email;

    public Funcionario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}