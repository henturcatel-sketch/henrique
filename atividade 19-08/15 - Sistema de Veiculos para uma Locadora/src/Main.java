public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(
                "ABC-1234",
                "Toyota Corolla",
                150.00
        );

        Moto moto = new Moto(
                "DEF-5678",
                "Honda CG",
                80.00
        );

        SUV suv = new SUV(
                "GHI-9012",
                "Jeep Compass",
                250.00
        );

        int dias = 5;

        System.out.println("=== CARRO ===");
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Dias: " + dias);
        System.out.println("Valor da locação: R$ " + carro.calcularLocacao(dias));

        System.out.println();

        System.out.println("=== MOTO ===");
        System.out.println("Modelo: " + moto.modelo);
        System.out.println("Dias: " + dias);
        System.out.println("Valor da locação: R$ " + moto.calcularLocacao(dias));

        System.out.println();

        System.out.println("=== SUV ===");
        System.out.println("Modelo: " + suv.modelo);
        System.out.println("Dias: " + dias);
        System.out.println("Valor da locação: R$ " + suv.calcularLocacao(dias));
    }
}