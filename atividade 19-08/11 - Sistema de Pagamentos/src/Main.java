public class Main {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(
                150.00,
                "18/08/2026",
                "Compra de produtos"
        );

        PagamentoCartao cartao = new PagamentoCartao(
                250.00,
                "18/08/2026",
                "Compra de roupas"
        );

        PagamentoBoleto boleto = new PagamentoBoleto(
                300.00,
                "18/08/2026",
                "Pagamento de conta"
        );

        pix.processarPagamento();

        System.out.println();

        cartao.processarPagamento();

        System.out.println();

        boleto.processarPagamento();
    }
}
