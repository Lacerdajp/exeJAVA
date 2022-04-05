package Topico4.ExeBatlhaNaval;

public class Usuario {
    private int pontuacao=0;
    private int qtTiro=5;

    public void Atirar(int linha,int coluna,Tabuleiro tab) {
        this.pontuacao=this.pontuacao+tab.getPecas()[linha][coluna].getValor();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getQtTiro() {
        return qtTiro;
    }

    public void setQtTiro(int qtTiro) {
        this.qtTiro = qtTiro;
    }
    
}
