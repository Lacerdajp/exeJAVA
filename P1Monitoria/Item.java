package P1Monitoria;

public abstract class Item {
    private final String nome;
    private final int forca;
    private final int inteligencia;
    private final int vida;
    public Item(String nome, int forca, int inteligencia, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.vida = vida;
    }
    public String getNome() {
        return nome;
    }
    public int getForca() {
        return forca;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public int getVida() {
        return vida;
    }


    
    
}
