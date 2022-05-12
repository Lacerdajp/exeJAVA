package PO;

public abstract class Forma {
    String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getVal1() {
        return val1;
    }
    public void setVal1(double val1) {
        this.val1 = val1;
    }
    public double getVal2() {
        return val2;
    }
    public void setVal2(double val2) {
        this.val2 = val2;
    }
    double val1;
    double val2;
    public double area() {
        
        return 0.0;
    }
    public double perimetro() {
        
        return 0.0;
    }
    public void imprime() {
        
        System.out.println("Area: "+area()+" Perimetro: "+ perimetro());
    }


}
