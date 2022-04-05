package Topico3.exArrayDeNotas;

public class Aluno {
    int atributo;
    int[] notas=new int[atributo];
    int media=0;
    public void setNumEval(int n) {
        this.atributo=n;
    }
    public void setEval(int n, int nota) {
        this.notas[n]=nota;
    }
    public int getMedia() {
        for (int nota : notas) {
            this.media=this.media+nota;
        }
        this.media=this.media/atributo;
        return this.media;
    }
}
