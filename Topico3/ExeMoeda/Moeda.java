package Topico3.ExeMoeda;

public class Moeda {
    double valor;
    TipoMonetario tipo;
    public Moeda(double valor, TipoMonetario tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public TipoMonetario getTipo() {
        return tipo;
    }
    public void setTipo(TipoMonetario tipo) {
        this.tipo = tipo;
    }
}
