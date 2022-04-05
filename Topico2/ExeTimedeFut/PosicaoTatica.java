package Topico2.ExeTimedeFut;

public enum PosicaoTatica {
    
    Goleiro(0), Zagueiro(1),Lateral(2),Meia(3),Atacante(4);
    int posicao;
    PosicaoTatica(int posicao){
        this.posicao=posicao;
    }
    public int getValor(){
        return posicao;
    }
}
