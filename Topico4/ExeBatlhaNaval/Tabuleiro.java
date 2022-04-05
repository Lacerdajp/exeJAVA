package Topico4.ExeBatlhaNaval;

import java.util.Random;

public class Tabuleiro {
    private Peca[][] pecas=new Peca[8][8];
    private Random random=new Random();
    
    public Tabuleiro(Peca[][] pecas) {
        for (int i=0;i <8;i++) {
            for (int j=0;j<8;j++) {
                this.pecas[i][j]=new Peca(random.nextInt(10));   
        
            }
        } 
    }
   
    public void imprimirTabuleiro(Tabuleiro tabuleiro) {
        for (Peca[] pecas2 : pecas) {
            for (Peca peca : pecas2) {
                if (peca==null)break;
                System.out.print(peca.getValor()+" ");
            }
            System.out.println();
        }
    }
    public Peca[][] getPecas() {
        return pecas;
    }

    public void setPecas(Peca[][] pecas) {
        this.pecas = pecas;
    }
    
}
