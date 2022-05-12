package PO;

public class Retangulo extends Forma {
    private double largura;
    private double comprimento;
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    @Override
    public double area() {
        return getComprimento()*getLargura();
    }
    @Override
    public double perimetro() {
        return (getComprimento()*2)+(getLargura()*2);
    }
    @Override
    public double getVal1() {
        return getLargura();
    }
    @Override
    public double getVal2() {
        return getComprimento();
    }
    
}
