public class Passaro extends Animal {

    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }
}