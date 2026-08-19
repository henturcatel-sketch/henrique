public abstract class Pagamento {
    protected double valor;
    protected String data;
    protected String descricao;

    public Pagamento(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public abstract void processarPagamento();
}