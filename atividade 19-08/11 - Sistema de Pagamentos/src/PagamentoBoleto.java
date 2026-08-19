public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via boleto.");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
    }
}