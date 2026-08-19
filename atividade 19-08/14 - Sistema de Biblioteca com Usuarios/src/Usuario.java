public class Usuario {
    protected String nome;
    protected int quantidadeLivros;

    public Usuario(String nome) {
        this.nome = nome;
        this.quantidadeLivros = 0;
    }

    public int limiteEmprestimos() {
        return 0;
    }

    public void realizarEmprestimo() {
        if (verificarLimiteEmprestimos()) {
            quantidadeLivros++;
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Limite de empréstimos atingido.");
        }
    }

    public void devolverLivro() {
        if (quantidadeLivros > 0) {
            quantidadeLivros--;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Não há livros para devolver.");
        }
    }

    public boolean verificarLimiteEmprestimos() {
        return quantidadeLivros < limiteEmprestimos();
    }
}