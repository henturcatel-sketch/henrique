public class ProdutoAlimenticio extends Produto {

    private String dataValidade;

    public ProdutoAlimenticio(String codigo, String nome, double preco, String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public void apresentarAlimenticio() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("-------------------------");
    }
}