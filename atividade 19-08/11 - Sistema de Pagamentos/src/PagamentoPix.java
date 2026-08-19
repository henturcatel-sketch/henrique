public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via Pix.");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
    }
}
