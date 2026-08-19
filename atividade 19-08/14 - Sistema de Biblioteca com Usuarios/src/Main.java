public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davi");
        Professor professor = new Professor("Carlos");
        FuncionarioBiblioteca funcionario = new FuncionarioBiblioteca("João");

        System.out.println("=== ALUNO ===");
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();

        System.out.println();

        System.out.println("=== PROFESSOR ===");
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();

        System.out.println();

        System.out.println("=== FUNCIONÁRIO ===");
        funcionario.realizarEmprestimo();
        funcionario.realizarEmprestimo();
        funcionario.devolverLivro();

        System.out.println();

        System.out.println("Livros do aluno: " + aluno.quantidadeLivros);
        System.out.println("Limite do aluno: " + aluno.limiteEmprestimos());
        System.out.println("Livros do professor: " + professor.quantidadeLivros);
        System.out.println("Limite do professor: " + professor.limiteEmprestimos());
        System.out.println("Livros do funcionário: " + funcionario.quantidadeLivros);
        System.out.println("Limite do funcionário: " + funcionario.limiteEmprestimos());
    }
}