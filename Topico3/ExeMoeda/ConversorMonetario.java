package Topico3.ExeMoeda;

public class ConversorMonetario {
    Moeda moeda;
    

    public ConversorMonetario(double valor,TipoMonetario tipo) {
        this.moeda.setValor(valor);
        this.moeda.setTipo(tipo);
    }


    public Moeda converter(Moeda valorAtual,TipoMonetario novoTipo) {
        this.moeda.valor=valorAtual.getValor()*valorAtual.getTipo().getValor();
        this.moeda.valor=this.moeda.getValor()/novoTipo.getValor();
        this.moeda.tipo=novoTipo;
        return this.moeda;
    }
    
}
