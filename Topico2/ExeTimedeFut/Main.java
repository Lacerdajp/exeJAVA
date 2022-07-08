package Topico2.ExeTimedeFut;

public class Main {
    public static void main(String[] args) {
        Time time1=new Time("Flamengo");
        Time time2=new Time("Fluminense");
        Jogador jogador1=new Jogador(PosicaoTatica.Atacante, "Douglinhas Gaucho");
        Jogador jogador2=new Jogador(PosicaoTatica.Goleiro, "JP");
        time1.defineQtdPosicoes(2,PosicaoTatica.Goleiro);
        time1.defineQtdPosicoes(4, PosicaoTatica.Zagueiro);
        time1.defineQtdPosicoes(4, PosicaoTatica.Lateral);
        time1.defineQtdPosicoes(8, PosicaoTatica.Meia);
        time1.defineQtdPosicoes(5, PosicaoTatica.Atacante);
        
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);

        for (Jogador jogador : time1.getJogadores()) {
            System.out.println(jogador);
        }
       

        

        

        
    }
}
