package P1.Questao3;

public class Aluno {
    private String nome;
    private char sexo;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double mediaFinal;
    private boolean aprovado;

    public Aluno() {
    }
    public Aluno(String nome, char sexo, int idade, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    public void imprimirInformação() {
        System.out.println(getNome()+" "+ getNota1()+" "+getNota2()+" "+getNota3()+" "+getNota4()+" "+getMediaFinal());
    }
    public void responderChamada() {
        System.out.println(getNome()+" está presente");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
