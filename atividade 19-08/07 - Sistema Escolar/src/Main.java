public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davi", 17, "Tecnologia", 8.5, 9.0);
        Professor professor = new Professor("Carlos", 35, "Programação", 4500.00);

        System.out.println("=== ALUNO ===");
        aluno.apresentarDados();

        System.out.println();

        System.out.println("=== PROFESSOR ===");
        professor.apresentarDados();
    }
}