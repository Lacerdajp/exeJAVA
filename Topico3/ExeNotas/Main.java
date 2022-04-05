package Topico3.ExeNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tamTurma=sc.nextInt();
            
            String name;
            double nota1;
            double nota2;
            Aluno[] alunos=new Aluno[tamTurma];
            double media;

            for (int i = 0; i < alunos.length; i++) {
                System.out.println("Digite o nome do aluno,nota da primeira prova e nota da segunda prova");
                sc.nextLine();
                name=sc.nextLine();
                nota1=sc.nextDouble();
                nota2= sc.nextDouble();
                alunos[i]=new Aluno(name, nota1,nota2);
                media=alunos[i].media.calculoMedia(alunos[i].getNota1(), alunos[i].getNota2());
                alunos[i].classificar(media);
               
            }
            for (Aluno aluno : alunos) {
                if(aluno!=null){
                System.out.println("O Aluno "+aluno.getNomeAluno()+" tirou "+ aluno.getClassificacao());
                }
        }
        }

    }
}
