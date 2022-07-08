package Topico2.ExeTimedeFut;

public class Jogador {
    private PosicaoTatica posicao;
    private String nomeJogador;
    
    public Jogador(PosicaoTatica posicao, String nomeJogador) {
        this.posicao = posicao;
        this.nomeJogador = nomeJogador;
    }
    public PosicaoTatica getPosicao() {
        return posicao;
    }
    public void setPosicao(PosicaoTatica posicao) {
        this.posicao = posicao;
    }
    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    
}
