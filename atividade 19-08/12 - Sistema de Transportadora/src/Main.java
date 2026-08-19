public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(
                "ABC-1234",
                "Volvo FH",
                10000
        );

        Van van = new Van(
                "DEF-5678",
                "Fiat Ducato",
                1500
        );

        Motocicleta motocicleta = new Motocicleta(
                "GHI-9012",
                "Honda CG",
                50
        );

        double distancia = 100;

        System.out.println("Caminhão: R$ " + caminhao.calcularFrete(distancia));
        System.out.println("Van: R$ " + van.calcularFrete(distancia));
        System.out.println("Motocicleta: R$ " + motocicleta.calcularFrete(distancia));
    }
}