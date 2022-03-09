
public class Bicicleta {
    int velocidade = 0;
    int marcha = 1;
    int velocidadeMaxima = 0;

    public Bicicleta(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void mudarMarcha(int novoValor) {
        marcha = novoValor;
    }

    void acelerar(int incremento) {
        if (velocidade + incremento <= velocidadeMaxima) {
            velocidade = velocidade + incremento;
        } else {
            velocidade = velocidadeMaxima;
        }

    }

    void freiar(int decremento) {
        velocidade = velocidade - decremento;
    }

    void imprimirEstados() {
        System.out.println(
                " Velocidade Maxima: " + velocidadeMaxima + " velocidade: " + velocidade + " marcha: " + marcha);
    }
}
