package P1.Questao3;

public class Calculadora {
    private int resultInt;
    private double resultReal;
    public int soma(int n1,int n2) {
        this.resultInt=n1+n2;
        return this.resultInt;
    }
    public int subtracao(int n1,int n2) {
        this.resultInt=n1-n2;
        return this.resultInt;
    }
    public int divisao(int n1,int n2) {
        this.resultInt=n1/n2;
        return this.resultInt;
    }
    public int multipicacao(int n1,int n2) {
        this.resultInt=n1*n2;
        return this.resultInt;
    }
    public double soma(double n1,double n2) {
        this.resultReal=n1+n2;
        return this.resultReal;
    }
    public double subtracao(double n1,double n2) {
        this.resultReal=n1-n2;
        return this.resultReal;
    }
    public double divisao(double n1,double n2) {
        this.resultReal=n1/n2;
        return this.resultReal;
    }
    public double multipicacao(double n1,double n2) {
        this.resultReal=n1*n2;
        return this.resultReal;
    }
    public int getResultadoInt() {
        return resultInt;
    }
    public void setResultadoInt(int resultadoInt) {
        this.resultInt = resultadoInt;
    }
    public double getResultReal() {
        return resultReal;
    }
    public void setResultReal(double resultReal) {
        this.resultReal = resultReal;
    }
    
}
