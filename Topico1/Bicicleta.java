
public class Bicicleta {
    int velocidade = 0;
    int marcha = 1;

    void mudarMarcha(int novoValor) {
        marcha = novoValor;
    }

    void acelerar(int incremento) {
        velocidade = velocidade + incremento;
    }

    void freiar(int decremento) {
        velocidade = velocidade - decremento;
    }

    void imprimirEstados() {
        System.out.println(" velocidade: " + velocidade + " marcha: " + marcha);
    }
}
