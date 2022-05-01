package P1.Questao3;

import java.util.Scanner;

public class Turma {
    private Aluno[] alunos;
    public Turma(int qtAlunos) {
        this.alunos=new Aluno[qtAlunos];
    }
    public void setAlunos(Scanner sc) {
        for (int i=0;i<alunos.length;i++) {
            System.out.println("Digite o nome,a primeira letra do sexo(F ou M), idade,e as 4 notas respectivamente");
            if(i!=0)sc.nextLine();
            alunos[i]=new Aluno(sc.nextLine(), sc.nextLine().charAt(0),
            sc.nextInt(), sc.nextDouble(), sc.nextDouble(),sc.nextDouble(), sc.nextDouble());
        }
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    

}
