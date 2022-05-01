package P2.Questão3;

public class ElementoQuimico implements Comparable<ElementoQuimico> {
    static final ElementoQuimico hidrogenio=new ElementoQuimico("Hidrogenio", "H", 1, 2.20);
    static final ElementoQuimico oxigenio=new ElementoQuimico("Oxigenio", "O", 8, 3.44);
    static final ElementoQuimico potassio=new ElementoQuimico("Potaassio", "K", 19, 0.82);
    static final ElementoQuimico zinco=new ElementoQuimico("Zinco", "Zn", 30, 1.65);
    static final ElementoQuimico galio=new ElementoQuimico("Galio", "Ga", 31, 1.81);
    
    private final String nome;
    private final String simbolo;
    private final int  numeroAtomico;
    private final double eletro;
    private final TipoMetal tipo;
    
    public ElementoQuimico(String nome, String simbolo, int numeroAtomico, double eletro) {
        this.nome=nome;
        this.simbolo=simbolo;
        this.numeroAtomico = numeroAtomico;
        this.eletro=eletro;
        this.tipo = setTransiçao(numeroAtomico);
    } 
    public TipoMetal setTransiçao(int numeroAtomico) {
        if ((21<=numeroAtomico&& numeroAtomico<=31)||
        (39<= numeroAtomico&&numeroAtomico <=48)||
        (72<= numeroAtomico&&numeroAtomico <=80)||
        (104<= numeroAtomico&&numeroAtomico <=112)) {
            return TipoMetal.TRANSIÇÃO;
        }
        else{
            return setAlcalino(numeroAtomico);
        }
      }
    public TipoMetal setAlcalino(int numeroAtomico) {
        switch (numeroAtomico) {
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
                return TipoMetal.ALCALINO;
            default:
                return  setMetal(numeroAtomico);
                
        }
      }
     
    public TipoMetal setMetal(int numeroAtomico) {
       TipoMetal a= (numeroAtomico==13||numeroAtomico==49||numeroAtomico==50||numeroAtomico==81
       ||numeroAtomico==82||numeroAtomico==83||numeroAtomico==113||numeroAtomico==114
       ||numeroAtomico==115||numeroAtomico==116 )? TipoMetal.METAL:TipoMetal.AMETAL;
       return a;
    }
    
    public TipoMetal getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public int getNumeroAtomico() {
        return numeroAtomico;
    }
    public double getEletro() {
        return eletro;
    }
   
    @Override
    public int compareTo(ElementoQuimico o){
        if (o.getEletro()>this.eletro) {
            return -1;
        }else if (o.getEletro()<this.eletro) {
            return 1;
        }else{
            return 0;
        }
        
    }
    public String toString(){
        return this.nome ;
    }
}
