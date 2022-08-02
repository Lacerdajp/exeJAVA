package Topico2.ExeTimedeFut;

public class Time {
    private String nome;
    private PosicaoTatica[] pTaticas=new PosicaoTatica[5];
    private int[] qtTaticas= new int[5];
    private Jogador[] jogadores=new Jogador[25];
    
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
        int num=qtTaticas[jogador.getPosicao().getPosicao()-1];
        for (int i = 1; i < this.jogadores.length; i++) {
            if (this.jogadores[i]!=null){
                if(jogador.getPosicao()==this.jogadores[i].getPosicao()){
                    num--;
                }
            }
            else {break;}
                
        }
        if (num>0){
            for (int i = 1; i < this.jogadores.length; i++) {
                if(this.jogadores[i]==null){
                    this.jogadores[i]=jogador;
                    break;
                }
            }
    }else{
        System.out.println("A quantidade de jogadores na posição foi excedida, logo o jogador "+jogador.getNomeJogador()+" não foi contratado");
    }
      
    }
    public void defineQtdPosicoes(int n,PosicaoTatica pTatica) {
        
        this.pTaticas[pTatica.getPosicao()-1]=pTatica;
        this.qtTaticas[pTatica.getPosicao()-1]=n;
    }
}
