public class DemonstracaoBicicleta {
    public static void main(String[] args) {
        Bicicleta bike1;
        bike1 = new Bicicleta();
        Bicicleta bike2;
        bike2 = new Bicicleta();

        bike1.acelerar(3);
        bike2.acelerar(10);
        bike1.mudarMarcha(4);
        bike2.mudarMarcha(2);
        bike1.freiar(1);
        bike2.freiar(2);
        bike1.imprimirEstados();
        bike2.imprimirEstados();

    }
}
