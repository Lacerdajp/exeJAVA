package Topico2.ExeTimedeFut;

import java.util.ArrayList;

public class Time {
    private String nome;
    private PosicaoTatica[] pTaticas=new PosicaoTatica[5];
    private int[] qtTaticas= new int[5];
    ArrayList<Jogador> jogadores=new ArrayList<Jogador>();
    // private Jogador[] jogadores=new Jogador[25];
    
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
    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    public void adicionarJogador(Jogador jogador) {
        int num=qtTaticas[jogador.getPosicao().getPosicao()-1];
        for (Jogador j : jogadores) {
            if(j.getPosicao()==jogador.getPosicao()){
                num--;
            }
        }
       
        if (num>0){
            jogadores.add(jogador);
           
    }else{
        System.out.println("A quantidade de jogadores na posição "+jogador.getPosicao().toString()+" foi excedida, logo o jogador "+jogador.getNomeJogador()+" não foi contratado");
    }
      
    }
    public void defineQtdPosicoes(int n,PosicaoTatica pTatica) {
        
        this.pTaticas[pTatica.getPosicao()-1]=pTatica;
        this.qtTaticas[pTatica.getPosicao()-1]=n;
    }
    public void imprimirElenco(){
        jogadores.sort((o1, o2) ->Integer.compare(o1.getPosicao().getPosicao(), o2.getPosicao().getPosicao()) );
        for (PosicaoTatica posicao : pTaticas) {
        System.out.println("      "+posicao.toString()+"    ");
        for (Jogador jogador : jogadores) {
            if(jogador.getPosicao()==posicao){
            System.out.println(jogador.getNomeJogador());}
        }
        }
    }
}
