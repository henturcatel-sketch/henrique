public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2024,
                4
        );

        Moto moto = new Moto(
                "Honda",
                "CB 500",
                2023,
                "Elétrica"
        );

        carro.apresentarCarro();
        moto.apresentarMoto();
    }
}