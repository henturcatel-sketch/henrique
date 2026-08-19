public class Pedido {
    protected int numero;
    protected String cliente;
    protected double valorTotal;
    protected String status;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.valorTotal = 0;
        this.status = "Pendente";
    }

    public void adicionarValor(double valor) {
        valorTotal += valor;
    }

    public double calcularFrete() {
        return 0;
    }

    public double calcularValorFinal() {
        return valorTotal + calcularFrete();
    }

    public void atualizarStatus(String status) {
        this.status = status;
    }

    public void apresentarPedido() {
        System.out.println("Número: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor dos produtos: R$ " + valorTotal);
        System.out.println("Frete: R$ " + calcularFrete());
        System.out.println("Valor final: R$ " + calcularValorFinal());
        System.out.println("Status: " + status);
    }
}