public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Davi", 5000.00);
        Vendedor vendedor = new Vendedor("Carlos", 3000.00);
        Tecnico tecnico = new Tecnico("João", 2500.00);

        System.out.println("=== GERENTE ===");
        gerente.apresentarDados();

        System.out.println();

        System.out.println("=== VENDEDOR ===");
        vendedor.apresentarDados();

        System.out.println();

        System.out.println("=== TÉCNICO ===");
        tecnico.apresentarDados();
    }
}