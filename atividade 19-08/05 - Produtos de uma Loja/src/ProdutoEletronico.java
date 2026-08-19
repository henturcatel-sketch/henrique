public class ProdutoEletronico extends Produto {

    private int garantiaMeses;

    public ProdutoEletronico(String codigo, String nome, double preco, int garantiaMeses) {
        super(codigo, nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public void apresentarEletronico() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Garantia: " + garantiaMeses + " meses");
        System.out.println("-------------------------");
    }
}