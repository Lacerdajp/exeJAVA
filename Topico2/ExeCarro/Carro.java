package ExeCarro;

public class Carro {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    int vel = 0;
    int tempo = 0;
    int distanciaTotal = 0;
    int distancia = 0;

    void aumentarVel(int vel) {
        this.vel = vel + this.vel;
    }

    void diminuirVel(int vel) {
        this.vel = vel + this.vel;
    }

    void percorrer(int tempo) {
        this.distancia = tempo / this.vel;
        distanciaPercorrida();
    }

    int distanciaPercorrida() {
        this.distanciaTotal = this.distancia;
        return this.distanciaTotal;
    }
}
