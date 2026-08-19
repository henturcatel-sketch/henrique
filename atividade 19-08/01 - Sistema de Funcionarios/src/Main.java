public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(
                "Carlos",
                25,
                "Programador",
                3500.00
        );

        Funcionario funcionario2 = new Funcionario(
                "Ana",
                30,
                "Gerente",
                5500.00
        );

        Funcionario funcionario3 = new Funcionario(
                "João",
                22,
                "Estagiário",
                1800.00
        );

        funcionario1.apresentar();
        funcionario2.apresentar();
        funcionario3.apresentar();
    }
}
