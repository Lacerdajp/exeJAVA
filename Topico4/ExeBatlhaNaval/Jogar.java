package Topico4.ExeBatlhaNaval;

import java.util.Scanner;

public class Jogar {
    public static void main(String[] args) {
        Usuario user=new Usuario();
        Tabuleiro tab=new Tabuleiro(null);
        Scanner sc=new Scanner(System.in);
        System.out.println("Para atirar escolha uma linha e uma coluna respectivamente");
        while(user.getQtTiro()!=0){
        System.out.println("Atire, você tem "+user.getQtTiro()+ " chances");
        user.Atirar(sc.nextInt()-1, sc.nextInt()-1, tab);
        user.setQtTiro(user.getQtTiro()-1);
    }
        System.out.println("Acabou seus tiros! você pontuou "+user.getPontuacao()+" pontos");
        tab.imprimirTabuleiro(tab);;
}
}
