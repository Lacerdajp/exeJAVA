package Topico3.ExeIMC;

public class IMC {
    double imc;
    public void calculoIMC(double altura,double massa) {
        this.imc=massa/(altura*altura);
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
}
