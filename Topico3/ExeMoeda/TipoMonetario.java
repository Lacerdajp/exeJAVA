package Topico3.ExeMoeda;

public enum TipoMonetario {
    Real(1),Dolar(1.82),Euro(2.39), Inexistente(0);
    double valor;
    TipoMonetario(double valor){
        this.valor=valor;
    }
    public double getValor() {
        return valor;
    }
    public TipoMonetario classificacao(String nome ) {
        switch (nome) {
            case "Real":
                return TipoMonetario.Real;       
            case "Euro":
                return TipoMonetario.Euro;
            case "Dolar":
                return TipoMonetario.Dolar;
            default:
                return TipoMonetario.Inexistente;
        }
    }

}
