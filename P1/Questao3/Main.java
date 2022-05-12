package P1.Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Professor prof=new Professor();
        prof.getTurma().setAlunos(sc);
<<<<<<< HEAD
=======
        for (int i = 0; i < prof.getTurma().getAlunos().length; i++) {
            prof.getTurma().getAlunos()[i].responderChamada();
            prof.mediaFinal(prof.getTurma().getAlunos()[i]);
        }

>>>>>>> b74da195b50fa658b1160f866274f55f7980c6a3
    }
    //incompleto
}
