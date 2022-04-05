package Topico2.ExeCarro;


public class Carro {
    String nomeCarro;
    
    public Carro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    int vel = 0;
    int tempo = 0;
    int distanciaTotal = 0;
    int distancia = 0;
    int posicao;
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void aumentarVel(int vel) {
        this.vel = vel + this.vel;
    }

    public void diminuirVel(int vel) {
        this.vel = this.vel-vel;
        System.out.println(this.vel);
    }

    public void percorrer(int tempo) {
        this.distancia = tempo * this.vel;
        distanciaPercorrida();
    }

    public int distanciaPercorrida() {
        this.distanciaTotal = this.distancia;
        return this.distanciaTotal;
    }
    
}
