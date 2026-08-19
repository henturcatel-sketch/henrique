public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Davi", 4000, "Java"
        );

        Analista analista = new Analista(
                "Carlos", 3500, "Sistemas"
        );

        Estagiario estagiario = new Estagiario(
                "João", 1500, 80
        );

        System.out.println("Desenvolvedor: R$ " + desenvolvedor.calcularSalario());
        System.out.println("Analista: R$ " + analista.calcularSalario());
        System.out.println("Estagiário: R$ " + estagiario.calcularSalario());
    }
}