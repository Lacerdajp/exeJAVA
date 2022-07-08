package Topico2.ExeTimedeFut;

public enum PosicaoTatica {
    
    Goleiro(1), Zagueiro(2),Lateral(3),Meia(4),Atacante(5);
    private int posicao;
    PosicaoTatica(int posicao){
        this.posicao=posicao;
    }
    public int getPosicao() {
        return posicao;
    }
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
}
