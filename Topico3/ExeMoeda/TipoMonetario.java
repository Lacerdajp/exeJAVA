package Topico3.ExeMoeda;

public enum TipoMonetario {
    real(1.00), dolar(1.82), euro(2.39);
    double  cota;
    TipoMonetario(double cota){
        this.cota=cota;
    }
    public double getCota() {
        return cota;
    }
    public void setCota(double cota) {
        this.cota = cota;
    }
}
