public class Main {
    public static void main(String[] args) {
        PedidoNormal normal = new PedidoNormal(1, "Davi");
        PedidoExpress express = new PedidoExpress(2, "Carlos");
        PedidoRetirada retirada = new PedidoRetirada(3, "João");

        normal.adicionarValor(150.00);
        normal.atualizarStatus("Enviado");

        express.adicionarValor(200.00);
        express.atualizarStatus("Em transporte");

        retirada.adicionarValor(100.00);
        retirada.atualizarStatus("Pronto para retirada");

        System.out.println("=== PEDIDO NORMAL ===");
        normal.apresentarPedido();

        System.out.println();

        System.out.println("=== PEDIDO EXPRESS ===");
        express.apresentarPedido();

        System.out.println();

        System.out.println("=== PEDIDO RETIRADA ===");
        retirada.apresentarPedido();
    }
}