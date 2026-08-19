public class Moto extends Veiculo {

    private String tipoPartida;

    public Moto(String marca, String modelo, int ano, String tipoPartida) {
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
    }

    public void apresentarMoto() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de partida: " + tipoPartida);
        System.out.println("-------------------------");
    }
}