public class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
    }
}