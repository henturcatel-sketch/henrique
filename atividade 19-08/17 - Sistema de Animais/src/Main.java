public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, 12.5);
        Gato gato = new Gato("Mimi", 3, 4.2);
        Passaro passaro = new Passaro("Piu", 2, 0.5);

        System.out.println("=== CACHORRO ===");
        cachorro.apresentar();
        cachorro.emitirSom();

        System.out.println();

        System.out.println("=== GATO ===");
        gato.apresentar();
        gato.emitirSom();

        System.out.println();

        System.out.println("=== PÁSSARO ===");
        passaro.apresentar();
        passaro.emitirSom();
    }
}