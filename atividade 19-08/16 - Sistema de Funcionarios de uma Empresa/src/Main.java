public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor(
                "Davi",
                17,
                "davi@email.com",
                "Java",
                5
        );

        Designer designer = new Designer(
                "Carlos",
                25,
                "carlos@email.com",
                "Photoshop",
                "Design de Interfaces"
        );

        GerenteProjeto gerente = new GerenteProjeto(
                "Marcos",
                35,
                "marcos@email.com",
                "Sistema Escolar",
                8
        );

        System.out.println("=== DESENVOLVEDOR ===");
        desenvolvedor.apresentarDados();
        desenvolvedor.programar();

        System.out.println();

        System.out.println("=== DESIGNER ===");
        designer.apresentarDados();
        designer.criarDesign();

        System.out.println();

        System.out.println("=== GERENTE DE PROJETO ===");
        gerente.apresentarDados();
        gerente.gerenciarProjeto();
    }
}