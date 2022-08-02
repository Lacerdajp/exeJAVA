package Topico2.ExeVendas;

public class Venda {
    private int mes;
    private double valor;
    public int getMes() {
        return mes;
    }
    public Venda(int mes, double valor) {
        this.mes = mes;
        this.valor = valor;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
