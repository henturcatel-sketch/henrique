public class FuncionarioBiblioteca extends Usuario {

    public FuncionarioBiblioteca(String nome) {
        super(nome);
    }

    @Override
    public int limiteEmprestimos() {
        return 10;
    }
}