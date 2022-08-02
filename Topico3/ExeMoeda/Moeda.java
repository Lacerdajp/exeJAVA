package Topico3.ExeMoeda;

public class Moeda {
    private double valor;
    private TipoMonetario tipo;
    
    
    public Moeda() {
    }

    public Moeda(double valor, TipoMonetario tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public TipoMonetario getTipo() {
        return tipo;
    }

    public void setTipo(TipoMonetario tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
