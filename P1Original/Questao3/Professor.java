package P1Original.Questao3;

import java.util.Scanner;

public class Professor {
    Scanner sc=new Scanner(System.in);
    private Turma turma;
    private Calculadora calculadora=new Calculadora();
    
    public Professor() {
        System.out.println("Digite a quantidade de Alunos na Turma");
        this.turma = new Turma(sc.nextInt());
    }
    public double mediaBimestre1(Aluno aluno) {
        this.calculadora.soma(aluno.getNota1(),aluno.getNota2());
        return this.calculadora.divisao(this.calculadora.getResultReal(),2);
    }
    public double mediaBimestre2(Aluno aluno) {
        this.calculadora.soma(aluno.getNota3(),aluno.getNota4());
        return this.calculadora.divisao(this.calculadora.getResultReal(),2);
    }
    public double mediaFinal(Aluno aluno){
        this.calculadora.soma(mediaBimestre1(aluno),mediaBimestre2(aluno));
        aluno.setMediaFinal(this.calculadora.divisao(this.calculadora.getResultReal(),2));
        if (aluno.getMediaFinal()>=6) aluno.setAprovado(true);
        else aluno.setAprovado(false);
        return aluno.getMediaFinal();
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public Calculadora getCalculadora() {
        return calculadora;
    }
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    

}
