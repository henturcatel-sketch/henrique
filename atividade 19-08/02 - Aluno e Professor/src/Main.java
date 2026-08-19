public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos", 17, "Engenharia de Software");

        Professor professor = new Professor("Marcos", 40, "Programação");

        aluno.apresentarAluno();
        professor.apresentarProfessor();
    }
}