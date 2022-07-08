package Topico2.ExeTimedeFut;

public class Time {
    private String nome;
    private PosicaoTatica[] pTaticas=new PosicaoTatica[5];
    private int[] qtTaticas= new int[5];
    private Jogador[] jogadores=new Jogador[qtTaticas[1]+qtTaticas[2]+qtTaticas[3]+qtTaticas[4]+qtTaticas[5]];
    
    public Time(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public PosicaoTatica[] getpTaticas() {
        return pTaticas;
    }
    public void setpTaticas(PosicaoTatica[] pTaticas) {
        this.pTaticas = pTaticas;
    }
    public int[] getQtTaticas() {
        return qtTaticas;
    }
    public void setQtTaticas(int[] qtTaticas) {
        this.qtTaticas = qtTaticas;
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    public void adicionarJogador(Jogador jogador) {
        this.jogadores[this.qtTaticas[jogador.getPosicao().getPosicao()]]=jogador;
    }
    public void defineQtdPosicoes(int n,PosicaoTatica pTatica) {
        
        this.pTaticas[pTatica.getPosicao()]=pTatica;
        this.qtTaticas[pTatica.getPosicao()]=n;
    }
}
