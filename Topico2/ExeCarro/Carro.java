package Topico2.ExeCarro;


public class Carro {
    private String nomeCarro;
    private int vel = 0;
    private int tempo = 0;
    private int distanciaTotal = 0;
    private int distancia = 0;
    private  int  posicao;
      
    public Carro(String nomeCarro) {
        setNomeCarro(nomeCarro);
    }

    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.vel = vel;
    }
    public int getDistanciaTotal() {
        return distanciaTotal;
    }
    public void setDistanciaTotal(int distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
     public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    private int getPosicao() {
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
    }

    public void percorrer(int tempo) {
        this.distancia = tempo * this.vel;
        distanciaPercorrida();
    }

    public void distanciaPercorrida() {
        this.distanciaTotal = this.distancia;
    }
    
}
