public class Aluno extends Pessoa {
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
    }
}