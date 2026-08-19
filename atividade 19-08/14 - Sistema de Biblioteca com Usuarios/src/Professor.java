public class Professor extends Usuario {

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public int limiteEmprestimos() {
        return 5;
    }
}
