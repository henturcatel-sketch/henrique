public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Davi",
                17,
                5000.00
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                35,
                "Gerente",
                4500.00
        );

        System.out.println("=== CLIENTE ===");
        cliente.apresentarDados();

        System.out.println();

        System.out.println("=== FUNCIONÁRIO ===");
        funcionario.apresentarDados();
    }
}