package Topico2.ExeTimedeFut;

public class Main {
    public static void main(String[] args) {
        //mercado da Bola
        Time time1=new Time("Flamengo");
        Time time2=new Time("Fluminense");
        
        Jogador jogador1=new Jogador(PosicaoTatica.Goleiro, "Douglinhas Gaucho");
        Jogador jogador2=new Jogador(PosicaoTatica.Goleiro, "JP");
        Jogador jogador3=new Jogador(PosicaoTatica.Goleiro, "Braga");
        Jogador jogador4=new Jogador(PosicaoTatica.Goleiro, "Jorge");
        time1.defineQtdPosicoes(3,PosicaoTatica.Goleiro);
        time1.defineQtdPosicoes(4, PosicaoTatica.Zagueiro);
        time1.defineQtdPosicoes(4, PosicaoTatica.Lateral);
        time1.defineQtdPosicoes(8, PosicaoTatica.Meia);
        time1.defineQtdPosicoes(5, PosicaoTatica.Atacante);
        
        
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.adicionarJogador(jogador3);
        time1.adicionarJogador(jogador4);
        //jogadores do time[1]
        time1.imprimirElenco();
       

        

        

        
    }
}
