package Topico2.ExeTimedeFut;

public class Time {
    PosicaoTatica[] pTaticas=new PosicaoTatica[5];
    int[] qtTaticas=new int[5];
    Jogador[] jogador;

    public void adicionarJogador() {
        
    }
    public void defineQtdPosicoes(int n,PosicaoTatica pTatica) {
        this.pTaticas[0]=pTatica;
        this.qtTaticas[0]=n;
    }
}
