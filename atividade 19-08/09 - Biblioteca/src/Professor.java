public class Professor extends Pessoa {
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
    }
}