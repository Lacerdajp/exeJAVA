package P1Original.Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Professor prof=new Professor();
        prof.getTurma().setAlunos(sc);

        for (int i = 0; i < prof.getTurma().getAlunos().length; i++) {
            prof.getTurma().getAlunos()[i].responderChamada();
            prof.mediaFinal(prof.getTurma().getAlunos()[i]);
            prof.getTurma().getAlunos()[i].imprimirInformação();;
        }
    }
    //incompleto
}
