public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }

    public void emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public void apresentarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponível: " + disponibilidade);
    }
}