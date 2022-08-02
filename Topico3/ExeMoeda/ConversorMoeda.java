package Topico3.ExeMoeda;

public class ConversorMoeda {

    
    public Moeda converter(Moeda valorAtual, TipoMonetario tipo){
        Moeda moedinha=new Moeda();
        
        moedinha.setValor(valorAtual.getValor()*valorAtual.getTipo().getCota());
        moedinha.setValor(moedinha.getValor()/tipo.getCota());
        moedinha.setTipo(tipo);
        return moedinha;
    }
}
