package Topico3.ExeNotas;

public class Aluno {
    String nomeAluno;
    double nota1;
    double nota2;
    Classificacao classificacao;
    Media media=new Media();
    
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public Classificacao getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
    public Aluno(String nomeAluno, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public void classificar(double media) {
        if (9<=media && media<=10) {
            this.classificacao=Classificacao.A;
        }else if(8<=media && media<9){
            this.classificacao=Classificacao.B; 
        }else if (7<=media && media<8) {
            this.classificacao=Classificacao.C;
        }else if (6<=media && media<7) {
            this.classificacao=Classificacao.D;
        }
        else{
            this.classificacao=Classificacao.Reprovado;
        }
    }


}
