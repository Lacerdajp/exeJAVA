package P1Monitoria;

public class Fase {
    private final String nome;
    private  int dificuldade;
    private final int numPersonagem;
    public Fase(String nome,int numPersonagem) {
        this.nome = nome;
        this.numPersonagem=numPersonagem;
    }
    
    public void definirDificuldade(){
        this.dificuldade=1+this.numPersonagem;
        if (dificuldade>=5) {
            this.dificuldade=5;
        }
    }

    

    public String getNome() {
        return nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getNumPersonagem() {
        return numPersonagem;
    }


    

}
