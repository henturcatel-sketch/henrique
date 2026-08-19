public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davi", 17);
        Professor professor = new Professor("Carlos", 35);

        Livro livro = new Livro(
                "Java Básico",
                "José Silva",
                2025
        );

        livro.apresentarDados();

        System.out.println();

        aluno.emprestarLivro(livro);

        System.out.println();

        livro.apresentarDados();

        System.out.println();

        professor.devolverLivro(livro);

        System.out.println();

        livro.apresentarDados();
    }
}