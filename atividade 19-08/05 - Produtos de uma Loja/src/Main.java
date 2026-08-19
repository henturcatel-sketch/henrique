public class Main {

    public static void main(String[] args) {

        ProdutoEletronico eletronico = new ProdutoEletronico(
                "E001",
                "Notebook",
                3500.00,
                12
        );

        ProdutoAlimenticio alimenticio = new ProdutoAlimenticio(
                "A001",
                "Arroz",
                25.90,
                "20/12/2026"
        );

        eletronico.apresentarEletronico();
        alimenticio.apresentarAlimenticio();
    }
}